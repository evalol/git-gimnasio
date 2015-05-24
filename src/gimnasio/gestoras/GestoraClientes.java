/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gimnasio.gestoras;

import datos.Clientes;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Eva
 */
public class GestoraClientes {

    public static void guardarCliente(Clientes cliente) {
        Gestora.getInstance().save(cliente);
    }

    public static void actualizarCliente(Clientes empleado) {
        Gestora.getInstance().update(empleado);
    }
    
    public static void borrarCliente(Clientes empleado) {
        Gestora.getInstance().delete(empleado);
    }

    public static List<Clientes> recuperarClientes() {
        return Gestora.getInstance().<Clientes>recuperarObjetos(Clientes.class);
    }

    public static List<Clientes> recuperarClientes(String ordenar) {
        return Gestora.getInstance().<Clientes>recuperarObjetos(Clientes.class, ordenar);
    }

    public static Clientes getClientePorId(Serializable id) {
        return (Clientes) Gestora.getInstance().getObjectById(Clientes.class, id);
    }

}
