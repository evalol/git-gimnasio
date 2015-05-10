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
public class ModeloTablaClientes extends DefaultTableModel{
    
    Clientes[] clientes;
    int filas;

    @Override
    public int getRowCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getColumnName(int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        Object restore = null;
        
            if(this.getRowCount() != 0){
                if(clientes.length > 0){
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
