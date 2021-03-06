/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gimnasio.ventanas;

import Tables.ModeloTablaEmpleados;
import datos.Empleados;
import gimnasio.gestoras.Gestora;
import gimnasio.gestoras.GestoraEmpleados;
import gimnasio.gestoras.Login;
import gimnasio.gestoras.Patrones;
import java.awt.Frame;
import java.io.Serializable;
import javax.swing.JOptionPane;

/**
 *
 * @author Eva Maria de Vena García
 */
public class VentanaEmpleados extends javax.swing.JDialog {

    public VentanaEmpleados(Frame owner, boolean modal) {
        super(owner, modal);
        initComponents();
        tablaEmpleados.setAutoCreateRowSorter(true);
        setLocationRelativeTo(null);
        VentanaUtils.limpiarFormulario(jPanel1);
        tablaEmpleados.setModel(new ModeloTablaEmpleados(GestoraEmpleados.recuperarEmpleados()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tx_ventana_empleados_nombre = new javax.swing.JTextField();
        tx_ventana_empleados_apellido = new javax.swing.JTextField();
        tx_ventana_empleados_dni = new javax.swing.JTextField();
        cb_ventana_empleados_fecha_nac = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tx_ventana_empleados_direccion = new javax.swing.JTextField();
        tx_ventana_empleados_numero = new javax.swing.JTextField();
        tx_ventana_empleados_piso = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tx_ventana_empleados_telefono = new javax.swing.JTextField();
        tx_ventana_empleados_movil = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txNuevoCuentaBancaria = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tx_ventana_empleados_email = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        boton_ventana_empleados_agregar = new javax.swing.JButton();
        boton_ventana_empleados_limpiar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        tx_nuevo_sueldo = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        tx_nuevo_suplemento_sueldo = new javax.swing.JTextField();
        tx_nuevo_localidad = new javax.swing.JTextField();
        tx_nuevo_provincia = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        tx_nuevo_codigo_postal = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        txContraseñaNueva = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEmpleados = new javax.swing.JTable();
        botonEditarEmpleado = new javax.swing.JButton();
        botonBorrarEmpleado = new javax.swing.JButton();
        botonDetalles = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaEmpleadosConsulta = new javax.swing.JTable();

        jLabel1.setText("Nombre empleado:");

        jLabel2.setText("Apellido empleado:");

        jLabel3.setText("DNI empleado:");

        jLabel4.setText("Fecha de nacimiento:");

        tx_ventana_empleados_nombre.setText("jTextField1");

        tx_ventana_empleados_apellido.setText("jTextField1");

        tx_ventana_empleados_dni.setText("jTextField1");

        jLabel6.setText("Direccion:");

        jLabel7.setText("Numero:");

        jLabel8.setText("Piso:");

        tx_ventana_empleados_direccion.setText("jTextField4");

        tx_ventana_empleados_numero.setText("jTextField5");

        tx_ventana_empleados_piso.setText("jTextField6");

        jLabel9.setText("Numero de telefono:");

        jLabel10.setText("Numero de movil:");

        tx_ventana_empleados_telefono.setText("jTextField7");

        tx_ventana_empleados_movil.setText("jTextField8");

        jLabel11.setText("Cuenta bancaria:");

        txNuevoCuentaBancaria.setText("jTextField9");

        jLabel12.setText("Email:");

        tx_ventana_empleados_email.setText("jTextField10");

        jLabel13.setText("Localidad:");

        jLabel14.setText("Provincia");

        boton_ventana_empleados_agregar.setText("Agregar empleado");
        boton_ventana_empleados_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_ventana_empleados_agregarActionPerformed(evt);
            }
        });

        boton_ventana_empleados_limpiar.setText("Limpiar formulario");
        boton_ventana_empleados_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_ventana_empleados_limpiarActionPerformed(evt);
            }
        });

        jLabel15.setText("Sueldo mensual:");

        tx_nuevo_sueldo.setText("jTextField1");

        jLabel16.setText("Suplemento sueldo:");

        tx_nuevo_suplemento_sueldo.setText("jTextField2");

        tx_nuevo_localidad.setText("jTextField1");

        tx_nuevo_provincia.setText("jTextField1");

        jLabel17.setText("Código postal:");

        tx_nuevo_codigo_postal.setText("jTextField1");

        jLabel18.setText("Contraseña:");

        txContraseñaNueva.setText("jTextField1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel7)
                    .addComponent(jLabel17))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tx_nuevo_provincia)
                    .addComponent(tx_ventana_empleados_nombre)
                    .addComponent(tx_ventana_empleados_apellido)
                    .addComponent(tx_ventana_empleados_dni)
                    .addComponent(cb_ventana_empleados_fecha_nac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tx_ventana_empleados_direccion)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tx_ventana_empleados_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(tx_ventana_empleados_piso, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tx_nuevo_localidad)
                    .addComponent(tx_nuevo_codigo_postal))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tx_ventana_empleados_email)
                            .addComponent(txNuevoCuentaBancaria)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(boton_ventana_empleados_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boton_ventana_empleados_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txContraseñaNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(tx_ventana_empleados_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tx_ventana_empleados_movil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tx_nuevo_sueldo, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                                    .addComponent(tx_nuevo_suplemento_sueldo)))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(tx_ventana_empleados_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(tx_ventana_empleados_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(tx_ventana_empleados_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(cb_ventana_empleados_fecha_nac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(56, 56, 56)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(tx_ventana_empleados_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15)
                                    .addComponent(tx_nuevo_sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(tx_ventana_empleados_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(tx_ventana_empleados_piso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16)
                                    .addComponent(tx_nuevo_suplemento_sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(txNuevoCuentaBancaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(tx_ventana_empleados_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(tx_ventana_empleados_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(tx_ventana_empleados_movil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(112, 112, 112)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(tx_nuevo_localidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(boton_ventana_empleados_limpiar)
                                    .addComponent(boton_ventana_empleados_agregar))
                                .addGap(40, 40, 40))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel17)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tx_nuevo_provincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)
                            .addComponent(txContraseñaNueva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tx_nuevo_codigo_postal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jTabbedPane1.addTab("Nuevo empleado", jPanel1);

        tablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaEmpleados);

        botonEditarEmpleado.setText("Editar empleado");
        botonEditarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarEmpleadoActionPerformed(evt);
            }
        });

        botonBorrarEmpleado.setText("Borrar empleado");
        botonBorrarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarEmpleadoActionPerformed(evt);
            }
        });

        botonDetalles.setText("Detalles");
        botonDetalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDetallesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(botonEditarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(botonBorrarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(botonDetalles, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 878, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonEditarEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(botonBorrarEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonDetalles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Lista empleados", jPanel2);

        tablaEmpleadosConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tablaEmpleadosConsulta);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(413, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(298, 298, 298))
        );

        jTabbedPane1.addTab("Busqueda", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_ventana_empleados_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_ventana_empleados_limpiarActionPerformed
        VentanaUtils.limpiarFormulario(jPanel1);
    }//GEN-LAST:event_boton_ventana_empleados_limpiarActionPerformed

    private void boton_ventana_empleados_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_ventana_empleados_agregarActionPerformed
        insertarDatos();
    }//GEN-LAST:event_boton_ventana_empleados_agregarActionPerformed

    private void botonEditarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarEmpleadoActionPerformed
        new VentanaEmpleadosEdicion((Frame) this.getParent(), true, (int) tablaEmpleados.getValueAt(tablaEmpleados.getSelectedRow(), 0)).setVisible(true);
    }//GEN-LAST:event_botonEditarEmpleadoActionPerformed

    private void botonBorrarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarEmpleadoActionPerformed
        try {
            int resultado = JOptionPane.showConfirmDialog(this, "¿Esta seguro borrar ese empleado?", null, JOptionPane.YES_OPTION);

            if (resultado == JOptionPane.YES_OPTION) {
                GestoraEmpleados.borrarEmpleado(GestoraEmpleados.getEmpleadoPorId((Serializable) tablaEmpleados.getValueAt(tablaEmpleados.getSelectedRow(), 0)));
            } else {
                JOptionPane.showMessageDialog(this, "El empleado no se ha borrado.");
            }

            tablaEmpleados.setModel(new ModeloTablaEmpleados(GestoraEmpleados.recuperarEmpleados()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No se ha podido borrar el empleado.");
        }
    }//GEN-LAST:event_botonBorrarEmpleadoActionPerformed

    private void botonDetallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDetallesActionPerformed
        new VentanaEmpleadosDetalle((Frame) this.getParent(), true, (int) tablaEmpleados.getValueAt(tablaEmpleados.getSelectedRow(), 0)).setVisible(true);
    }//GEN-LAST:event_botonDetallesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBorrarEmpleado;
    private javax.swing.JButton botonDetalles;
    private javax.swing.JButton botonEditarEmpleado;
    private javax.swing.JButton boton_ventana_empleados_agregar;
    private javax.swing.JButton boton_ventana_empleados_limpiar;
    private com.toedter.calendar.JDateChooser cb_ventana_empleados_fecha_nac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tablaEmpleados;
    private javax.swing.JTable tablaEmpleadosConsulta;
    private javax.swing.JTextField txContraseñaNueva;
    private javax.swing.JTextField txNuevoCuentaBancaria;
    private javax.swing.JTextField tx_nuevo_codigo_postal;
    private javax.swing.JTextField tx_nuevo_localidad;
    private javax.swing.JTextField tx_nuevo_provincia;
    private javax.swing.JTextField tx_nuevo_sueldo;
    private javax.swing.JTextField tx_nuevo_suplemento_sueldo;
    private javax.swing.JTextField tx_ventana_empleados_apellido;
    private javax.swing.JTextField tx_ventana_empleados_direccion;
    private javax.swing.JTextField tx_ventana_empleados_dni;
    private javax.swing.JTextField tx_ventana_empleados_email;
    private javax.swing.JTextField tx_ventana_empleados_movil;
    private javax.swing.JTextField tx_ventana_empleados_nombre;
    private javax.swing.JTextField tx_ventana_empleados_numero;
    private javax.swing.JTextField tx_ventana_empleados_piso;
    private javax.swing.JTextField tx_ventana_empleados_telefono;
    // End of variables declaration//GEN-END:variables

    public void insertarDatos() {

        if (!Patrones.validarCodigoPostal(tx_nuevo_codigo_postal.getText())) {
            JOptionPane.showMessageDialog(this, "El código postal introducido es incorrecto");
            return;
        }

        if (!Patrones.validarDni(tx_ventana_empleados_dni.getText())) {
            JOptionPane.showMessageDialog(this, "El DNI introducido es incorrecto");
            return;
        }

        if (!Patrones.validarEmail(tx_ventana_empleados_email.getText())) {
            JOptionPane.showMessageDialog(this, "El email introducido es incorrecto");
            return;
        }

        if (!Patrones.validarTelefonoMovil(tx_ventana_empleados_movil.getText())) {
            JOptionPane.showMessageDialog(this, "El teléfono móvil introducido es incorrecto");
            return;
        }
        try {
            String nombre = tx_ventana_empleados_nombre.getText();
            String apellidos = tx_ventana_empleados_apellido.getText();
            Empleados empleado = new Empleados(nombre, apellidos,
                    tx_ventana_empleados_dni.getText(), tx_ventana_empleados_email.getText(), tx_ventana_empleados_telefono.getText(),
                    tx_ventana_empleados_movil.getText(), txNuevoCuentaBancaria.getText(), cb_ventana_empleados_fecha_nac.getDate(),
                    Gestora.fechaActual(), Integer.parseInt(tx_nuevo_sueldo.getText()), Integer.parseInt(tx_nuevo_suplemento_sueldo.getText()),
                    tx_ventana_empleados_direccion.getText(), tx_ventana_empleados_piso.getText(), tx_ventana_empleados_piso.getText(),
                    Integer.parseInt(tx_nuevo_codigo_postal.getText()), tx_nuevo_provincia.getText(), tx_nuevo_localidad.getText(),
                    Login.devuelveHash(txContraseñaNueva.getText()), nombre.substring(0, 3) + apellidos.substring(0, 3));

            GestoraEmpleados.guardarEmpleados(empleado);
            
            tablaEmpleados.setModel(new ModeloTablaEmpleados(GestoraEmpleados.recuperarEmpleados()));

            JOptionPane.showMessageDialog(this, "Se ha introducido el empleado correctamente.");
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "No se ha podido introducir el empleado.");
        }

    }

}
