/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gimnasio.gestoras;

import datos.Empleados;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eva
 */
public class Login {

    // EL Empleados autenticado
    private static Empleados empleadoAutenticado;
    // Para convertir los bytes en un array de dígitos
    private static final char[] DIGITS_LOWER
            = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static char[] encodeHex(byte[] data, char[] toDigits) {
        int l = data.length;
        char[] out = new char[1 << l];
        // two characters form the hex value.
        for (int i = 0, j = 0; i < l; i++) {
            out[j++] = toDigits[(0xF0 & data[i]) >>> 4];
            out[j++] = toDigits[0x0F & data[i]];
        }
        return out;
    }

    public static String devuelveHash(String contraseña) {

        return String.valueOf(encodeHex(getHash(contraseña), DIGITS_LOWER)).trim();
    }

    public static byte[] getHash(String password) {
        try {

            MessageDigest digest = MessageDigest.getInstance("MD5");
            digest.reset();
            byte[] input = digest.digest(password.getBytes("UTF-8"));

            return input;

        } catch (NoSuchAlgorithmException | UnsupportedEncodingException ex) {
            Logger.getLogger(Gestora.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public static boolean realizaLogin(String usuario, String contraseña) {

        contraseña = devuelveHash(contraseña);

        Empleados temp = (Empleados) Gestora.getInstance()
                .ejecutarConsultaUnResultado("from Empleados alias where alias.nombreEmpleado = '"
                        + usuario + "' and alias.contrasenaEmpleado = '" + contraseña + "'");

        if (temp != null) {

            empleadoAutenticado = temp;
            return true;

        } else {

            return false;
        }

    }

    public static boolean isEmpleadoAutenticadoAdmin() {

        return empleadoAutenticado != null && empleadoAutenticado.getNombreEmpleado().equals("admin");
    }

    public static Empleados getEmpleadoAutenticado() {
        return empleadoAutenticado;
    }
}
