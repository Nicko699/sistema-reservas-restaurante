package com.mycompany.restaurant.Logica;

import com.mycompany.restaurant.Persistencia.ControlPersis;
import java.util.Date;
import java.util.List;

public class ControlLogica {

    // Instancia de la clase que maneja la persistencia de datos en la bd
    ControlPersis cont = new ControlPersis();
    HashearPassword password=new HashearPassword();

    public void crearUsuario(String nombre, String usuario, Long telefono, String rol, String contrasenia) {
        // Creamos una nueva instancia de la clase Usuarios
        Usuarios usu = new Usuarios();

        // Asignamos los valores recibidos al objeto Usuario
        usu.setNombre(nombre);
        usu.setNombre_usuario(usuario);
        usu.setTelefono(telefono);
        usu.setRol(rol);
        usu.setContraseña(contrasenia);

        //Llamamos al metodo crear usuarios y le pasamos al usuario
        cont.crearUsuario(usu);
    }

    //metodo para validar al usuario
    public Usuarios ValidarUsuario(String usuario, String contrasenia) {

      // Traemos todos los usuarios de la bd
    List<Usuarios> listaUsu = cont.traerUsuarios();

    for (Usuarios usu : listaUsu) {

        //Comparamos el usuario de la bd por el digitado por el usuario
        if (usu.getNombre_usuario().equals(usuario)) {

            //Comparamos la contraseña Hasheada de la bd por la digitada por el usuario
            boolean passwordOk = password.verificarPassword(   contrasenia, usu.getContraseña());

            if (passwordOk) {
                return usu; // si retorna el usuario, significa que iniciamos sesion correctamente
            } else {
                return null; //si no, retornamos null por contraseña incorrecta
            }
        }
    }

    return null; //si no, retornamos null por que no existe el usuario
}

    //Método para crear una mesa
    public void crearMesa(int Nmesa, String Capacidad, String Disponibilidad) {
        Mesas mesa = new Mesas();
        mesa.setId(Nmesa);
        mesa.setCapacidad(Capacidad);
        mesa.setDisponibilidad(Disponibilidad);
        cont.crearMesa(mesa);

    }

//metodo de traer mesas
    public Mesas traerMesas(int Nmesa) {
        
        Mesas mesas = null;
        
        List<Mesas> mesa = cont.traerMesas();

        for (Mesas mes : mesa) {

            // Comparamos si el id de la mesa actual coincide con el id buscado Nmesa
            if (mes.getId() == Nmesa) {

                // Asignamos la mesa encontrada a la variable mesas
                mesas = mes;

                // Retornamos la mesa encontrada y salimos del método
                return mesas;
            }
        }

// Si no se encontró ninguna mesa con el id buscado retornamos null
        return null;

    }

    // Método que trae  todas las mesas de la bb
    public List<Mesas> traerMesas2() {
        return cont.traerMesas();
    }

    //Método para eliminar cualquier mesa de la bd
    public void eliminarMesa(int id_mesa) {
        cont.eliminarMesa(id_mesa);
    }

    // método para traer una mesa con el id
    public Mesas traerMesa(int id_mesa) {
        return cont.traermesa(id_mesa);
    }

    //Método para editar una mesa
    public void modificarMesa(Mesas mesa, int Nmesa, String Capacidad, String Disponibilidad) {
        mesa.setId(Nmesa);
        mesa.setCapacidad(Capacidad);
        mesa.setDisponibilidad(Disponibilidad);
        cont.editarMesa(mesa);
    }

    //Método para crear una reserva
    public void crearReserva(Usuarios usu, Mesas me, Date fecha, String hora, String estado) {
        ReservaUsuarios reser = new ReservaUsuarios();
        reser.setFecha(fecha);
        reser.setHora(hora);
        reser.setEstado(estado);
        reser.setUsu(usu);
        reser.setMesa(me);
        cont.crearReserva(reser);

    }

   public ReservaUsuarios verificarReserva(Usuarios usu, String estado) {
   // Obtenemos la lista de todas las reservas desde el controlador
List<ReservaUsuarios> listaRese = cont.traerReservas();

// Verificamos que la lista no sea null
if (listaRese != null) {
   
    for (ReservaUsuarios reservaUsuario : listaRese) {
        // Verificamos que la reserva tenga un usuario, que sea el usuario que buscamos
        // y que el estado de la reserva coincida con el que buscamos
        if (reservaUsuario.getUsu() != null 
            && reservaUsuario.getUsu().getId() == usu.getId()
            && reservaUsuario.getEstado().equals(estado)) {

            // Si cumple todas las condiciones, retornamos la reserva
            return reservaUsuario;
        }
    }
}

// Si no se encuentra ninguna reserva que cumpla las condiciones, retornamos null
return null;

}

public ReservaUsuarios verificarReserva2(Date fecha, String hora, Mesas mes) {
    // Obtenemos la lista de todas las reservas desde el controlador
List<ReservaUsuarios> listaRese = cont.traerReservas();

// Verificamos que la lista no sea null
if (listaRese != null) {
    // Recorremos cada reserva en la lista
    for (ReservaUsuarios rese : listaRese) {
        // Verificamos que la reserva tenga una mesa, que la mesa coincida con la que buscamos
        // y que la fecha y la hora coincidan con las que estamos buscando
        if (rese.getMesa() != null 
            && rese.getMesa().getId() == mes.getId()
            && rese.getFecha() != null && rese.getFecha().equals(fecha)
            && rese.getHora() != null && rese.getHora().equals(hora)) {

            // Si cumple todas las condiciones, retornamos esta reserva
            return rese;
        }
    }
}

// Si no se encuentra ninguna reserva que cumpla las condiciones, retornamos null
return null;
}

    //método para traer todas las reservas
    public List<ReservaUsuarios> traerReservas() {
        return cont.traerReservas();
    }

    //Método para editar el estado de la reservación
    public void editarEstadoReservacion(ReservaUsuarios res, String estado) {
        res.setEstado(estado);
        cont.editarEstadoReservacion(res);

    }

    //Método para eliminar reserva
    public void eliminarReserva(int id_Reserva) {
        cont.eliminarReserva(id_Reserva);
    }
    //Metodo para traer al usuario por el id
    public Usuarios traerUsuario(int id){
        
     return cont.traerUsuario(id);
    }
    
    //Metodo para traer todos los usuarios de la bd
    public List<Usuarios>traerListaUsuarios(){
        return cont.traerUsuarios();
    }
    //metodo para eliminar al usuario
    public void eliminarUsuario(int id){
        cont.eliminarUsuario(id);
    }
     //Metodo para editar al usuario
    public void editarUsuario( Usuarios usuario){
        cont.EditarUsuario(usuario);
    }
    
}
