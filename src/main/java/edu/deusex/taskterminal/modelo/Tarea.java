/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.deusex.taskterminal.modelo;

/**
 * @author NullTrace
 * Clase que representa una Tarea, tiene su numero identificatorio, cuerpo y por defecto un estado de Pendiente
 * 
 */

public class Tarea {
    
    private Integer id;
    
    private String descripcion;
    
    private Estado estado;

    public Tarea(Integer id, String cuerpo) {
        this.id = id;
        this.descripcion = cuerpo;
        this.estado = Estado.PENDIENTE;
    }

    public Integer getId() {
        return id;
    }

    public String getCuerpo() {
        return descripcion;
    }

    public void setCuerpo(String cuerpo) {
        this.descripcion = cuerpo;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "id=" + id + ", descripción=" + descripcion + ", estado=" + estado + "\n";
    }
}
