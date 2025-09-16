package practicas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CribaDeErastotenes {

    private final static ArrayList<Integer> lista = new ArrayList<>();
    private final static ArrayList<Boolean> eliminar = new ArrayList<>();

    public static void main(String[] args) {
        initArreglo(20);
        criba();
        printArreglo(lista);
        eliminar();
        printArreglo(lista);
        printArreglo(cribaLogLog(20));
    }

    public static void criba() {
        for(int ind = 0; ind < lista.size(); ind++) {
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

    public static List<Integer> cribaLogLog(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = true;
        for(int i = 2; i * i <= n; i++) {
            if(isPrime[i]) {
                for(int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        List<Integer> primos = new ArrayList<>();
        for(int ind = 2; ind < isPrime.length; ind++) {
            if(isPrime[ind]) primos.add(ind);
        }
        return primos;
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

    public static void printArreglo(List<Integer> list) {
        System.out.println("\n");
        for(Integer ind : list) {
            System.out.print(" " + ind + " ");
        }
        System.out.println("\n");
    }

}
