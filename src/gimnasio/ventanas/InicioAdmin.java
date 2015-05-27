/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gimnasio.ventanas;

import java.awt.Frame;

/**
 *
 * @author Eva
 */
public class InicioAdmin extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public InicioAdmin() {
        initComponents();
        setLocationRelativeTo(null);
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
        botonInicioEmpleados = new javax.swing.JButton();
        botonInicioActividades = new javax.swing.JButton();
        botonInicioTarifas = new javax.swing.JButton();
        bClientes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Inicio administrador");
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        botonInicioEmpleados.setBackground(new java.awt.Color(204, 204, 255));
        botonInicioEmpleados.setText("Empleados");
        botonInicioEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInicioEmpleadosActionPerformed(evt);
            }
        });

        botonInicioActividades.setBackground(new java.awt.Color(204, 204, 255));
        botonInicioActividades.setText("Actividades");
        botonInicioActividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInicioActividadesActionPerformed(evt);
            }
        });

        botonInicioTarifas.setBackground(new java.awt.Color(204, 204, 255));
        botonInicioTarifas.setText("Tarifas");
        botonInicioTarifas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInicioTarifasActionPerformed(evt);
            }
        });

        bClientes.setBackground(new java.awt.Color(204, 204, 255));
        bClientes.setText("Clientes");
        bClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonInicioActividades, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonInicioEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonInicioTarifas, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonInicioEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonInicioActividades, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonInicioTarifas, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonInicioTarifasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInicioTarifasActionPerformed
        new VentanaTarifas((Frame) this.getParent(), true).setVisible(true);
    }//GEN-LAST:event_botonInicioTarifasActionPerformed

    private void botonInicioActividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInicioActividadesActionPerformed
        new VentanaActividades((Frame) this.getParent(), true).setVisible(true);
    }//GEN-LAST:event_botonInicioActividadesActionPerformed

    private void botonInicioEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInicioEmpleadosActionPerformed
        new VentanaEmpleados((Frame) this.getParent(), true).setVisible(true);
    }//GEN-LAST:event_botonInicioEmpleadosActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_formWindowClosing

    private void bClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bClientesActionPerformed
        new VentanaClientes((Frame) this.getParent(), true).setVisible(true);
    }//GEN-LAST:event_bClientesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bClientes;
    private javax.swing.JButton botonInicioActividades;
    private javax.swing.JButton botonInicioEmpleados;
    private javax.swing.JButton botonInicioTarifas;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
