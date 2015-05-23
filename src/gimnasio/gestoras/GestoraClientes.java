/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gimnasio.gestoras;

import datos.Clientes;
import java.util.List;

/**
 *
 * @author Eva
 */
public class GestoraClientes {   
       
    // TODO Crear una tabla Via(Id, Nombre) y que se relacionen por clave ajena
    
    // ESto debería ir en Gestora.java
    //Hacer rollback y que no se termine la aplicacion tras un fallo.
    public void rollback(){
        //Session session = this.getSession();
        try {
            // deshacer transaccion
        //    session.getTransaction().rollback();
        } catch (Exception e) {
            System.out.println("Error en rollback: " + e);
        }
    }
    
    //Actualizar un objeto en la base de datos
    public boolean update(Object o){
        // obtener la sesion actual
        //Session session = getSession();
        try {
            // comenzar la transaccion
            //session.beginTransaction();
            // actualizarlo
           // session.saveOrUpdate(o);
            // confirmar transaccion
           // session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Error en update: " + e);
            // deshacer transaccion
            this.rollback();
            return false;
        }
        return true;
    }
    
    
    public static void guardarCliente(Clientes cliente){
       Gestora.getInstance().save(cliente);
    }
    
    public static List<Clientes> recuperarClientes(){
         return Gestora.getInstance().<Clientes>recuperarObjetos(Clientes.class);
    }
    
    public static List<Clientes> recuperarClientes(String ordenar){
         return Gestora.getInstance().<Clientes>recuperarObjetos(Clientes.class, ordenar);
    }
}
