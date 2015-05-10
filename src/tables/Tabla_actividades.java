/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tables;

import datos.Actividades;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Eva
 */
public class Tabla_actividades extends DefaultTableModel{
    
    private Actividades[] actividades;
    private int rows;
    
    
    @Override
    public int getRowCount() {
        return rows;
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String[] rowNames = {"","","","","","","","","","","",""}; 
        return rowNames[columnIndex];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
       Class[] rowClasses =  {};
       return rowClasses[columnIndex];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        Object restore = null;
        
        if(this.getRowCount() != 0){
            if(actividades.length > 0){
                switch(columnIndex){
                    case 0:{}
                    break;
                    case 1:{}
                    break;
                    case 2:{}
                    break;
                    case 3:{}
                    break;
                    case 4:{}
                    break;
                    case 5:{}
                    break;
                    case 6:{}
                    break;
                    case 7:{}
                    break;
                    case 8:{}
                    break;
                    case 9:{}
                    break;
                    case 10:{}
                    break;
                    case 11:{}
                    break;
                }
            }
        }
        
        return restore;
    }    
}
