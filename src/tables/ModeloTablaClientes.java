/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tables;

import datos.Clientes;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Eva Maria de Vena
 */
public class ModeloTablaClientes extends DefaultTableModel {

    Clientes[] clientes;
    int filas;
    String[] nombres = {"Id", "Nombre", "Apellidos", "DNI", "Teléfono fijo",
        "Teléfono móvil", "Dirección", "Código postal", "Localidad", "Provincia",
        "Fecha de nacimiento", "Cuenta bancaria", "Email", "Fecha alta",
        "Tarifa", "Forma de pago", "Empleado"};
    Class[] clases = {Integer.class, String.class, String.class, String.class, String.class,
        String.class, String.class, String.class, String.class, String.class,
        Date.class, String.class, String.class, String.class,
        String.class, String.class, String.class};

    public ModeloTablaClientes(Clientes[] clientes) {
        this.clientes = clientes;
        this.filas = clientes.length;
    }

    public ModeloTablaClientes(List<Clientes> clientes) {
        this.clientes = clientes.toArray(new Clientes[clientes.size()]);
        this.filas = clientes.size();
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
            if (clientes.length > 0) {
                switch (columnIndex) {
                    case 0: {
                        devolver = clientes[rowIndex].getIdCliente();
                    }
                    break;
                    case 1: {
                        devolver = clientes[rowIndex].getNombreCliente();
                    }
                    break;
                    case 2: {
                        devolver = clientes[rowIndex].getApellidosCliente();
                    }
                    break;
                    case 3: {
                        devolver = clientes[rowIndex].getDniCliente();
                    }
                    break;
                    case 4: {
                        devolver = clientes[rowIndex].getTelefonoCliente();
                    }
                    break;
                    case 5: {
                        devolver = clientes[rowIndex].getTelefonomovilCliente();
                    }
                    break;
                    case 6: {
                        devolver = clientes[rowIndex].getDirecciondomicilioCliente()+ " "
                                + clientes[rowIndex].getNumerodomicilioCliente()+ " "
                                + clientes[rowIndex].getPisodomicilioCliente();
                    }
                    break;
                    case 7: {
                        devolver = clientes[rowIndex].getCodigopostalCliente();
                    }
                    break;
                    case 8: {
                        devolver = clientes[rowIndex].getLocalidadCliente();
                    }
                    break;
                    case 9: {
                        devolver = clientes[rowIndex].getProvinciaCliente();
                    }
                    break;
                    case 10: {
                        devolver = clientes[rowIndex].getFechanacimientoCliente();
                    }
                    break;
                    case 11: {
                        devolver = clientes[rowIndex].getCuentabancariaCliente();
                    }
                    break;
                    case 12: {
                        devolver = clientes[rowIndex].getEmailCliente();
                    }
                    break;
                    case 13: {
                        devolver = clientes[rowIndex].getAltaCliente();
                    }
                    break;
                    case 14: {
                        devolver = clientes[rowIndex].getIdtarifaCliente();
                    }
                    break;
                    case 15: {
                        devolver = clientes[rowIndex].getFormapagoCliente();
                    }
                    break;
                    case 16: {
                        devolver = clientes[rowIndex].getDniCliente();
                    }
                    break;
                }
            }
        }
        return devolver;
    }
}
