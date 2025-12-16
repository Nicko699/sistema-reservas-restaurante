package com.mycompany.restaurant.Logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Clase para entidad de la bd
@Entity
public class Usuarios implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
    @Basic
    private String nombre; 
    private String nombre_usuario;
    private Long telefono;
    private String rol;   
    private String contraseña;
    

    public Usuarios() {
    }

    public Usuarios(int id, String nombre, String nombre_usuario, Long telefono, String rol, String contraseña) {
        this.id = id;
        this.nombre = nombre;
        this.nombre_usuario = nombre_usuario;
        this.telefono = telefono;
        this.rol = rol;
        this.contraseña = contraseña;
     
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

   
    
    
    
    

}