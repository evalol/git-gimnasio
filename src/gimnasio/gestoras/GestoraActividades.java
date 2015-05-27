/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gimnasio.gestoras;

import datos.Actividades;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Eva
 */
public class GestoraActividades {
    
    public static void guardarActividades(Actividades actividad){
       Gestora.getInstance().save(actividad);
    }
    
    public static void actualizarActividades(Actividades actividad) {
        Gestora.getInstance().update(actividad);
    }
    
    public static void borrarActividades(Actividades actividad) {
        Gestora.getInstance().delete(actividad);
    }
    
    public static List<Actividades> recuperarActividades() {
        return Gestora.getInstance().<Actividades>recuperarObjetos(Actividades.class);
    }

    public static List<Actividades> recuperarActividades(String ordenar) {
        return Gestora.getInstance().<Actividades>recuperarObjetos(Actividades.class, ordenar);
    }

    public static Actividades getActividadPorId(Serializable id) {
        return (Actividades) Gestora.getInstance().getObjectById(Actividades.class, id);
    }
}
