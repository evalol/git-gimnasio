/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tables;

import datos.Tarifas;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Eva
 */
public class ModeloTablaTarifas extends DefaultTableModel {

    Tarifas[] tarifas;
    int filas;
    String[] nombres = {"Nombre", "Edad mínima", "Edad máxima", "Cuota"};
    Class[] clases = {String.class, Integer.class, Integer.class, Integer.class};

    public ModeloTablaTarifas(Tarifas[] tarifas) {
        this.tarifas = tarifas;
        this.filas = tarifas.length;
    }
    
    public ModeloTablaTarifas(List<Tarifas> tarifas) {
        this.tarifas = tarifas.toArray(new Tarifas[tarifas.size()]);
        this.filas = tarifas.size();
    }
        
    @Override
    public int getRowCount() {
        return filas;
    }

    @Override
    public int getColumnCount() {
        return 4;
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
            if (tarifas.length > 0) {
                switch (columnIndex) {
                    case 0: {
                        devolver = tarifas[rowIndex].getNombreTarifa();
                    }
                    break;
                    case 1: {
                        devolver = tarifas[rowIndex].getEdadMinimaTarifa();
                    }
                    break;
                    case 2: {
                        devolver = tarifas[rowIndex].getEdadMaximaTarifa();
                    }
                    break;
                    case 3: {
                        devolver = tarifas[rowIndex].getPrecioTarifa();
                    }
                    break;
                }
            }
        }
        return devolver;
    }

}
