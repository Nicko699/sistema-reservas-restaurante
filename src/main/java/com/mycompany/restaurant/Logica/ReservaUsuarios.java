
package com.mycompany.restaurant.Logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//Clase para entidad de la bd
@Entity
public class ReservaUsuarios implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
    @Temporal(TemporalType.DATE)
    private Date fecha;
     private String hora;
     private String estado;
     //Es de tipo cascado.merge por que ya habia creado la tabla mesa y usuarios adelante que la de reservas para evitar errores
    @OneToOne(cascade = CascadeType.MERGE)
    Mesas mesa;
    @OneToOne(cascade = CascadeType.MERGE)
    Usuarios usu;

    public ReservaUsuarios() {
    }

    public ReservaUsuarios(int id, Date fecha, String hora, String estado, Mesas mesa, Usuarios usu) {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
        this.mesa = mesa;
        this.usu = usu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Mesas getMesa() {
        return mesa;
    }

    public void setMesa(Mesas mesa) {
        this.mesa = mesa;
    }

    public Usuarios getUsu() {
        return usu;
    }

    public void setUsu(Usuarios usu) {
        this.usu = usu;
    }
    

}