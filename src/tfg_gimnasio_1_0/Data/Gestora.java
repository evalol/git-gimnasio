/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tfg_gimnasio_1_0.Data;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import tfg_gimnasio_1_0.HibernateUtil;

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
}
