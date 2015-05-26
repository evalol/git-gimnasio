package datos;
// Generated 27-may-2015 0:50:17 by Hibernate Tools 4.3.1


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
     private String telefonomovilCliente;
     private String direcciondomicilioCliente;
     private String pisodomicilioCliente;
     private String numerodomicilioCliente;
     private Integer codigopostalCliente;
     private String localidadCliente;
     private String provinciaCliente;
     private Date fechanacimientoCliente;
     private String cuentabancariaCliente;
     private String emailCliente;
     private Date altaCliente;
     private Integer idtarifaCliente;
     private String formapagoCliente;
     private Integer idempleadoaltaCliente;

    public Clientes() {
    }

	
    public Clientes(String dniCliente, Date fechanacimientoCliente, String cuentabancariaCliente, String formapagoCliente) {
        this.dniCliente = dniCliente;
        this.fechanacimientoCliente = fechanacimientoCliente;
        this.cuentabancariaCliente = cuentabancariaCliente;
        this.formapagoCliente = formapagoCliente;
    }
    public Clientes(String nombreCliente, String apellidosCliente, String dniCliente, String telefonoCliente, String telefonomovilCliente, String direcciondomicilioCliente, String pisodomicilioCliente, String numerodomicilioCliente, Integer codigopostalCliente, String localidadCliente, String provinciaCliente, Date fechanacimientoCliente, String cuentabancariaCliente, String emailCliente, Date altaCliente, Integer idtarifaCliente, String formapagoCliente, Integer idempleadoaltaCliente) {
       this.nombreCliente = nombreCliente;
       this.apellidosCliente = apellidosCliente;
       this.dniCliente = dniCliente;
       this.telefonoCliente = telefonoCliente;
       this.telefonomovilCliente = telefonomovilCliente;
       this.direcciondomicilioCliente = direcciondomicilioCliente;
       this.pisodomicilioCliente = pisodomicilioCliente;
       this.numerodomicilioCliente = numerodomicilioCliente;
       this.codigopostalCliente = codigopostalCliente;
       this.localidadCliente = localidadCliente;
       this.provinciaCliente = provinciaCliente;
       this.fechanacimientoCliente = fechanacimientoCliente;
       this.cuentabancariaCliente = cuentabancariaCliente;
       this.emailCliente = emailCliente;
       this.altaCliente = altaCliente;
       this.idtarifaCliente = idtarifaCliente;
       this.formapagoCliente = formapagoCliente;
       this.idempleadoaltaCliente = idempleadoaltaCliente;
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
    public String getTelefonomovilCliente() {
        return this.telefonomovilCliente;
    }
    
    public void setTelefonomovilCliente(String telefonomovilCliente) {
        this.telefonomovilCliente = telefonomovilCliente;
    }
    public String getDirecciondomicilioCliente() {
        return this.direcciondomicilioCliente;
    }
    
    public void setDirecciondomicilioCliente(String direcciondomicilioCliente) {
        this.direcciondomicilioCliente = direcciondomicilioCliente;
    }
    public String getPisodomicilioCliente() {
        return this.pisodomicilioCliente;
    }
    
    public void setPisodomicilioCliente(String pisodomicilioCliente) {
        this.pisodomicilioCliente = pisodomicilioCliente;
    }
    public String getNumerodomicilioCliente() {
        return this.numerodomicilioCliente;
    }
    
    public void setNumerodomicilioCliente(String numerodomicilioCliente) {
        this.numerodomicilioCliente = numerodomicilioCliente;
    }
    public Integer getCodigopostalCliente() {
        return this.codigopostalCliente;
    }
    
    public void setCodigopostalCliente(Integer codigopostalCliente) {
        this.codigopostalCliente = codigopostalCliente;
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
    public Integer getIdtarifaCliente() {
        return this.idtarifaCliente;
    }
    
    public void setIdtarifaCliente(Integer idtarifaCliente) {
        this.idtarifaCliente = idtarifaCliente;
    }
    public String getFormapagoCliente() {
        return this.formapagoCliente;
    }
    
    public void setFormapagoCliente(String formapagoCliente) {
        this.formapagoCliente = formapagoCliente;
    }
    public Integer getIdempleadoaltaCliente() {
        return this.idempleadoaltaCliente;
    }
    
    public void setIdempleadoaltaCliente(Integer idempleadoaltaCliente) {
        this.idempleadoaltaCliente = idempleadoaltaCliente;
    }




}


