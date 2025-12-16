
package com.mycompany.restaurant.Persistencia;

import com.mycompany.restaurant.Logica.Mesas;
import com.mycompany.restaurant.Logica.ReservaUsuarios;
import com.mycompany.restaurant.Logica.Usuarios;
import com.mycompany.restaurant.Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControlPersis {
    
    UsuariosJpaController UsuJpa=new UsuariosJpaController();
    MesasJpaController MesaJpa=new  MesasJpaController();
    ReservaUsuariosJpaController ReservaJpa=new ReservaUsuariosJpaController();


    public void crearUsuario(Usuarios usu) {
        UsuJpa.create(usu);
    }
    
    public Usuarios traerUsuario(int id){
        return UsuJpa.findUsuarios(id);
    }

    public List<Usuarios> traerUsuarios() {
        return UsuJpa.findUsuariosEntities();
    }
    
    public void EditarUsuario( Usuarios usuario) {
        try {
            UsuJpa.edit(usuario);
        } catch (Exception ex) {
            Logger.getLogger(ControlPersis.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarUsuario(int id){
        try {
            UsuJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControlPersis.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void crearMesa(Mesas mesa) {
        MesaJpa.create(mesa);
    }

    public List<Mesas> traerMesas() {
        return MesaJpa.findMesasEntities();
    }

    public void eliminarMesa(int id_mesa) {
        try {
            MesaJpa.destroy(id_mesa);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControlPersis.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Mesas traermesa(int id_mesa) {
        return MesaJpa.findMesas(id_mesa);
    }

    public void editarMesa(Mesas mesa) {
        try {
            MesaJpa.edit(mesa);
        } catch (Exception ex) {
            Logger.getLogger(ControlPersis.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void crearReserva(ReservaUsuarios reser) {
        ReservaJpa.create(reser);
    }

    public void editarDisponible(Mesas me) {
        try {
            MesaJpa.edit(me);
        } catch (Exception ex) {
            Logger.getLogger(ControlPersis.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<ReservaUsuarios> traerReservas() {
        
         return ReservaJpa.findReservaUsuariosEntities();
        
    }
    

    public void editarEstadoReservacion(ReservaUsuarios res) {
        try {
            ReservaJpa.edit(res);
        } catch (Exception ex) {
            Logger.getLogger(ControlPersis.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarReserva(int id_Reserva) {
        try {
            ReservaJpa.destroy(id_Reserva);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControlPersis.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   

    
    
    
}
