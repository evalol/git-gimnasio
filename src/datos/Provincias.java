package datos;
// Generated 25-may-2015 23:18:59 by Hibernate Tools 4.3.1



/**
 * Provincias generated by hbm2java
 */
public class Provincias  implements java.io.Serializable {


     private Integer idProvincia;
     private int codigoProvincia;
     private String nombreProvincia;

    public Provincias() {
    }

    public Provincias(int codigoProvincia, String nombreProvincia) {
       this.codigoProvincia = codigoProvincia;
       this.nombreProvincia = nombreProvincia;
    }
   
    public Integer getIdProvincia() {
        return this.idProvincia;
    }
    
    public void setIdProvincia(Integer idProvincia) {
        this.idProvincia = idProvincia;
    }
    public int getCodigoProvincia() {
        return this.codigoProvincia;
    }
    
    public void setCodigoProvincia(int codigoProvincia) {
        this.codigoProvincia = codigoProvincia;
    }
    public String getNombreProvincia() {
        return this.nombreProvincia;
    }
    
    public void setNombreProvincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }




}


