package datos;
// Generated 27-may-2015 20:48:02 by Hibernate Tools 4.3.1



/**
 * Tarifas generated by hbm2java
 */
public class Tarifas  implements java.io.Serializable {


     private Integer idTarifa;
     private String nombreTarifa;
     private int edadMinimaTarifa;
     private int edadMaximaTarifa;
     private int precioTarifa;

    public Tarifas() {
    }

    public Tarifas(String nombreTarifa, int edadMinimaTarifa, int edadMaximaTarifa, int precioTarifa) {
       this.nombreTarifa = nombreTarifa;
       this.edadMinimaTarifa = edadMinimaTarifa;
       this.edadMaximaTarifa = edadMaximaTarifa;
       this.precioTarifa = precioTarifa;
    }
   
    public Integer getIdTarifa() {
        return this.idTarifa;
    }
    
    public void setIdTarifa(Integer idTarifa) {
        this.idTarifa = idTarifa;
    }
    public String getNombreTarifa() {
        return this.nombreTarifa;
    }
    
    public void setNombreTarifa(String nombreTarifa) {
        this.nombreTarifa = nombreTarifa;
    }
    public int getEdadMinimaTarifa() {
        return this.edadMinimaTarifa;
    }
    
    public void setEdadMinimaTarifa(int edadMinimaTarifa) {
        this.edadMinimaTarifa = edadMinimaTarifa;
    }
    public int getEdadMaximaTarifa() {
        return this.edadMaximaTarifa;
    }
    
    public void setEdadMaximaTarifa(int edadMaximaTarifa) {
        this.edadMaximaTarifa = edadMaximaTarifa;
    }
    public int getPrecioTarifa() {
        return this.precioTarifa;
    }
    
    public void setPrecioTarifa(int precioTarifa) {
        this.precioTarifa = precioTarifa;
    }




}


