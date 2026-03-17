/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.deusex.taskterminal.modelo;

import java.util.ArrayList;

/**
 *
 * @author NullTrace
 */
public class AlmacenTareas {
    
    private Integer Id = 1;
    
    private ArrayList<Tarea> tareas;

    public AlmacenTareas(String cuerpo) {
        this.tareas = new ArrayList<>();
        if (cuerpo == null || cuerpo.isBlank()) {
        throw new IllegalArgumentException("La primera tarea no puede estar vacía");
    }
        agregarTarea(cuerpo);
    }

    public Boolean agregarTarea (String cuerpo){
        if (cuerpo == null || cuerpo.isBlank()) {
        return false;
    }
        Tarea nuevaTarea = new Tarea (Id, cuerpo);
        Id++;
       tareas.add(nuevaTarea);
        return true;
    }
    
    public Boolean eliminarporId (Integer id){
        if (id == null) return false;
        for (int i = 0; i< tareas.size(); i++ ){
            if (tareas.get(i).getId().equals(id)){
                tareas.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public Boolean cambiarEstado(Integer id){
        if (id == null) return false;
         for (int i = 0; i < tareas.size(); i++) {
        if (tareas.get(i).getId().equals(id)) {
            if (tareas.get(i).getEstado() == Estado.PENDIENTE) {
                tareas.get(i).setEstado(Estado.COMPLETADO);
            } else {
                tareas.get(i).setEstado(Estado.PENDIENTE);
            }
            return true;
        }
    }
    return false;
    }

    public ArrayList<Tarea> getTareas() {
        return tareas;
    }

    public void setTareas(ArrayList<Tarea> Tareas) {
        this.tareas = Tareas;
    }
    
    @Override
    public String toString() {
        return "Tareas=\n" + tareas + '}';
    }
    
}
