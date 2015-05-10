/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tfg_gimnasio_1_0.Data;

/**
 *
 * @author Eva Maria de Vena García
 */
public class Patrones {
    
     public boolean validarDni(String dni){   
        boolean correcto = true;
        if(!dni.matches("^6[0-9]{8}$")){
            return false;
        }
        return correcto;
    }
    
    public boolean validarNumeroCuentaBancaria(String cuenta){
        boolean correcto = true;
        if(!cuenta.matches("^((67\\d{2})|(4\\d{3})|(5[1-5]\\d{2})|(6011))(-?\\s?\\d{4}){3}|(3[4,7])\\ d{2}-?\\s?\\d{6}-?\\s?\\d{5}$")){
            return false;
        }
        return correcto;
    }
    public boolean validarTelefonoMovil(String movil){
        boolean correcto = true;
        if(!movil.matches("^6[0-9]{8}$")){
            return false;
        }
        return correcto;
    }
    public boolean validarEmail(String email){
        boolean correcto = true;
        if(!email.matches("^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,3})$")){
            return false;
        }
        return correcto;
    }
    
    public boolean validarCodigoPostal(String codigo){
        boolean correcto = true;
        if(!codigo.matches("^([1-9]{2}|[0-9][1-9]|[1-9][0-9])[0-9]{3}$")){
            return false;
        }
        return correcto;
    }
}
