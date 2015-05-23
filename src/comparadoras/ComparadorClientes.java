/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparadoras;

import datos.Clientes;
import java.text.Collator;
import java.util.Comparator;

/**
 *
 * @author Eva
 */
public class ComparadorClientes implements Comparator<Clientes> {

    @Override
    public int compare(Clientes o1, Clientes o2) {

        Collator orden = Collator.getInstance();
        orden.setStrength(Collator.PRIMARY);

        return orden.compare(o1.getIdCliente(), o2.getIdCliente());
    }

}
