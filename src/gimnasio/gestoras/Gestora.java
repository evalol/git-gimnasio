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
 * @author Edwinem
 */
public class Gestora {
    
    private static final Gestora INSTANCE = new Gestora();
    
    private final SessionFactory sesion;
    
    private Gestora() {
        sesion = HibernateUtil.getSessionFactory();
    }
    
    public static Gestora getInstance() {
        return Gestora.INSTANCE;
    }
    
    public void save(Object o){
        
        Session s = sesion.openSession();
        Transaction transaction = s.beginTransaction();
        s.save(o);
        transaction.commit();
        s.close();
    }
    
    public void update(Object o){
        
        Session s = sesion.openSession();
        Transaction transaction = s.beginTransaction();
        s.update(o);
        transaction.commit();
        s.close();
    }
    
    public Object getObjectById(Class clase, Serializable serializable){
        
        Session s = sesion.openSession();        
        Object devolver = s.get(clase, serializable);
        s.close();
        return devolver;
    }
    
    public void getEdad(Date fechaNacimiento){
      
    }

    //TODO:  Método delete parecido a save
    
    public static Date fechaActual(){        
        return new GregorianCalendar().getTime();
    }
    //T es cualquier clase que le pase
    public <T> List<T> recuperarObjetos(Class<T> clase){
        Session s = sesion.openSession();
        List<T> objeto = s.createQuery("from " + clase.getSimpleName()).list();
        return objeto;
    }
    
    public <T> List<T> recuperarObjetos(Class<T> clase, String ordenar){
        Session s = sesion.openSession();
        List<T> objeto = s.createQuery("from " + clase.getSimpleName() + " t order by t." + ordenar).list();
        return objeto;
    }
    
    public void recuperarId(){
        
    }
}