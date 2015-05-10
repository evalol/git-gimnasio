/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gimnasio.gestoras;

import datos.Actividades;
import datos.Clientes;
import datos.Empleados;
import datos.Tarifas;
import java.util.Date;

/**
 *
 * @author Eva
 */
public class Gestora_clientes {
    
    
    // TODO Crear una tabla Via(Id, Nombre) y que se relacionen por clave ajena
    public String tipoDeVia(){
        
        String[] vias = new String[]{"Calle", "Avenida", "Plaza", "Carretera", "Travesía", "Callejón"};
        
        String via = "";
        for(int i = 0; i < vias.length; i++){
             via = vias[i];
        }
        return via;
    }
    
    // Usar un objeto Cliente como argumento (Tiene constructor con todos estos campos)
    public void guardartDatosCLiente(String nombre, String apellidos, String dni, String email, String telefono, 
            String movil, String cuenta, Date fnacimiento){
        
        Clientes cliente = new Clientes();
        Tarifas tarifa = new Tarifas();
        
        
        //SessionFactory sesion =  SessionFactoryUtil.getSessionFactory();
        //Session session = sesion.openSession();
        //Transaction t = session.beginTransaction();
        
        cliente.setNombreCliente(nombre);
        cliente.setApellidosCliente(apellidos);
        cliente.setDniCliente(dni);
        cliente.setEmailCliente(email);
        cliente.setTelefonoCliente(telefono);
        cliente.setTelefonoMovilCliente(movil);
        cliente.setCuentabancariaCliente(cuenta); 
        cliente.setAltaCliente(new Date());
        cliente.setFechanacimientoCliente(fnacimiento);
        //cliente.setFechanacimientoCliente(tx_ventana_clientes_nuevo_fecha_nacimiento.getDate());
        
        //if(rb_ventana_clientes_nuevo_efectivo.isSelected()){
            cliente.setFormapagoCliente("Efectivo");
        //}else{
        //    cliente.setFormapagoCliente("Cuenta bancaria");
        //}
                
        //session.save(cliente);
        //t.commit();
        //session.close();
    }
    
    public void guardarDatosEmpleado(){
        
        Empleados empleado = new Empleados();
        
        empleado.getApellidosEmpleado();
        empleado.getCodigoPostalEmpleado();
        empleado.getCuentaBancariaEmpleado();
        empleado.getDireccionEmpleado();
        empleado.getDniEmpleado();
        empleado.getEmailEmpleado();
        empleado.getFechaAltaEmpleado();
        empleado.getFechaNacEmpleado();
        empleado.getIdEmpleado();
        empleado.getLocalidadEmpleado();
        empleado.getMovilEmpleado();
        empleado.getNombreEmpleado();
        empleado.getPisoEmpleado();
        empleado.getProvinciaEmpleado();
        empleado.getSueldoMesEmpleado();
        empleado.getSuplementoSueldoEmpleado();
        empleado.getTelefonoEmpleado();}
    
    public void guardarDatosActividad(){
        
        Actividades actividad = new Actividades();
        
        actividad.getIdActividad();
        actividad.getNombreActividad();
        actividad.getEmpleadoEncargadoActividad();
        actividad.getCuotaPrecio();
    }
    
    // ESto debería ir en Gestora.java
    //Hacer rollback y que no se termine la aplicacion tras un fallo.
    public void rollback(){
        //Session session = this.getSession();
        try {
            // deshacer transaccion
        //    session.getTransaction().rollback();
        } catch (Exception e) {
            System.out.println("Error en rollback: " + e);
        }
    }
    
    //Actualizar un objeto en la base de datos
    public boolean update(Object o){
        // obtener la sesion actual
        //Session session = getSession();
        try {
            // comenzar la transaccion
            //session.beginTransaction();
            // actualizarlo
           // session.saveOrUpdate(o);
            // confirmar transaccion
           // session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Error en update: " + e);
            // deshacer transaccion
            this.rollback();
            return false;
        }
        return true;
    }
    
}
