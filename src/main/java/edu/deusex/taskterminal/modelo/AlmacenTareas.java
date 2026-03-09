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
    
    private Integer id = 1;
    
    private ArrayList<Tarea> tareas;

    public AlmacenTareas(String cuerpo) {
        this.tareas = new ArrayList<>();
        agregarTarea(cuerpo);
    }

    public Boolean agregarTarea (String cuerpo){
        Tarea nuevaTarea = new Tarea (id, cuerpo);
        id++;
       tareas.add(nuevaTarea);
        return true;
    }
    
    public Boolean eliminarporId (Integer Id){
        for (int i = 0; i< tareas.size(); i++ ){
            if (tareas.get(i).getId().equals(Id))
                tareas.remove(i);
                return true;
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
        return "AlmacenTareas{" + "Tareas=" + tareas + '}';
    }
    
}
