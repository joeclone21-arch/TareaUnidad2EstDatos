/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estdatosuni2;

import java.util.Scanner;

public class EstDatosUni2 {
    public static void main(String[] args) {
        AdminTareas sistema = new AdminTareas();
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\n--- SISTEMA DE GESTION DE TAREAS ---");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Marcar tarea como completada");
            System.out.println("3. Eliminar tarea pendiente");
            System.out.println("4. Ver todas las tareas pendientes");
            System.out.println("5. Ver proxima tarea");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Descripcion de la tarea: ");
                    sistema.agregarTarea(sc.nextLine());
                    break;
                case 2:
                    sistema.marcarCompletada();
                    break;
                case 3:
                    sistema.eliminarTarea();
                    break;
                case 4:
                    sistema.verPendientes();
                    break;
                case 5:
                    sistema.verProximaTarea();
                    break;
                case 6:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opción no valida.");
            }
        } while (opcion != 6);
        sc.close();
    }
}