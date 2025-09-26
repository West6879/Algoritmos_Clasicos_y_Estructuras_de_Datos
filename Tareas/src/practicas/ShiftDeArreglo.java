package practicas;

import java.util.ArrayList;

public class ShiftDeArreglo {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("A");
        lista.add("B");
        lista.add("C");
        lista.add("D");
        lista.add("E");
        lista.add("F");
        lista.add("G");
        lista.add("H");

        System.out.println("Inicio:" + lista + "\n");
        shift(lista, 6);
        System.out.println("\nFinal:" + lista);
    }

    /*
        Funcion para rotar subarreglos del arreglo, cada llamada rota una vez hacia la derecha.
    */
    public static void rotar(ArrayList<String> lista, int inicio, int fin) {
        String ultimo = lista.get(fin);
        for(int i = fin; i > inicio; i--) {
            lista.set(i, lista.get(i - 1));
        }
        lista.set(inicio, ultimo);
        System.out.println(lista.subList(inicio, fin + 1)); // Descomentar si desea ver el proceso de rotación
    }

    // T tiene que estar entre 1 y n-1, osea no puede ser mayor que el tamaño del array
    public static void shift(ArrayList<String> lista, int T) {
        if(lista.size() % 2 != 0) return;
        if(T > lista.size() - 1) return; // Descomentar esta linea si desea T > n-1
        int mitad_1, mitad_2;
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
