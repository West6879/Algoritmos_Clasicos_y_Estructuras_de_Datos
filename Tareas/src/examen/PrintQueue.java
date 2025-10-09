package examen;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

// Aqui esta la estructura de dato usada, un Queue.
public class PrintQueue {
    private final Queue<PrintJob> cola;

    // Constructor
    public PrintQueue() {
        this.cola = new PriorityQueue<>(Comparator.comparingInt((PrintJob t) -> t.getPrioridad().ordinal()).reversed()
                        .thenComparing(PrintJob::getDate));
        /*
            Se usa un PriorityQueue especificamente para ordenar la cola
            en base a las condiciones de prioridad y de tiempo, ya que se puede usar su parametro Comparator.
        */
    }

    // Metodo para añadir un trabajo a la cola.
    public void add(PrintJob job) {
        cola.offer(job);
    }
    // Metodo para sacar el siguiente trabajo de la cola.
    public PrintJob dequeue() {
        return cola.poll();
    }

    // Metodo con retorno boolean para verificar si la cola esta vacia.
    public boolean isEmpty() {
        return cola.isEmpty();
    }

}
