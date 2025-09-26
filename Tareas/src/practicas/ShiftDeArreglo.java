package practicas;

import java.util.ArrayList;
import java.util.List;

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
        shift(lista, 5);
        System.out.println(lista);
    }

    public static void swap(ArrayList<String> lista, int i, int j) {
        String temp =  lista.get(i);
        lista.set(i, lista.get(j));
        lista.set(j, temp);
    }

    public static void shift(ArrayList<String> lista, int T) {
        if(lista.size() % 2 != 0 || T > lista.size() - 1) return;
        int mitad_1, mitad_2;
        int medio = lista.size() / 2;
        if(T % 2 == 0) {
            mitad_1 = mitad_2 = T/2;
        } else {
            mitad_1 = (T/2) + 1;
            mitad_2 = T/2;
        }
        for (int i = medio - T; i > 0; i--) {
            swap(lista, i, (i + mitad_1) % (lista.size()/2));
        }
        /*
        for(int i = 0; i < mitad_2; i++) {
            swap(lista, i + (lista.size() / 2), (i + (lista.size() / 2) + mitad_2) % (lista.size()));
        }
        */
    }

}
