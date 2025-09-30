package practicas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShiftDeArreglo {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("A");
        lista.add("B");
        lista.add("C");
        lista.add("D");
        lista.add("E");
        lista.add("F");
        lista.add("G");
        lista.add("H");

        System.out.println("Inicio:" + lista + "\n");
        shift(lista, 7);
        System.out.println("\nFinal:" + lista);

        String[] arr = new String[]{"A", "B", "C", "D", "E", "F", "G", "H"};
        shift2(arr, 7);
        System.out.println(Arrays.toString(arr));


    }

    /*
        Algoritmo en complejidad O(n), mas eficiente.
     */

    // Función principal para el shifteo de ambas mitades.
    public static void shift2(String[] arr, int T) {
        if(arr.length % 2 != 0) return;
        int medio = arr.length / 2;
        T = T % arr.length;
        int left = (T + 1) / 2;
        int right = T / 2;
        rotar2(arr, 0, medio - 1, left);
        rotar2(arr, medio, arr.length - 1, right);
    }

    // Funcion para rotar el subarreglo.
    public static void rotar2(String[] arr, int inicio, int fin, int T) {
        if(T == 0) return;
        reverse(arr, inicio, fin);
        reverse(arr, inicio, inicio + T - 1);
        reverse(arr, inicio + T, fin);
    }

    // Funcion para voltear los subarreglos.
    public static void reverse(String[] arr, int inicio, int fin) {
        while(inicio < fin) {
            String temp = arr[inicio];
            arr[inicio] = arr[fin];
            arr[fin] = temp;
            inicio++;
            fin--;
        }
    }

    /*
        Algoritmo en complejidad O(T * n), en el peor de los casos es O(n^2)
    */

    // Funcion para rotar subarreglos del arreglo, cada llamada rota una vez hacia la derecha.
    public static void rotar(List<String> lista, int inicio, int fin) {
        String ultimo = lista.get(fin);
        for(int i = fin; i > inicio; i--) {
            lista.set(i, lista.get(i - 1));
        }
        lista.set(inicio, ultimo);
        System.out.println(lista.subList(inicio, fin + 1)); // Descomentar si desea ver el proceso de rotación
    }

    // Funcion para hacer el proceso completo en ambas mitades
    public static void shift(List<String> lista, int T) {
        if(lista.size() % 2 != 0) return;
        T = T % lista.size(); // Prevenir que T > n - 1
        int mitad_1, mitad_2; // mitad_1: cantidad que se movera la primera mitad, mismo para mitad_2
        int medio = lista.size() / 2; // Medio del array

        if(T % 2 == 0) {
            mitad_1 = mitad_2 = T/2;
        } else {
            mitad_1 = (T/2) + 1;
            mitad_2 = T/2;
        }

        // Rotacion de la primera mitad
        for(int i = 0; i < mitad_1; i++) {
            rotar(lista, 0, medio - 1);
        }

        System.out.println();

        // Rotacion de la segunda mitad
        for(int j = 0; j < mitad_2; j++) {
            rotar(lista, medio, lista.size() - 1);
        }
    }

}
