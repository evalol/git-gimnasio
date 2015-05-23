/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparadoras;

import datos.Empleados;
import java.text.Collator;
import java.util.Comparator;

/**
 *
 * @author Eva
 */
public class ComparadorEmpleados implements Comparator<Empleados> {

    public ComparadorEmpleados() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compare(Empleados o1, Empleados o2) {

        Collator orden = Collator.getInstance();
        orden.setStrength(Collator.PRIMARY);

        return orden.compare(o1.getIdEmpleado(), o2.getIdEmpleado());
    }

}
