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
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

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
    
    public void getEdad(Date fechaNacimiento){
       
    }

    //TODO:  Método delete parecido a save
    
    public static String fechaActual(){
        
        Calendar fecha = new GregorianCalendar();
        
        int año = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        
        return año + "" + mes + "" + dia;
    }
}