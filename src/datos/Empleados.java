package datos;
// Generated 25-may-2015 23:18:59 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Empleados generated by hbm2java
 */
public class Empleados  implements java.io.Serializable {


     private Integer idEmpleado;
     private String nombreEmpleado;
     private String apellidosEmpleado;
     private String dniEmpleado;
     private String emailEmpleado;
     private String telefonoEmpleado;
     private String movilEmpleado;
     private String cuentaBancariaEmpleado;
     private Date fechaNacEmpleado;
     private Date fechaAltaEmpleado;
     private Integer sueldoMesEmpleado;
     private Integer suplementoSueldoEmpleado;
     private String direccionEmpleado;
     private String pisoEmpleado;
     private String numeroEmpleado;
     private Integer codigoPostalEmpleado;
     private String localidadEmpleado;
     private String provinciaEmpleado;
     private String contrasenaEmpleado;

    public Empleados() {
    }

	
    public Empleados(String dniEmpleado, String cuentaBancariaEmpleado, Date fechaNacEmpleado) {
        this.dniEmpleado = dniEmpleado;
        this.cuentaBancariaEmpleado = cuentaBancariaEmpleado;
        this.fechaNacEmpleado = fechaNacEmpleado;
    }
    public Empleados(String nombreEmpleado, String apellidosEmpleado, String dniEmpleado, String emailEmpleado, String telefonoEmpleado, String movilEmpleado, String cuentaBancariaEmpleado, Date fechaNacEmpleado, Date fechaAltaEmpleado, Integer sueldoMesEmpleado, Integer suplementoSueldoEmpleado, String direccionEmpleado, String pisoEmpleado, String numeroEmpleado, Integer codigoPostalEmpleado, String localidadEmpleado, String provinciaEmpleado, String contrasenaEmpleado) {
       this.nombreEmpleado = nombreEmpleado;
       this.apellidosEmpleado = apellidosEmpleado;
       this.dniEmpleado = dniEmpleado;
       this.emailEmpleado = emailEmpleado;
       this.telefonoEmpleado = telefonoEmpleado;
       this.movilEmpleado = movilEmpleado;
       this.cuentaBancariaEmpleado = cuentaBancariaEmpleado;
       this.fechaNacEmpleado = fechaNacEmpleado;
       this.fechaAltaEmpleado = fechaAltaEmpleado;
       this.sueldoMesEmpleado = sueldoMesEmpleado;
       this.suplementoSueldoEmpleado = suplementoSueldoEmpleado;
       this.direccionEmpleado = direccionEmpleado;
       this.pisoEmpleado = pisoEmpleado;
       this.numeroEmpleado = numeroEmpleado;
       this.codigoPostalEmpleado = codigoPostalEmpleado;
       this.localidadEmpleado = localidadEmpleado;
       this.provinciaEmpleado = provinciaEmpleado;
       this.contrasenaEmpleado = contrasenaEmpleado;
    }
   
    public Integer getIdEmpleado() {
        return this.idEmpleado;
    }
    
    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    public String getNombreEmpleado() {
        return this.nombreEmpleado;
    }
    
    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }
    public String getApellidosEmpleado() {
        return this.apellidosEmpleado;
    }
    
    public void setApellidosEmpleado(String apellidosEmpleado) {
        this.apellidosEmpleado = apellidosEmpleado;
    }
    public String getDniEmpleado() {
        return this.dniEmpleado;
    }
    
    public void setDniEmpleado(String dniEmpleado) {
        this.dniEmpleado = dniEmpleado;
    }
    public String getEmailEmpleado() {
        return this.emailEmpleado;
    }
    
    public void setEmailEmpleado(String emailEmpleado) {
        this.emailEmpleado = emailEmpleado;
    }
    public String getTelefonoEmpleado() {
        return this.telefonoEmpleado;
    }
    
    public void setTelefonoEmpleado(String telefonoEmpleado) {
        this.telefonoEmpleado = telefonoEmpleado;
    }
    public String getMovilEmpleado() {
        return this.movilEmpleado;
    }
    
    public void setMovilEmpleado(String movilEmpleado) {
        this.movilEmpleado = movilEmpleado;
    }
    public String getCuentaBancariaEmpleado() {
        return this.cuentaBancariaEmpleado;
    }
    
    public void setCuentaBancariaEmpleado(String cuentaBancariaEmpleado) {
        this.cuentaBancariaEmpleado = cuentaBancariaEmpleado;
    }
    public Date getFechaNacEmpleado() {
        return this.fechaNacEmpleado;
    }
    
    public void setFechaNacEmpleado(Date fechaNacEmpleado) {
        this.fechaNacEmpleado = fechaNacEmpleado;
    }
    public Date getFechaAltaEmpleado() {
        return this.fechaAltaEmpleado;
    }
    
    public void setFechaAltaEmpleado(Date fechaAltaEmpleado) {
        this.fechaAltaEmpleado = fechaAltaEmpleado;
    }
    public Integer getSueldoMesEmpleado() {
        return this.sueldoMesEmpleado;
    }
    
    public void setSueldoMesEmpleado(Integer sueldoMesEmpleado) {
        this.sueldoMesEmpleado = sueldoMesEmpleado;
    }
    public Integer getSuplementoSueldoEmpleado() {
        return this.suplementoSueldoEmpleado;
    }
    
    public void setSuplementoSueldoEmpleado(Integer suplementoSueldoEmpleado) {
        this.suplementoSueldoEmpleado = suplementoSueldoEmpleado;
    }
    public String getDireccionEmpleado() {
        return this.direccionEmpleado;
    }
    
    public void setDireccionEmpleado(String direccionEmpleado) {
        this.direccionEmpleado = direccionEmpleado;
    }
    public String getPisoEmpleado() {
        return this.pisoEmpleado;
    }
    
    public void setPisoEmpleado(String pisoEmpleado) {
        this.pisoEmpleado = pisoEmpleado;
    }
    public String getNumeroEmpleado() {
        return this.numeroEmpleado;
    }
    
    public void setNumeroEmpleado(String numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }
    public Integer getCodigoPostalEmpleado() {
        return this.codigoPostalEmpleado;
    }
    
    public void setCodigoPostalEmpleado(Integer codigoPostalEmpleado) {
        this.codigoPostalEmpleado = codigoPostalEmpleado;
    }
    public String getLocalidadEmpleado() {
        return this.localidadEmpleado;
    }
    
    public void setLocalidadEmpleado(String localidadEmpleado) {
        this.localidadEmpleado = localidadEmpleado;
    }
    public String getProvinciaEmpleado() {
        return this.provinciaEmpleado;
    }
    
    public void setProvinciaEmpleado(String provinciaEmpleado) {
        this.provinciaEmpleado = provinciaEmpleado;
    }
    public String getContrasenaEmpleado() {
        return this.contrasenaEmpleado;
    }
    
    public void setContrasenaEmpleado(String contrasenaEmpleado) {
        this.contrasenaEmpleado = contrasenaEmpleado;
    }




}


