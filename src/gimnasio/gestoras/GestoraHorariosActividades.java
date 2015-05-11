/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gimnasio.gestoras;

import datos.HorariosActividades;

/**
 *
 * @author Eva
 */
public class GestoraHorariosActividades {
    public static void guardarHorarioActividad(HorariosActividades horarioActividad){
       Gestora.getInstance().save(horarioActividad);
    }
}
