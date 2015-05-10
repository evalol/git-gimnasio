/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gimnasio.ventanas;

import java.awt.Component;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Edwinem
 */
public class VentanaUtils {
    
    public static void limpiarFormulario(JPanel p) {
        
        for (Component c : p.getComponents()) {
            if(c instanceof JTextField)
                ((JTextField)c).setText("");
            if(c instanceof JComboBox)
                ((JComboBox)c).setSelectedItem("");
            if(c instanceof JPanel)
                limpiarFormulario((JPanel)c);
        }
    }
}
