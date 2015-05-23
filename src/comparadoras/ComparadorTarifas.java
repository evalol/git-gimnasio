/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparadoras;

import datos.Tarifas;
import java.text.Collator;
import java.util.Comparator;

/**
 *
 * @author Eva
 */
public class ComparadorTarifas implements Comparator<Tarifas> {

    @Override
    public int compare(Tarifas o1, Tarifas o2) {

        Collator orden = Collator.getInstance();
        orden.setStrength(Collator.PRIMARY);

        return orden.compare(o1.getIdTarifa(), o2.getIdTarifa());
    }

}
