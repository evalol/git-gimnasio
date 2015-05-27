/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tables;

import datos.Actividades;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Eva Maria de Vena
 */
public class ModeloTablaActividades extends DefaultTableModel {

    private Actividades[] actividades;
    private int filas;
    String[] nombres = {"Id", "Nombre", "Empleado responsable"};
    Class[] clases = {Integer.class, String.class, Integer.class, Integer.class};

    public ModeloTablaActividades(Actividades[] actividades) {
        this.actividades = actividades;
        this.filas = actividades.length;
    }

    public ModeloTablaActividades(List<Actividades> actividades) {
        this.actividades = actividades.toArray(new Actividades[actividades.size()]);
        this.filas = actividades.size();
    }

    @Override
    public int getRowCount() {
        return filas;
    }

    @Override
    public int getColumnCount() {
        return 3;
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
            if (actividades.length > 0) {
                switch (columnIndex) {
                    case 0: {
                        devolver = actividades[rowIndex].getIdActividad();
                    }
                    break;
                    case 1: {
                        devolver = actividades[rowIndex].getNombreActividad();
                    }
                    break;
                    case 2: {
                        devolver = actividades[rowIndex].getIdempleadoencargadoActividad();
                    }
                    break;
                }
            }
        }

        return devolver;
    }
}
