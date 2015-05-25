package datos;
// Generated 25-may-2015 23:18:59 by Hibernate Tools 4.3.1



/**
 * Domicilios generated by hbm2java
 */
public class Domicilios  implements java.io.Serializable {


     private int idDomicilio;
     private String tipoViaDomicilio;
     private String direccionDomicilio;
     private String pisoDomicilio;
     private String numeroDomicilio;
     private Integer codigoPostalDomicilio;
     private Integer localidadDomicilio;
     private Integer provinciaDomicilio;

    public Domicilios() {
    }

	
    public Domicilios(int idDomicilio) {
        this.idDomicilio = idDomicilio;
    }
    public Domicilios(int idDomicilio, String tipoViaDomicilio, String direccionDomicilio, String pisoDomicilio, String numeroDomicilio, Integer codigoPostalDomicilio, Integer localidadDomicilio, Integer provinciaDomicilio) {
       this.idDomicilio = idDomicilio;
       this.tipoViaDomicilio = tipoViaDomicilio;
       this.direccionDomicilio = direccionDomicilio;
       this.pisoDomicilio = pisoDomicilio;
       this.numeroDomicilio = numeroDomicilio;
       this.codigoPostalDomicilio = codigoPostalDomicilio;
       this.localidadDomicilio = localidadDomicilio;
       this.provinciaDomicilio = provinciaDomicilio;
    }
   
    public int getIdDomicilio() {
        return this.idDomicilio;
    }
    
    public void setIdDomicilio(int idDomicilio) {
        this.idDomicilio = idDomicilio;
    }
    public String getTipoViaDomicilio() {
        return this.tipoViaDomicilio;
    }
    
    public void setTipoViaDomicilio(String tipoViaDomicilio) {
        this.tipoViaDomicilio = tipoViaDomicilio;
    }
    public String getDireccionDomicilio() {
        return this.direccionDomicilio;
    }
    
    public void setDireccionDomicilio(String direccionDomicilio) {
        this.direccionDomicilio = direccionDomicilio;
    }
    public String getPisoDomicilio() {
        return this.pisoDomicilio;
    }
    
    public void setPisoDomicilio(String pisoDomicilio) {
        this.pisoDomicilio = pisoDomicilio;
    }
    public String getNumeroDomicilio() {
        return this.numeroDomicilio;
    }
    
    public void setNumeroDomicilio(String numeroDomicilio) {
        this.numeroDomicilio = numeroDomicilio;
    }
    public Integer getCodigoPostalDomicilio() {
        return this.codigoPostalDomicilio;
    }
    
    public void setCodigoPostalDomicilio(Integer codigoPostalDomicilio) {
        this.codigoPostalDomicilio = codigoPostalDomicilio;
    }
    public Integer getLocalidadDomicilio() {
        return this.localidadDomicilio;
    }
    
    public void setLocalidadDomicilio(Integer localidadDomicilio) {
        this.localidadDomicilio = localidadDomicilio;
    }
    public Integer getProvinciaDomicilio() {
        return this.provinciaDomicilio;
    }
    
    public void setProvinciaDomicilio(Integer provinciaDomicilio) {
        this.provinciaDomicilio = provinciaDomicilio;
    }




}


