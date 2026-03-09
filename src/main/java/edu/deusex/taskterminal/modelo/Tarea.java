/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.deusex.taskterminal.modelo;

/**
 * @author NullTrace
 * Clase que representa una Tarea, tiene su numero identificatorio, cuerpo y pro defecto un estado de Pendiente
 * 
 */

public class Tarea {
    
    private Integer id;
    
    private String cuerpo;
    
    private Estado estado;

    public Tarea(Integer id, String cuerpo) {
        this.id = id;
        this.cuerpo = cuerpo;
        this.estado = Estado.PENDIENTE;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Tarea{" + "id=" + id + ", cuerpo=" + cuerpo + ", estado=" + estado + '}';
    }
}
