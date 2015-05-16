/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gimnasio.ventanas;

import gimnasio.gestoras.GestoraVentanaInicio;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author Eva
 */
public class InicioUsuario extends javax.swing.JDialog {

    /**
     * Creates new form Inicio
     */
    public InicioUsuario(Frame owner, boolean modal) {
        super(owner, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonInicioClientes = new javax.swing.JButton();
        botonInicioActividades = new javax.swing.JButton();
        botonInicioTarifas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        botonInicioClientes.setText("Clientes");
        botonInicioClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInicioClientesActionPerformed(evt);
            }
        });

        botonInicioActividades.setText("Actividades");
        botonInicioActividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInicioActividadesActionPerformed(evt);
            }
        });

        botonInicioTarifas.setText("Tarifas");
        botonInicioTarifas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInicioTarifasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(botonInicioClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124)
                .addComponent(botonInicioActividades, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124)
                .addComponent(botonInicioTarifas, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(185, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonInicioClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonInicioTarifas, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonInicioActividades, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonInicioClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInicioClientesActionPerformed
        new VentanaClientes((Frame) this.getParent(), true).setVisible(true);
    }//GEN-LAST:event_botonInicioClientesActionPerformed

    private void botonInicioTarifasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInicioTarifasActionPerformed
        new VentanaTarifas((Frame) this.getParent(), true).setVisible(true);
    }//GEN-LAST:event_botonInicioTarifasActionPerformed

    private void botonInicioActividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInicioActividadesActionPerformed
        new VentanaActividades((Frame) this.getParent(), true).setVisible(true);
    }//GEN-LAST:event_botonInicioActividadesActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonInicioActividades;
    private javax.swing.JButton botonInicioClientes;
    private javax.swing.JButton botonInicioTarifas;
    // End of variables declaration//GEN-END:variables
}
