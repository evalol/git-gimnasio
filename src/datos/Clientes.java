package datos;
// Generated 25-may-2015 23:18:59 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Clientes generated by hbm2java
 */
public class Clientes  implements java.io.Serializable {


     private Integer idCliente;
     private String nombreCliente;
     private String apellidosCliente;
     private String dniCliente;
     private String telefonoCliente;
     private String telefonoMovilCliente;
     private String direccionDomicilioCliente;
     private String pisoDomicilioCliente;
     private String numeroDomicilioCliente;
     private Integer codigoPostalCliente;
     private String localidadCliente;
     private String provinciaCliente;
     private Date fechanacimientoCliente;
     private String cuentabancariaCliente;
     private String emailCliente;
     private Date altaCliente;
     private Integer idTarifaCliente;
     private String formapagoCliente;
     private String altaEmpleadoCliente;

    public Clientes() {
    }

	
    public Clientes(String dniCliente, Date fechanacimientoCliente, String cuentabancariaCliente, String formapagoCliente) {
        this.dniCliente = dniCliente;
        this.fechanacimientoCliente = fechanacimientoCliente;
        this.cuentabancariaCliente = cuentabancariaCliente;
        this.formapagoCliente = formapagoCliente;
    }
    public Clientes(String nombreCliente, String apellidosCliente, String dniCliente, String telefonoCliente, String telefonoMovilCliente, String direccionDomicilioCliente, String pisoDomicilioCliente, String numeroDomicilioCliente, Integer codigoPostalCliente, String localidadCliente, String provinciaCliente, Date fechanacimientoCliente, String cuentabancariaCliente, String emailCliente, Date altaCliente, Integer idTarifaCliente, String formapagoCliente, String altaEmpleadoCliente) {
       this.nombreCliente = nombreCliente;
       this.apellidosCliente = apellidosCliente;
       this.dniCliente = dniCliente;
       this.telefonoCliente = telefonoCliente;
       this.telefonoMovilCliente = telefonoMovilCliente;
       this.direccionDomicilioCliente = direccionDomicilioCliente;
       this.pisoDomicilioCliente = pisoDomicilioCliente;
       this.numeroDomicilioCliente = numeroDomicilioCliente;
       this.codigoPostalCliente = codigoPostalCliente;
       this.localidadCliente = localidadCliente;
       this.provinciaCliente = provinciaCliente;
       this.fechanacimientoCliente = fechanacimientoCliente;
       this.cuentabancariaCliente = cuentabancariaCliente;
       this.emailCliente = emailCliente;
       this.altaCliente = altaCliente;
       this.idTarifaCliente = idTarifaCliente;
       this.formapagoCliente = formapagoCliente;
       this.altaEmpleadoCliente = altaEmpleadoCliente;
    }
   
    public Integer getIdCliente() {
        return this.idCliente;
    }
    
    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }
    public String getNombreCliente() {
        return this.nombreCliente;
    }
    
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    public String getApellidosCliente() {
        return this.apellidosCliente;
    }
    
    public void setApellidosCliente(String apellidosCliente) {
        this.apellidosCliente = apellidosCliente;
    }
    public String getDniCliente() {
        return this.dniCliente;
    }
    
    public void setDniCliente(String dniCliente) {
        this.dniCliente = dniCliente;
    }
    public String getTelefonoCliente() {
        return this.telefonoCliente;
    }
    
    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }
    public String getTelefonoMovilCliente() {
        return this.telefonoMovilCliente;
    }
    
    public void setTelefonoMovilCliente(String telefonoMovilCliente) {
        this.telefonoMovilCliente = telefonoMovilCliente;
    }
    public String getDireccionDomicilioCliente() {
        return this.direccionDomicilioCliente;
    }
    
    public void setDireccionDomicilioCliente(String direccionDomicilioCliente) {
        this.direccionDomicilioCliente = direccionDomicilioCliente;
    }
    public String getPisoDomicilioCliente() {
        return this.pisoDomicilioCliente;
    }
    
    public void setPisoDomicilioCliente(String pisoDomicilioCliente) {
        this.pisoDomicilioCliente = pisoDomicilioCliente;
    }
    public String getNumeroDomicilioCliente() {
        return this.numeroDomicilioCliente;
    }
    
    public void setNumeroDomicilioCliente(String numeroDomicilioCliente) {
        this.numeroDomicilioCliente = numeroDomicilioCliente;
    }
    public Integer getCodigoPostalCliente() {
        return this.codigoPostalCliente;
    }
    
    public void setCodigoPostalCliente(Integer codigoPostalCliente) {
        this.codigoPostalCliente = codigoPostalCliente;
    }
    public String getLocalidadCliente() {
        return this.localidadCliente;
    }
    
    public void setLocalidadCliente(String localidadCliente) {
        this.localidadCliente = localidadCliente;
    }
    public String getProvinciaCliente() {
        return this.provinciaCliente;
    }
    
    public void setProvinciaCliente(String provinciaCliente) {
        this.provinciaCliente = provinciaCliente;
    }
    public Date getFechanacimientoCliente() {
        return this.fechanacimientoCliente;
    }
    
    public void setFechanacimientoCliente(Date fechanacimientoCliente) {
        this.fechanacimientoCliente = fechanacimientoCliente;
    }
    public String getCuentabancariaCliente() {
        return this.cuentabancariaCliente;
    }
    
    public void setCuentabancariaCliente(String cuentabancariaCliente) {
        this.cuentabancariaCliente = cuentabancariaCliente;
    }
    public String getEmailCliente() {
        return this.emailCliente;
    }
    
    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }
    public Date getAltaCliente() {
        return this.altaCliente;
    }
    
    public void setAltaCliente(Date altaCliente) {
        this.altaCliente = altaCliente;
    }
    public Integer getIdTarifaCliente() {
        return this.idTarifaCliente;
    }
    
    public void setIdTarifaCliente(Integer idTarifaCliente) {
        this.idTarifaCliente = idTarifaCliente;
    }
    public String getFormapagoCliente() {
        return this.formapagoCliente;
    }
    
    public void setFormapagoCliente(String formapagoCliente) {
        this.formapagoCliente = formapagoCliente;
    }
    public String getAltaEmpleadoCliente() {
        return this.altaEmpleadoCliente;
    }
    
    public void setAltaEmpleadoCliente(String altaEmpleadoCliente) {
        this.altaEmpleadoCliente = altaEmpleadoCliente;
    }




}


