/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gimnasio.gestoras;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import gimnasio.HibernateUtil;
import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author Eva
 */
public class Gestora {

    /** 
     * La única gestora
     */
    private static final Gestora INSTANCE = new Gestora();

    private final SessionFactory sesion;

    /**
     * Inicializa la gestora y la SessionFactory de Hibernate
     */
    private Gestora() {
        sesion = HibernateUtil.getSessionFactory();
    }

    /**
     * Se usa para obtener la gestora
     *
     * @return La instance de la Gestora
     */
    public static Gestora getInstance() {
        return Gestora.INSTANCE;
    }

    /**
     * Guarda un objeto
     *
     * @param o El objeto a guardar
     */
    public void save(Object o) {

        Session s = sesion.openSession();
        Transaction transaction = s.beginTransaction();
        s.save(o);
        transaction.commit();
        s.close();
    }

    /**
     * Actualiza un objeto
     *
     * @param o El objeto para actualizar
     */
    public void update(Object o) {

        Session s = sesion.openSession();
        Transaction transaction = s.beginTransaction();
        s.update(o);
        transaction.commit();
        s.close();
    }

    /**
     * Borra un objeto
     *
     * @param o El objeto a borrar
     */
    public void delete(Object o) {

        Session s = sesion.openSession();
        Transaction transaction = s.beginTransaction();
        s.delete(o);
        transaction.commit();
        s.close();
    }

    /**
     * Recupera una objeto de una clase a partir de un id
     *
     * @param clase La clase del objeto
     * @param serializable El id
     * @return El objeto recuperado o null
     */
    public Object getObjectById(Class clase, Serializable serializable) {

        Session s = sesion.openSession();
        Object devolver = s.get(clase, serializable);
        s.close();
        return devolver;
    }

    /**
     * Ejecuta una consulta en la base de datos
     *
     * @param consulta La consulta a ejecutar
     * @return El resultado de la consulta
     */
    public List<Object> ejecutarConsulta(String consulta) {

        Session s = sesion.openSession();
        List<Object> devolver = s.createQuery(consulta).list();
        s.close();
        return devolver;
    }

    /**
     * Ejecuta una consulta con un solo resultado
     *
     * @param consulta La consulta a ejecutar
     * @return El resultado o null
     */
    public Object ejecutarConsultaUnResultado(String consulta) {

        Session s = sesion.openSession();
        Object devolver = s.createQuery(consulta).uniqueResult();
        s.close();
        return devolver;
    }

    //TODO:  Método delete parecido a save
    public static Date fechaActual() {
        return new GregorianCalendar().getTime();
    }

    //T es cualquier clase que le pase
    /**
     * ESte método se usa para recuperar todos los objetos de una clase. Hace
     * uso de Java Generics
     *
     * @param <T> El nombre de la clase
     * @param clase La clase
     * @return Una lista de objetos de esa clase
     */
    public <T> List<T> recuperarObjetos(Class<T> clase) {
        Session s = sesion.openSession();
        List<T> objeto = s.createQuery("from " + clase.getSimpleName()).list();
        return objeto;
    }

    /**
     * ESte método se usa para recuperar todos los objetos de una clase
     * ordenados como se indique. Hace uso de Java Generics.
     *
     * @param <T> El nombre de la clase
     * @param clase La clase
     * @param ordenar El nombre del campo por el que se ordena
     * @return Una lista de objetos de esa clase
     */
    public <T> List<T> recuperarObjetos(Class<T> clase, String ordenar) {
        Session s = sesion.openSession();
        List<T> objeto = s.createQuery("from " + clase.getSimpleName() + " t order by t." + ordenar).list();
        return objeto;
    }

    public void recuperarId() {

    }
}
