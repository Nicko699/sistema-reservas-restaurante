
package com.mycompany.restaurant.Logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


//Clase para entidad de la bd
@Entity
public class Mesas implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    @Basic
    private String capacidad;
    private String disponibilidad;
    

    public Mesas() {
    }

    public Mesas(int id,  String capacidad, String disponibilidad) {
        this.id = id;
        this.capacidad = capacidad;
        this.disponibilidad = disponibilidad;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

   
    
    
    
    
}




