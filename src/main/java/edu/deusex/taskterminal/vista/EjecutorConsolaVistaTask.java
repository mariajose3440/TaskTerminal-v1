/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.deusex.taskterminal.vista;

import edu.deusex.taskterminal.controlador.Gestion;
import java.util.Scanner;

/**
 *
 * @author NullTrace 
 * Clase ejecutora
 */
public class EjecutorConsolaVistaTask {

    private static void mostrarMenu(Gestion gestion) {
        System.out.println("----- TaskTerminal-----");
        System.out.println("Gestionador de Tareas: Menú");
        System.out.println("1.- Agregar Tarea");
        System.out.println("2.- Completar o poner en pendiente una Tarea");
        System.out.println("3,- Eliminar una Tarea");
        System.out.println("4.- Salir");
        String Tareas = gestion.mostrarTareas();
        System.out.println(Tareas);
    }

    private static String primeraEntrada(Scanner sc) {
        System.out.println("----- TaskTerminal-----");
        System.out.println("Gestionador de Tareas: Menú");
        System.out.println("Ingrese su primera tarea para comenzar: ");
        String primerTarea = sc.nextLine();
        while (primerTarea == null || primerTarea.isBlank()
                || !primerTarea.matches(".*[a-zA-ZáéíóúÁÉÍÓÚñÑ].*")) {
            System.out.println("Tarea inválida, debe contener al menos una letra: ");
            primerTarea = sc.nextLine();
        }
        return primerTarea;
    }

    private static int opcion(Scanner sc, Gestion gestion) {
        int option;
        mostrarMenu(gestion);
        System.out.print("Escriba la opcion a elegir: ");
         while (!sc.hasNextInt()) {
        System.out.println("Opción inválida, escriba un número: ");
        sc.next(); 
        }
        option = sc.nextInt();
        sc.nextLine(); 
        return option;
    }

    private static int leerEntrada(Scanner sc) {
        int option;
        System.out.print("Escriba el id de la Tarea para realizar la accion: ");
        option = sc.nextInt();
        return option;
    }

    private static String leerCuerpo(Scanner sc) {
        String cuerpo;
        System.out.println("Ingrese la descripción de su texto: ");
        cuerpo = sc.nextLine();
        return cuerpo;
    }

    private static void opcionElegida(int var, Gestion gestion, Scanner sc) {
        switch (var) {
            case 1:
                String cuerpo = leerCuerpo(sc);
                String mensajeAgregar = gestion.agregaTarea(cuerpo);
                System.out.println(mensajeAgregar);
                break;
            case 2:
                int idTarea = leerEntrada(sc);
                String mensajeCambio = gestion.cambiarEstado(idTarea);
                System.out.println(mensajeCambio);
                break;
            case 3:
                int option = leerEntrada(sc);
                String imprimir = gestion.eliminarTarea(option);
                System.out.println(imprimir);
                break;
            default:
                throw new AssertionError();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String primeraTarea = primeraEntrada(sc);
        Gestion gestion = new Gestion(primeraTarea);
        boolean continuar = true;

        while (continuar) {
            int var = opcion(sc, gestion);
            if (var < 1 || var > 4) {
                System.out.println("Opción inválida, elija entre 1 y 4");
                continue;
            }
            if (var == 4) {
                System.out.println("Hasta luego!");
                continuar = false;
            } else {
                opcionElegida(var, gestion, sc);
            }
        }
        sc.close();
    }

}
