/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tables;

import datos.Clientes;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Eva
 */
public class ModeloTablaClientes extends DefaultTableModel {

    Clientes[] clientes;
    int filas;

    public ModeloTablaClientes(Clientes[] clientes, int filas) {
        this.clientes = clientes;
        this.filas = filas;
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
        String[] nombres = {"Nombre", "Apellidos", "Dni", "Fecha de nacimiento", "", "", "",
            "", "", "", "", "", "", "", "", "", "", "", ""};
        return nombres[columnIndex];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        Class[] clase = {};
        return clase[columnIndex];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        Object devolver = null;

        if (this.getRowCount() != 0) {
            if (clientes.length > 0) {
                switch (columnIndex) {
                    case 0: {
                        devolver = clientes[rowIndex].getNombreCliente();
                    }
                    break;
                    case 1: {
                    }
                    break;
                    case 2: {
                    }
                    break;
                    case 3: {
                    }
                    break;
                    case 4: {
                    }
                    break;
                    case 5: {
                    }
                    break;
                    case 6: {
                    }
                    break;
                    case 7: {
                    }
                    break;
                    case 8: {
                    }
                    break;
                    case 9: {
                    }
                    break;
                    case 10: {
                    }
                    break;
                    case 11: {
                    }
                    break;
                }
            }
        }
        return devolver;
    }
}
