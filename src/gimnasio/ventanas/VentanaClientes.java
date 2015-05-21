/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gimnasio.ventanas;

import datos.Clientes;
import gimnasio.gestoras.Gestora;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import gimnasio.gestoras.GestoraClientes;
import gimnasio.gestoras.Patrones;
import java.awt.Frame;
import java.util.Date;

/**
 *
 * @author Eva
 */
public class VentanaClientes extends javax.swing.JDialog {
    
    GestoraClientes gestora = new GestoraClientes();

    /**
     * Creates new form Clientes
     */
    public VentanaClientes(Frame owner, boolean modal) {
        super(owner, modal);
        initComponents();
        VentanaUtils.limpiarFormulario(jPanel1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgFormaDePago = new javax.swing.ButtonGroup();
        Ventana_clientes_busqueda = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tx_ventana_clientes_nuevo_nombre = new javax.swing.JTextField();
        tx_ventana_clientes_nuevo_apellidos = new javax.swing.JTextField();
        tx_ventana_clientes_nuevo_dni = new javax.swing.JTextField();
        tx_ventana_clientes_nuevo_telefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tx_ventana_clientes_nuevo_numero_domicilio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tx_ventana_clientes_nuevo_piso_domicilio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cb_ventana_clientes_nuevo_tipo_via = new javax.swing.JComboBox();
        tx_ventana_clientes_nuevo_direccion = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tx_ventana_clientes_nuevo_telefono_movil = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        rb_ventana_clientes_nuevo_efectivo = new javax.swing.JRadioButton();
        rb_ventana_clientes_nuevo_cuenta_bancaria = new javax.swing.JRadioButton();
        b_ventana_clientes_nuevo_limpiar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        tx_ventana_clientes_nuevo_fecha_nacimiento = new com.toedter.calendar.JDateChooser();
        tx_ventana_clientes_nuevo_email = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cb_ventana_clientes_nuevo_tarifa = new javax.swing.JComboBox();
        bGuardarCliente = new javax.swing.JToggleButton();
        jLabel9 = new javax.swing.JLabel();
        tx_ventana_clientes_nuevo_cuenta_bancaria = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        tx_ventana_clientes_nuevo_codigo_postal = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        tx_ventana_clientes_nuevo_localidad = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        tx_ventana_clientes_nuevo_provincia = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_clientes = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nombre:");

        jLabel2.setText("Apellidos:");

        jLabel3.setText("Número de telefono:");

        jLabel4.setText("DNI:");

        tx_ventana_clientes_nuevo_nombre.setText("jTextField1");

        tx_ventana_clientes_nuevo_apellidos.setText("jTextField2");

        tx_ventana_clientes_nuevo_dni.setText("jTextField3");

        tx_ventana_clientes_nuevo_telefono.setText("jTextField4");
        tx_ventana_clientes_nuevo_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx_ventana_clientes_nuevo_telefonoActionPerformed(evt);
            }
        });

        jLabel5.setText("Dirección:");

        jLabel6.setText("Número:");

        tx_ventana_clientes_nuevo_numero_domicilio.setText("jTextField6");

        jLabel7.setText("Piso:");

        tx_ventana_clientes_nuevo_piso_domicilio.setText("jTextField7");

        jLabel8.setText("Tipo de vía:");

        cb_ventana_clientes_nuevo_tipo_via.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tx_ventana_clientes_nuevo_direccion.setText("jTextField9");

        jLabel13.setText("Numero de movil:");

        tx_ventana_clientes_nuevo_telefono_movil.setText("jTextField1");

        jLabel10.setText("Forma de pago:");

        jLabel11.setText("Fecha de nacimiento:");

        bgFormaDePago.add(rb_ventana_clientes_nuevo_efectivo);
        rb_ventana_clientes_nuevo_efectivo.setText("Efectivo");
        rb_ventana_clientes_nuevo_efectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_ventana_clientes_nuevo_efectivoActionPerformed(evt);
            }
        });

        bgFormaDePago.add(rb_ventana_clientes_nuevo_cuenta_bancaria);
        rb_ventana_clientes_nuevo_cuenta_bancaria.setText("Cuenta bancaria");
        rb_ventana_clientes_nuevo_cuenta_bancaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_ventana_clientes_nuevo_cuenta_bancariaActionPerformed(evt);
            }
        });

        b_ventana_clientes_nuevo_limpiar.setText("Limpiar formulario");
        b_ventana_clientes_nuevo_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_ventana_clientes_nuevo_limpiarActionPerformed(evt);
            }
        });

        jLabel12.setText("Tarifa:");

        tx_ventana_clientes_nuevo_email.setText("jTextField2");

        jLabel14.setText("Email:");

        cb_ventana_clientes_nuevo_tarifa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        bGuardarCliente.setText("Guardar");
        bGuardarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGuardarClienteActionPerformed(evt);
            }
        });

        jLabel9.setText("Cuenta bancaria:");

        tx_ventana_clientes_nuevo_cuenta_bancaria.setText("jTextField8");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11)
                    .addComponent(jLabel14)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12))
                .addGap(50, 50, 50)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tx_ventana_clientes_nuevo_email)
                    .addComponent(tx_ventana_clientes_nuevo_fecha_nacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_ventana_clientes_nuevo_tarifa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tx_ventana_clientes_nuevo_cuenta_bancaria)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(rb_ventana_clientes_nuevo_efectivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                        .addComponent(rb_ventana_clientes_nuevo_cuenta_bancaria))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(b_ventana_clientes_nuevo_limpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bGuardarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tx_ventana_clientes_nuevo_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11))
                    .addComponent(tx_ventana_clientes_nuevo_fecha_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cb_ventana_clientes_nuevo_tarifa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(rb_ventana_clientes_nuevo_efectivo)
                    .addComponent(rb_ventana_clientes_nuevo_cuenta_bancaria))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(tx_ventana_clientes_nuevo_cuenta_bancaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_ventana_clientes_nuevo_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bGuardarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        jLabel15.setText("Cógido postal:");

        tx_ventana_clientes_nuevo_codigo_postal.setText("jTextField1");
        tx_ventana_clientes_nuevo_codigo_postal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx_ventana_clientes_nuevo_codigo_postalActionPerformed(evt);
            }
        });

        jLabel16.setText("Localidad:");

        tx_ventana_clientes_nuevo_localidad.setText("jTextField1");

        jLabel17.setText("Provincia:");

        tx_ventana_clientes_nuevo_provincia.setText("jTextField1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(83, 83, 83)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tx_ventana_clientes_nuevo_telefono, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                            .addComponent(tx_ventana_clientes_nuevo_dni)
                            .addComponent(tx_ventana_clientes_nuevo_apellidos)
                            .addComponent(tx_ventana_clientes_nuevo_nombre)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel15))
                        .addGap(113, 113, 113)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tx_ventana_clientes_nuevo_direccion, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tx_ventana_clientes_nuevo_numero_domicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                                .addComponent(tx_ventana_clientes_nuevo_piso_domicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tx_ventana_clientes_nuevo_codigo_postal)
                            .addComponent(cb_ventana_clientes_nuevo_tipo_via, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel17)
                                .addComponent(jLabel16)))
                        .addGap(99, 99, 99)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tx_ventana_clientes_nuevo_telefono_movil)
                            .addComponent(tx_ventana_clientes_nuevo_localidad)
                            .addComponent(tx_ventana_clientes_nuevo_provincia))))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tx_ventana_clientes_nuevo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tx_ventana_clientes_nuevo_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(tx_ventana_clientes_nuevo_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tx_ventana_clientes_nuevo_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(1, 1, 1)))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(tx_ventana_clientes_nuevo_telefono_movil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cb_ventana_clientes_nuevo_tipo_via, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tx_ventana_clientes_nuevo_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tx_ventana_clientes_nuevo_numero_domicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(tx_ventana_clientes_nuevo_piso_domicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(tx_ventana_clientes_nuevo_codigo_postal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(tx_ventana_clientes_nuevo_localidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17)
                            .addComponent(tx_ventana_clientes_nuevo_provincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        Ventana_clientes_busqueda.addTab("Nuevo cliente", jPanel1);

        tabla_clientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabla_clientes);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        Ventana_clientes_busqueda.addTab("Lista clientes", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1049, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 435, Short.MAX_VALUE)
        );

        Ventana_clientes_busqueda.addTab("Búsquedas", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Ventana_clientes_busqueda)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Ventana_clientes_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rb_ventana_clientes_nuevo_cuenta_bancariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_ventana_clientes_nuevo_cuenta_bancariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_ventana_clientes_nuevo_cuenta_bancariaActionPerformed

    private void b_ventana_clientes_nuevo_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_ventana_clientes_nuevo_limpiarActionPerformed
        
        VentanaUtils.limpiarFormulario(jPanel1);
    }//GEN-LAST:event_b_ventana_clientes_nuevo_limpiarActionPerformed
    

    private void tx_ventana_clientes_nuevo_codigo_postalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx_ventana_clientes_nuevo_codigo_postalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx_ventana_clientes_nuevo_codigo_postalActionPerformed

    private void tx_ventana_clientes_nuevo_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx_ventana_clientes_nuevo_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx_ventana_clientes_nuevo_telefonoActionPerformed

    private void bGuardarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGuardarClienteActionPerformed
        //Clientes cliente = new Clientes(tx_ventana_clientes_nuevo_nombre.getText(), tx_ventana_clientes_nuevo_apellidos.getText(),
       //         tx_ventana_clientes_nuevo_dni.getText(), tx_ventana_clientes_nuevo_telefono.getText(),
        //        tx_ventana_clientes_nuevo_telefono_movil.getText(), tx_ventana_clientes_nuevo_direccion.getText(),
        //        tx_ventana_clientes_nuevo_piso_domicilio.getText(), tx_ventana_clientes_nuevo_numero_domicilio.getText(),
        //        tx_ventana_clientes_nuevo_codigo_postal.getText(), tx_ventana_clientes_nuevo_localidad.getText(),
        //        tx_ventana_clientes_nuevo_provincia.getText(), tx_ventana_clientes_nuevo_fecha_nacimiento.getDate(),
        //        tx_ventana_clientes_nuevo_cuenta_bancaria.getText(), tx_ventana_clientes_nuevo_email.getText(),
        //        Gestora.fechaActual(), cb_ventana_clientes_nuevo_tarifa.getSelectedItem(),
        //        //this.formaDePago(), String altaEmpleadoCliente
       // );
            
         //   GestoraClientes.guardarCliente(cliente);
    }//GEN-LAST:event_bGuardarClienteActionPerformed

    private void rb_ventana_clientes_nuevo_efectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_ventana_clientes_nuevo_efectivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_ventana_clientes_nuevo_efectivoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Ventana_clientes_busqueda;
    private javax.swing.JToggleButton bGuardarCliente;
    private javax.swing.JButton b_ventana_clientes_nuevo_limpiar;
    private javax.swing.ButtonGroup bgFormaDePago;
    private javax.swing.JComboBox cb_ventana_clientes_nuevo_tarifa;
    private javax.swing.JComboBox cb_ventana_clientes_nuevo_tipo_via;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton rb_ventana_clientes_nuevo_cuenta_bancaria;
    private javax.swing.JRadioButton rb_ventana_clientes_nuevo_efectivo;
    private javax.swing.JTable tabla_clientes;
    private javax.swing.JTextField tx_ventana_clientes_nuevo_apellidos;
    private javax.swing.JTextField tx_ventana_clientes_nuevo_codigo_postal;
    private javax.swing.JTextField tx_ventana_clientes_nuevo_cuenta_bancaria;
    private javax.swing.JTextField tx_ventana_clientes_nuevo_direccion;
    private javax.swing.JTextField tx_ventana_clientes_nuevo_dni;
    private javax.swing.JTextField tx_ventana_clientes_nuevo_email;
    private com.toedter.calendar.JDateChooser tx_ventana_clientes_nuevo_fecha_nacimiento;
    private javax.swing.JTextField tx_ventana_clientes_nuevo_localidad;
    private javax.swing.JTextField tx_ventana_clientes_nuevo_nombre;
    private javax.swing.JTextField tx_ventana_clientes_nuevo_numero_domicilio;
    private javax.swing.JTextField tx_ventana_clientes_nuevo_piso_domicilio;
    private javax.swing.JTextField tx_ventana_clientes_nuevo_provincia;
    private javax.swing.JTextField tx_ventana_clientes_nuevo_telefono;
    private javax.swing.JTextField tx_ventana_clientes_nuevo_telefono_movil;
    // End of variables declaration//GEN-END:variables

    public void inicio() {

        //Metemos la información del tipo de via dentro del combbox
        cb_ventana_clientes_nuevo_tipo_via.addItem(gestora.tipoDeVia());
        cb_ventana_clientes_nuevo_tipo_via.setModel(new DefaultComboBoxModel());
        
        tx_ventana_clientes_nuevo_cuenta_bancaria.isEnabled();
        
        if (!rb_ventana_clientes_nuevo_cuenta_bancaria.isSelected()) {
            tx_ventana_clientes_nuevo_cuenta_bancaria.isEnabled();
        }
    }
    
    public void comprobardatos() {
        
        if (!Patrones.validarCodigoPostal(tx_ventana_clientes_nuevo_codigo_postal.getText())) {
            JOptionPane.showMessageDialog(this, "El código postal introducido es incorrecto");
        }
        
        if (!Patrones.validarDni(tx_ventana_clientes_nuevo_dni.getText())) {
            JOptionPane.showMessageDialog(this, "El DNI introducido es incorrecto");
        }
        
        if (!Patrones.validarEmail(tx_ventana_clientes_nuevo_email.getText())) {
            JOptionPane.showMessageDialog(this, "El email introducido es incorrecto");
        }
        
        if (!Patrones.validarNumeroCuentaBancaria(tx_ventana_clientes_nuevo_cuenta_bancaria.getText())) {
            JOptionPane.showMessageDialog(this, "El número de cuenta bancaria introducido es incorrecto");
        }
        
        if (!Patrones.validarTelefonoMovil(tx_ventana_clientes_nuevo_telefono_movil.getText())) {
            JOptionPane.showMessageDialog(this, "El teléfono móvil introducido es incorrecto");
        }
    }
    
   
    
    
    public String formaDePago() {
        
        if (rb_ventana_clientes_nuevo_cuenta_bancaria.isSelected() == true) {
            return "Cuenta bancaria";
        }
        return "Efectivo";
    }
}