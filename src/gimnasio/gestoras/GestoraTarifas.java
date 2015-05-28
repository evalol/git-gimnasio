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

    /**
     * Guarda una tarifa
     *
     * @param tarifa La tarifa a guardar
     */
    public static void guardarTarifa(Tarifas tarifa) {
        Gestora.getInstance().save(tarifa);
    }

    /**
     * Actualiza una tarifas
     *
     * @param tarifa La tarifa para actualizar
     */
    public static void actualizarTarifas(Tarifas tarifa) {
        Gestora.getInstance().update(tarifa);
    }

    /**
     * Borra una Tarifas
     *
     * @param tarifa La Tarifas a borrar
     */
    public static void borrarTarifa(Tarifas tarifa) {
        Gestora.getInstance().delete(tarifa);
    }

    /**
     * Recupera todas las tarifas
     *
     * @return Una lista de tarifas de esa clase
     */
    public static List<Tarifas> recuperarTarifas() {
        return Gestora.getInstance().<Tarifas>recuperarObjetos(Tarifas.class);
    }

    /**
     * Recupera todas las tarifas ordenadas
     *
     * @param ordenar El campo por el que se ordena
     * @return Una lista de tarifas de esa clase
     */
    public static List<Tarifas> recuperarTarifas(String ordenar) {
        return Gestora.getInstance().<Tarifas>recuperarObjetos(Tarifas.class, ordenar);
    }

    /**
     * Recupera una tarifa a partir de un id
     *
     * @param id El id
     * @return La tarifa recuperada o null
     */
    public static Tarifas getTarifaPorId(Serializable id) {
        return (Tarifas) Gestora.getInstance().getObjectById(Tarifas.class, id);
    }

}
