/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gimnasio.gestoras;

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

    public static char[] encodeHex(byte[] data, char[] toDigits) {
        int l = data.length;
        //char[] out = new char[l « 1];
    // two characters form the hex value.
        for (int i = 0, j = 0; i < l; i++) {
          //  out[j++] = toDigits[(0xF0 & data[i]) »> 4];
      //  out[j++] = toDigits[0x0F & data[i]];
        }
       //return out;
        return null;
    }

    public static String devuelveHash(String contraseña) {

        return null ;//String.valueOf(encodeHex(getHash(contraseña), DIGITS_LOWER));
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
}
