/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gimnasio.gestoras;

import datos.Actividades;
import datos.Clientes;
import java.util.List;

/**
 *
 * @author Eva
 */
public class GestoraActividades {
    
    public static void guardarActividades(Actividades actividad){
       Gestora.getInstance().save(actividad);
    }
    
    public static List<Clientes> recuperarClientes(){
         return Gestora.getInstance().<Clientes>recuperarObjetos(Clientes.class);
    }
    
    public static List<Clientes> recuperarClientes(String ordenar){
         return Gestora.getInstance().<Clientes>recuperarObjetos(Clientes.class, ordenar);
    }
}
