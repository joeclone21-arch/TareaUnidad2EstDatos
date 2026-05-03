/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estdatosuni2;

/**
 *
 * @author USER
 */
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class AdminTareas {
    // Usamos Deque para la pila (pendientes)
    private Deque<Tarea> pendientes;
    // Seguimos usando Queue para las completadas
    private Queue<Tarea> completadas;

    public AdminTareas() {
        // ArrayDeque se implementa para una pila
        this.pendientes = new ArrayDeque<>();
        this.completadas = new LinkedList<>();
    }

    // 1. Agregar tarea (Push a la cima de la pila)
    public void agregarTarea(String desc) {
        pendientes.push(new Tarea(desc)); 
        System.out.println("Tarea agregada con exito.");
    }

    // 2. Marcar como completada (Pop de la cima)
    public void marcarCompletada() {
        if (!pendientes.isEmpty()) {
            Tarea tarea = pendientes.pop(); 
            completadas.add(tarea);
            System.out.println("Completada: " + tarea.getDescripcion());
        } else {
            System.out.println("No hay tareas pendientes.");
        }
    }

    // 3. Eliminar tarea pendiente
    public void eliminarTarea() {
        if (!pendientes.isEmpty()) {
            Tarea eliminada = pendientes.pop();
            System.out.println("Eliminada: " + eliminada.getDescripcion());
        } else {
            System.out.println("Nada que eliminar");
        }
    }

    // 4. Ver todas las tareas pendientes
    public void verPendientes() {
        if (pendientes.isEmpty()) {
            System.out.println("No hay pendientes");
        } else {
            System.out.println("Tareas Pendientes (LIFO)");
            // Al iterar un Deque con for-each lo hace de la cima a base
            for (Tarea t : pendientes) {
                System.out.println(t);
            }
        }
    }

    // 5. Ver proxima tarea (Peek a la cima sin eliminar)
    public void verProximaTarea() {
        if (!pendientes.isEmpty()) {
            System.out.println("Proxima tarea: " + pendientes.peek());
        } else {
            System.out.println("No hay tareas proximas");
        }
    }
}
