/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gimnasio.gestoras;

/**
 *
 * @author Eva Maria de Vena García
 */
public class Patrones {

    // TODO Estos métodos deben ser estáticos
    public static boolean validarDni(String dni) {
        return dni.matches("^6[0-9]{8}$");
    }

    public static boolean validarNumeroCuentaBancaria(String cuenta) {
        return cuenta.matches("^((67\\d{2})|(4\\d{3})|(5[1-5]\\d{2})|(6011))(-?\\s?\\d{4}){3}|(3[4,7])\\ d{2}-?\\s?\\d{6}-?\\s?\\d{5}$");
    }

    public static boolean validarTelefonoMovil(String movil) {
        return movil.matches("^6[0-9]{8}$");
    }

    public static boolean validarEmail(String email) {
        return email.matches("^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,3})$");
    }

    public static boolean validarCodigoPostal(String codigo) {
        return codigo.matches("^([1-9]{2}|[0-9][1-9]|[1-9][0-9])[0-9]{3}$");
    }
}
