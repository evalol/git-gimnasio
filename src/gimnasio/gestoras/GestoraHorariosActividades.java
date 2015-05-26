/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gimnasio.gestoras;

import datos.HorariosActividades;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Eva
 */
public class GestoraHorariosActividades {

    public static void guardarHorarioActividad(HorariosActividades horarioActividad) {
        Gestora.getInstance().save(horarioActividad);
    }

    public static void actualizarActividades(HorariosActividades horarioActividad) {
        Gestora.getInstance().update(horarioActividad);
    }

    public static void borrarActividades(HorariosActividades horarioActividad) {
        Gestora.getInstance().delete(horarioActividad);
    }

    public static List<HorariosActividades> recuperarActividades() {
        return Gestora.getInstance().<HorariosActividades>recuperarObjetos(HorariosActividades.class);
    }

    public static List<HorariosActividades> recuperarHorariosActividades(String ordenar) {
        return Gestora.getInstance().<HorariosActividades>recuperarObjetos(HorariosActividades.class, ordenar);
    }

    public static HorariosActividades getHorariosActividadPorId(Serializable id) {
        return (HorariosActividades) Gestora.getInstance().getObjectById(HorariosActividades.class, id);
    }
}
