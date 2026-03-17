/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.deusex.taskterminal.controlador;

import edu.deusex.taskterminal.modelo.AlmacenTareas;

/**
 *
 * @author NullTrace  
 */
public class Gestion {
    
    private AlmacenTareas almacen;

    public Gestion(String cuerpo) {
        this.almacen = new AlmacenTareas(cuerpo);
    }
    
    
    public String agregaTarea (String cuerpo){
        if (almacen.agregarTarea(cuerpo)){
            return "Se ha agregado una tarea";
        }else{
            return "Invente de nuevo, no se pudo agregar la tarea";
        }
    }
    
    public String eliminarTarea(Integer id){
        if (almacen.eliminarporId(id)){
            return "Se ha eliminado la tarea";
        }else{
            return "Intente de nuevo, no se pudo completar la operación";
        }    
    }
    
    public String cambiarEstado (Integer id){
        if(almacen.cambiarEstado(id)){
            return "Se ha cambiado su estado";
        }else{
            return "No se pudo cambiar la accion intente de nuevo";
        }
    }
    
    public String mostrarTareas(){
        return almacen.toString();
    }
}
