/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gimnasio.gestoras;

import datos.Actividades;

/**
 *
 * @author Eva
 */
public class GestoraActividades {
    public static void guardarActividades(Actividades actividad){
       Gestora.getInstance().save(actividad);
    }
}
