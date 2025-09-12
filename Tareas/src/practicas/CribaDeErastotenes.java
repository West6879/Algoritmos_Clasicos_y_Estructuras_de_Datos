package practicas;

import java.util.ArrayList;

public class CribaDeErastotenes {

    private final static ArrayList<Integer> lista = new ArrayList<>();
    private final static ArrayList<Boolean> eliminar = new ArrayList<>();

    public static void main(String[] args) {
        initArreglo(20);
        criba();
        printArreglo();
        eliminar();
        printArreglo();
    }

    public static void criba() {
        for(int ind = 0; ind <lista.size(); ind++) {
            if(eliminar.get(ind)) continue;
            int divisor = lista.get(ind);
            if(Math.pow(divisor, 2) >= lista.get(lista.size()-1)) break;
            for(int i = ind + 1; i < lista.size(); i++) {
                if(lista.get(i) % divisor == 0) {
                    eliminar.set(i, true);
                }
            }
        }
    }

    public static void eliminar() {
        for(int i = lista.size() - 1; i >= 0; i--) {
            if(eliminar.get(i)) {
                lista.remove(i);
                eliminar.remove(i);
            }
        }
    }

    public static void initArreglo(int limite) {
        for(int ind = 1; ind < limite; ind++) {
            lista.add(ind + 1);
            eliminar.add(false);
        }
    }

    public static void printArreglo() {
        System.out.println("\n\n");
        for(Integer ind : lista) {
            System.out.print(" " + ind + " ");
        }
        System.out.println("\n\n");
    }

}
