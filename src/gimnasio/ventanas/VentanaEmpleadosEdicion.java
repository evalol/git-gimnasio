/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gimnasio.ventanas;

import datos.Empleados;
import gimnasio.gestoras.GestoraEmpleados;

/**
 *
 * @author Eva
 */
public final class VentanaEmpleadosEdicion extends javax.swing.JDialog {

    Empleados empleado;

    /**
     * Creates new form VentanaEmpleadosEdicion
     */
    public VentanaEmpleadosEdicion(java.awt.Frame parent, boolean modal, int id) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        VentanaUtils.limpiarFormulario(jPanel1);
        empleado = GestoraEmpleados.getEmpleadoPorId(id);
        mostrarDatos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        tx_nuevo_codigo_postal = new javax.swing.JTextField();
        tx_nuevo_provincia = new javax.swing.JTextField();
        tx_nuevo_localidad = new javax.swing.JTextField();
        tx_ventana_empleados_numero = new javax.swing.JTextField();
        tx_ventana_empleados_piso = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tx_ventana_empleados_direccion = new javax.swing.JTextField();
        cb_ventana_empleados_fecha_nac = new com.toedter.calendar.JDateChooser();
        tx_ventana_empleados_dni = new javax.swing.JTextField();
        tx_ventana_empleados_apellido = new javax.swing.JTextField();
        tx_ventana_empleados_nombre = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        botonLimpiarVentana = new javax.swing.JButton();
        botonEditar = new javax.swing.JButton();
        tx_nuevo_suplemento_sueldo = new javax.swing.JTextField();
        tx_nuevo_sueldo = new javax.swing.JTextField();
        tx_ventana_empleados_movil = new javax.swing.JTextField();
        tx_ventana_empleados_telefono = new javax.swing.JTextField();
        tx_ventana_empleados_email = new javax.swing.JTextField();
        txNuevoCuentaBancaria = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txContraseñaNueva = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nombre empleado:");

        jLabel2.setText("Apellido empleado:");

        jLabel3.setText("DNI empleado:");

        jLabel4.setText("Fecha de nacimiento:");

        jLabel6.setText("Direccion:");

        jLabel7.setText("Numero:");

        jLabel13.setText("Localidad:");

        jLabel14.setText("Provincia");

        jLabel17.setText("Código postal:");

        tx_nuevo_codigo_postal.setText("jTextField1");

        tx_nuevo_provincia.setText("jTextField1");

        tx_nuevo_localidad.setText("jTextField1");

        tx_ventana_empleados_numero.setText("jTextField5");

        tx_ventana_empleados_piso.setText("jTextField6");

        jLabel8.setText("Piso:");

        tx_ventana_empleados_direccion.setText("jTextField4");

        tx_ventana_empleados_dni.setText("jTextField1");

        tx_ventana_empleados_apellido.setText("jTextField1");

        tx_ventana_empleados_nombre.setText("jTextField1");

        jLabel11.setText("Cuenta bancaria:");

        jLabel12.setText("Email:");

        jLabel9.setText("Numero de telefono:");

        jLabel10.setText("Numero de movil:");

        jLabel15.setText("Sueldo mensual:");

        jLabel16.setText("Suplemento sueldo:");

        botonLimpiarVentana.setText("Limpiar formulario");
        botonLimpiarVentana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarVentanaActionPerformed(evt);
            }
        });

        botonEditar.setText("Editar empleado");
        botonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarActionPerformed(evt);
            }
        });

        tx_nuevo_suplemento_sueldo.setText("jTextField2");

        tx_nuevo_sueldo.setText("jTextField1");

        tx_ventana_empleados_movil.setText("jTextField8");

        tx_ventana_empleados_telefono.setText("jTextField7");

        tx_ventana_empleados_email.setText("jTextField10");

        txNuevoCuentaBancaria.setText("jTextField9");

        jLabel18.setText("Contraseña:");

        txContraseñaNueva.setText("jTextField1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel17)
                    .addComponent(jLabel6))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tx_ventana_empleados_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tx_nuevo_codigo_postal, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tx_nuevo_provincia, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                        .addComponent(txContraseñaNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel13)
                        .addComponent(jLabel7))
                    .addGap(28, 28, 28)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tx_ventana_empleados_nombre)
                        .addComponent(tx_ventana_empleados_apellido)
                        .addComponent(tx_ventana_empleados_dni)
                        .addComponent(cb_ventana_empleados_fecha_nac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(tx_ventana_empleados_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel8)
                            .addGap(18, 18, 18)
                            .addComponent(tx_ventana_empleados_piso, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(tx_nuevo_localidad))
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
                            .addComponent(botonLimpiarVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(tx_ventana_empleados_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tx_ventana_empleados_movil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tx_nuevo_sueldo, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                                    .addComponent(tx_nuevo_suplemento_sueldo)))))
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(165, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(tx_ventana_empleados_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(120, 120, 120)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tx_nuevo_provincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txContraseñaNueva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tx_nuevo_codigo_postal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(55, 55, 55))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
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
                            .addGap(150, 150, 150))
                        .addGroup(jPanel1Layout.createSequentialGroup()
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
                                .addComponent(jLabel15)
                                .addComponent(tx_nuevo_sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(tx_ventana_empleados_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)
                                .addComponent(tx_ventana_empleados_piso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel16)
                                .addComponent(tx_nuevo_suplemento_sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel13)
                                .addComponent(tx_nuevo_localidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonLimpiarVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonLimpiarVentanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarVentanaActionPerformed
        VentanaUtils.limpiarFormulario(jPanel1);
    }//GEN-LAST:event_botonLimpiarVentanaActionPerformed

    private void botonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarActionPerformed


    }//GEN-LAST:event_botonEditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEditar;
    private javax.swing.JButton botonLimpiarVentana;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
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

    public void editarEmpleado() {
        
        empleado.setNombreEmpleado(tx_ventana_empleados_nombre.getText());
        empleado.setApellidosEmpleado(tx_ventana_empleados_apellido.getText());
        empleado.setDniEmpleado(tx_ventana_empleados_dni.getText());
        empleado.setEmailEmpleado(tx_ventana_empleados_email.getText());
        empleado.setTelefonoEmpleado(tx_ventana_empleados_telefono.getText());
        empleado.setMovilEmpleado(tx_ventana_empleados_movil.getText());
        empleado.setCuentaBancariaEmpleado(txNuevoCuentaBancaria.getText());
        empleado.setFechaNacEmpleado(cb_ventana_empleados_fecha_nac.getDate());
        empleado.setSueldoMesEmpleado(Integer.parseInt(tx_nuevo_sueldo.getText()));
        empleado.setSuplementoSueldoEmpleado(Integer.parseInt(tx_nuevo_suplemento_sueldo.getText()));
        empleado.setDireccionEmpleado(tx_ventana_empleados_direccion.getText());
        empleado.setPisoEmpleado(tx_ventana_empleados_piso.getText());
        empleado.setNumeroEmpleado(tx_ventana_empleados_numero.getText());
        empleado.setCodigoPostalEmpleado(Integer.parseInt(tx_nuevo_codigo_postal.getText()));
        empleado.setProvinciaEmpleado(tx_nuevo_provincia.getText());
        empleado.setLocalidadEmpleado(tx_nuevo_localidad.getText());
        empleado.setContrasenaEmpleado(txContraseñaNueva.getText());

        GestoraEmpleados.actualizarEmpleados(empleado);
    }
    
    
    public void mostrarDatos(){
        
        tx_ventana_empleados_nombre.setText(empleado.getNombreEmpleado());
        tx_ventana_empleados_apellido.setText(empleado.getApellidosEmpleado());
        tx_ventana_empleados_dni.setText(empleado.getDniEmpleado());
        tx_ventana_empleados_email.setText(empleado.getEmailEmpleado());
        tx_ventana_empleados_telefono.setText(empleado.getTelefonoEmpleado());
        tx_ventana_empleados_movil.setText(empleado.getMovilEmpleado());
        txNuevoCuentaBancaria.setText(empleado.getCuentaBancariaEmpleado());
        cb_ventana_empleados_fecha_nac.setDate(empleado.getFechaNacEmpleado());
        tx_nuevo_sueldo.setText(empleado.getSueldoMesEmpleado().toString());
        tx_nuevo_suplemento_sueldo.setText(empleado.getSuplementoSueldoEmpleado().toString());
        tx_ventana_empleados_direccion.setText(empleado.getDireccionEmpleado());
        tx_ventana_empleados_piso.setText(empleado.getPisoEmpleado());
        tx_ventana_empleados_numero.setText(empleado.getNumeroEmpleado());
        tx_nuevo_codigo_postal.setText(empleado.getCodigoPostalEmpleado().toString());
        tx_nuevo_provincia.setText(empleado.getProvinciaEmpleado());
        tx_nuevo_localidad.setText(empleado.getLocalidadEmpleado());
        txContraseñaNueva.setText(empleado.getContrasenaEmpleado());
    }

}
