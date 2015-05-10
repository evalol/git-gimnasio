/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gimnasio.ventanas;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Edwinem
 */
@Entity
@Table(name = "actividades", catalog = "fitnesscenter", schema = "")
@NamedQueries({
    @NamedQuery(name = "Actividades.findAll", query = "SELECT a FROM Actividades a"),
    @NamedQuery(name = "Actividades.findByIdActividad", query = "SELECT a FROM Actividades a WHERE a.idActividad = :idActividad"),
    @NamedQuery(name = "Actividades.findByNombreActividad", query = "SELECT a FROM Actividades a WHERE a.nombreActividad = :nombreActividad"),
    @NamedQuery(name = "Actividades.findByEmpleadoEncargadoActividad", query = "SELECT a FROM Actividades a WHERE a.empleadoEncargadoActividad = :empleadoEncargadoActividad"),
    @NamedQuery(name = "Actividades.findByCuotaPrecio", query = "SELECT a FROM Actividades a WHERE a.cuotaPrecio = :cuotaPrecio")})
public class Actividades implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_actividad")
    private Integer idActividad;
    @Column(name = "nombre_actividad")
    private String nombreActividad;
    @Column(name = "empleado_encargado_actividad")
    private Integer empleadoEncargadoActividad;
    @Column(name = "cuota_precio")
    private Integer cuotaPrecio;

    public Actividades() {
    }

    public Actividades(Integer idActividad) {
        this.idActividad = idActividad;
    }

    public Integer getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(Integer idActividad) {
        Integer oldIdActividad = this.idActividad;
        this.idActividad = idActividad;
        changeSupport.firePropertyChange("idActividad", oldIdActividad, idActividad);
    }

    public String getNombreActividad() {
        return nombreActividad;
    }

    public void setNombreActividad(String nombreActividad) {
        String oldNombreActividad = this.nombreActividad;
        this.nombreActividad = nombreActividad;
        changeSupport.firePropertyChange("nombreActividad", oldNombreActividad, nombreActividad);
    }

    public Integer getEmpleadoEncargadoActividad() {
        return empleadoEncargadoActividad;
    }

    public void setEmpleadoEncargadoActividad(Integer empleadoEncargadoActividad) {
        Integer oldEmpleadoEncargadoActividad = this.empleadoEncargadoActividad;
        this.empleadoEncargadoActividad = empleadoEncargadoActividad;
        changeSupport.firePropertyChange("empleadoEncargadoActividad", oldEmpleadoEncargadoActividad, empleadoEncargadoActividad);
    }

    public Integer getCuotaPrecio() {
        return cuotaPrecio;
    }

    public void setCuotaPrecio(Integer cuotaPrecio) {
        Integer oldCuotaPrecio = this.cuotaPrecio;
        this.cuotaPrecio = cuotaPrecio;
        changeSupport.firePropertyChange("cuotaPrecio", oldCuotaPrecio, cuotaPrecio);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idActividad != null ? idActividad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Actividades)) {
            return false;
        }
        Actividades other = (Actividades) object;
        if ((this.idActividad == null && other.idActividad != null) || (this.idActividad != null && !this.idActividad.equals(other.idActividad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tfg_gimnasio_1_0.Windows.Actividades[ idActividad=" + idActividad + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
