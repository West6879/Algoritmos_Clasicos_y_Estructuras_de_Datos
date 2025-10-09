package examen;

import java.util.Scanner;

// Clase principal, tambien maneja lo visual
public class PrintManager {

    public static void main(String[] args) {

        PrintService printService = new PrintService(new PrintQueue()); // Crea un nuevo servicio con una cola.
        int opcion = 0;
        Scanner scanner = new Scanner(System.in); // Scanner para el input del usuario.

        do {
            menu();

            if(scanner.hasNextInt()) opcion = scanner.nextInt(); // Solo lee eneteros.
            else scanner.next(); // Si no es un entero, sigue al siguiente token.

            switch(opcion) {
                case 1: {
                    System.out.println("Envio de trabajo");
                    System.out.println("Introduzca su nombre:");

                    scanner.nextLine();
                    String nombre = scanner.nextLine().trim();

                    System.out.println("Introduzca la prioridad (L, M, H):");
                    String input;

                    do { // Este bucle repetira el scanner hasta que se introduzca una prioridad valida.
                        input = scanner.nextLine().toUpperCase().trim();
                        if(input.isEmpty()) input = "M"; // Si no hay input, se defaultea a M.
                    } while(!input.equals("L") && !input.equals("M") && !input.equals("H"));

                    Prioridad prioridad = Prioridad.valueOf(input); // Convertir el string a un enum de prioridad.
                    printService.enviarTrabajo(nombre, prioridad); // Envia el trabajo a la cola.
                    break;
                }
                case 2: // Procesamiento de un solo trabajo.
                    if(!printService.getPrintQueue().isEmpty()) System.out.println("Trabajo Procesado:");
                    printService.procesarTrabajo();
                    break;
                case 3: // Procesamiento de todos los trabajos.
                    if(!printService.getPrintQueue().isEmpty()) System.out.println("Procesamiento de trabajos:");
                    printService.procesarTrabajos();
                    break;

            }
        } while(opcion != 4);
    }

    // Metodo para imprimir el menu principal.
    public static void menu() {
        System.out.println("Servicio de Impresion");
        System.out.println("1. Enviar trabajo.");
        System.out.println("2. Procesar un trabajo");
        System.out.println("3. Procesar todos los trabajos");
        System.out.println("4. Salir");
    }
}
