package datos;
// Generated 10-may-2015 17:08:22 by Hibernate Tools 4.3.1

import java.util.Objects;




/**
 * Actividades generated by hbm2java
 */
public class Actividades  implements java.io.Serializable {


     private Integer idActividad;
     private String nombreActividad;
     private Integer empleadoEncargadoActividad;
     private Integer cuotaPrecio;

    public Actividades() {
    }

    public Actividades(String nombreActividad, Integer empleadoEncargadoActividad, Integer cuotaPrecio) {
       this.nombreActividad = nombreActividad;
       this.empleadoEncargadoActividad = empleadoEncargadoActividad;
       this.cuotaPrecio = cuotaPrecio;
    }
   
    public Integer getIdActividad() {
        return this.idActividad;
    }
    
    public void setIdActividad(Integer idActividad) {
        this.idActividad = idActividad;
    }
    public String getNombreActividad() {
        return this.nombreActividad;
    }
    
    public void setNombreActividad(String nombreActividad) {
        this.nombreActividad = nombreActividad;
    }
    public Integer getEmpleadoEncargadoActividad() {
        return this.empleadoEncargadoActividad;
    }
    
    public void setEmpleadoEncargadoActividad(Integer empleadoEncargadoActividad) {
        this.empleadoEncargadoActividad = empleadoEncargadoActividad;
    }
    public Integer getCuotaPrecio() {
        return this.cuotaPrecio;
    }
    
    public void setCuotaPrecio(Integer cuotaPrecio) {
        this.cuotaPrecio = cuotaPrecio;
    }

    @Override
    public String toString() {
        return "Actividades{" + "nombreActividad=" + nombreActividad + ", cuotaPrecio=" + cuotaPrecio + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.nombreActividad);
        hash = 89 * hash + Objects.hashCode(this.cuotaPrecio);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Actividades other = (Actividades) obj;
        if (!Objects.equals(this.nombreActividad, other.nombreActividad)) {
            return false;
        }
        if (!Objects.equals(this.cuotaPrecio, other.cuotaPrecio)) {
            return false;
        }
        return true;
    }


}


