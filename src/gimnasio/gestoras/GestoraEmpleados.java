/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gimnasio.gestoras;

import datos.Clientes;
import datos.Empleados;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Eva
 */
public class GestoraEmpleados {

    public static void guardarEmpleados(Empleados empleado) {
        Gestora.getInstance().save(empleado);
    }

    public static void actualizarEmpleados(Empleados empleado) {
        Gestora.getInstance().update(empleado);
    }

    public static void borrarEmpleado(Empleados empleado) {
        Gestora.getInstance().delete(empleado);
    }

    public static List<Empleados> recuperarEmpleados() {
        return Gestora.getInstance().<Empleados>recuperarObjetos(Empleados.class);
    }

    public static List<Empleados> recuperarEmpleados(String ordenar) {
        return Gestora.getInstance().<Empleados>recuperarObjetos(Empleados.class, ordenar);
    }

    public static Empleados getEmpleadoPorId(Serializable id) {
        return (Empleados) Gestora.getInstance().getObjectById(Empleados.class, id);
    }
}
