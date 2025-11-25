package practicas.recursividad;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        System.out.println("Ingrese el numero de datos: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr  = new int[size];
        sc.nextLine();
        System.out.println("Ingrese cada dato separado por un espacio: ");
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int iterativo = sumarIterativo(arr);
        System.out.println("El valor de la suma iterativa es: " + iterativo);
        int recursivo = sumarRecursivo(arr, 0);
        System.out.println("El valor de la suma recursiva es: " + recursivo);
    }

    // Complejidad temporal O(n)
    private static int sumarIterativo(int[] a) {
        int total = 0;
        for (int i = 0; i < a.length; i++) {
            total += a[i];
        }
        return total;
    }

    private static int sumarRecursivo(int[] a, int i) {
        // Caso base, cuando el indice llegue al tamaño del arreglo, significa que termino de recorrer todo.
        if(i == a.length) {
            return 0;
        }
        // Sumar el índice actual y llamar recursivamente con el proximo índice.
        return a[i] + sumarRecursivo(a, i + 1);
    }
}
