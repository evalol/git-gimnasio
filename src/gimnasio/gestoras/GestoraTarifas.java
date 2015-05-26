/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gimnasio.gestoras;

import datos.Clientes;
import datos.Tarifas;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Eva
 */
public class GestoraTarifas {

    public static void guardarTarifa(Tarifas tarifa) {
        Gestora.getInstance().save(tarifa);
    }

    public static void actualizarTarifas(Tarifas tarifas) {
        Gestora.getInstance().update(tarifas);
    }

    public static void borrarTarifa(Tarifas empleado) {
        Gestora.getInstance().delete(empleado);
    }

    public static List<Tarifas> recuperarTarifas() {
        return Gestora.getInstance().<Tarifas>recuperarObjetos(Tarifas.class);
    }

    public static List<Tarifas> recuperarTarifas(String ordenar) {
        return Gestora.getInstance().<Tarifas>recuperarObjetos(Tarifas.class, ordenar);
    }

    public static Tarifas getTarifaPorId(Serializable id) {
        return (Tarifas) Gestora.getInstance().getObjectById(Clientes.class, id);
    }

}
