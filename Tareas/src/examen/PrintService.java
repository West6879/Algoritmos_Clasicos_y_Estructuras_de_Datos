package examen;

import java.util.Date;

// Clase para manejar la adicion y el procesamiento de trabajos.
public class PrintService {

    private final PrintQueue printQueue;

    public PrintService(PrintQueue printQueue) {
        this.printQueue = printQueue;
    }

    // Metodo para enviar un trabajo.
    public void enviarTrabajo(String nombre, Prioridad prioridad) {
        if(prioridad == null) prioridad = Prioridad.M; // Si recibe null en prioridad, entonces se defaultea a M.
        PrintJob trabajo = new PrintJob(nombre, new Date(), prioridad); // Crea el nuevo trabajo con los datos.
        printQueue.add(trabajo); // Añade el trabajo a la cola.
        System.out.println("Trabajo enviado por " + nombre + " con prioridad " + prioridad + ".");
    }

    // Metodo para procesar solo un trabajo a la vez.
    public void procesarTrabajo() {
        if(!printQueue.isEmpty()) { // Cheque si la cola esta vacia.
            PrintJob trabajo = printQueue.dequeue(); // Si no lo esta, procesa el primer trabajo en orden.
            System.out.println("Procesado trabajo de " + trabajo.getNomUser() +
                    " con prioridad " + trabajo.getPrioridad() + " con fecha: " + trabajo.getDate() + ".");
        }
        else {
            // Mensaje si la cola esta vacia.
            System.out.println("La cola esta vacia, porfavor añada un trabajo para poder procesar.");
        }
    }

    // Metodo para procesar todos los trabajos de la cola.
    public void procesarTrabajos() {
        while(!printQueue.isEmpty()) { // Corre el bucle hasta que la cola este vacia.
             PrintJob trabajo = printQueue.dequeue(); // Llama el metodo dequeue para sacar el trabajo.
             System.out.println("Trabajo procesado de " + trabajo.getNomUser() +
                     " con prioridad " + trabajo.getPrioridad() + " con fecha: " + trabajo.getDate() + ".");
        }
    }

    // Getter de la cola.
    public PrintQueue getPrintQueue() {
        return printQueue;
    }

}
