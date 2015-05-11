/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gimnasio.gestoras;

import datos.Tarifas;

/**
 *
 * @author Eva
 */
public class GestoraTarifas {
    
     public static void guardarTarifa(Tarifas tarifa){
       Gestora.getInstance().save(tarifa);
    }
    
}
