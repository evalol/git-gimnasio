/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablas;

import datos.Empleados;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Eva Maria de Vena
 */
public class ModeloTablaEmpleadosConsulta extends DefaultTableModel {

    Empleados[] empleados;
    int filas;
    String[] nombres = {"Nombre", "Apellidos", "Dni",
        "Email", "Teléfono", "Móvil", "Cuenta bancaria", "Sueldo Mes", "Suplemento sueldo", "Direccion", "Codigo Postal",
        "Localidad", "Provincia"};
    Class[] clases = {String.class, String.class, String.class,
        String.class, String.class, String.class, String.class, Integer.class, Integer.class, Integer.class, String.class,
        String.class, String.class};

    public ModeloTablaEmpleadosConsulta(Empleados[] empleados) {
        this.empleados = empleados;
        this.filas = empleados.length;
    }

    public ModeloTablaEmpleadosConsulta(List<Empleados> empleados) {
        this.empleados = empleados.toArray(new Empleados[empleados.size()]);
        this.filas = empleados.size();
    }

    @Override
    public int getRowCount() {
        return filas;
    }

    @Override
    public int getColumnCount() {
        return 10;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return nombres[columnIndex];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return clases[columnIndex];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        Object devolver = null;

        if (this.getRowCount() != 0) {
            if (empleados.length > 0) {
                switch (columnIndex) {
                    case 0: {
                        devolver = empleados[rowIndex].getIdEmpleado();
                    }
                    break;
                    case 1: {
                        devolver = empleados[rowIndex].getNombreEmpleado();
                    }
                    break;
                    case 2: {
                        devolver = empleados[rowIndex].getApellidosEmpleado();
                    }
                    break;
                    case 3: {
                        devolver = empleados[rowIndex].getDniEmpleado();
                    }
                    break;
                    case 4: {
                        devolver = empleados[rowIndex].getEmailEmpleado();
                    }
                    break;
                    case 5: {
                        devolver = empleados[rowIndex].getTelefonoEmpleado();
                    }
                    break;
                    case 6: {
                        devolver = empleados[rowIndex].getMovilEmpleado();
                    }
                    break;
                    case 7: {
                        devolver = empleados[rowIndex].getCuentaBancariaEmpleado();
                    }
                    break;
                    case 8: {
                        devolver = empleados[rowIndex].getSueldomesEmpleado();
                    }
                    break;
                    case 9: {
                        devolver = empleados[rowIndex].getSuplementoSueldoEmpleado();
                    }
                    break;
                    case 10: {
                        devolver = empleados[rowIndex].getDireccionEmpleado() + " "
                                + empleados[rowIndex].getPisoEmpleado() + " "
                                + empleados[rowIndex].getNumeroEmpleado();
                    }
                    break;
                    case 11: {
                        devolver = empleados[rowIndex].getCodigopostalEmpleado();
                    }
                    break;
                    case 12: {
                        devolver = empleados[rowIndex].getLocalidadEmpleado();
                    }
                    break;
                    case 13: {
                        devolver = empleados[rowIndex].getProvinciaEmpleado();
                    }
                    break;
                }
            }
        }
        return devolver;
    }
}
