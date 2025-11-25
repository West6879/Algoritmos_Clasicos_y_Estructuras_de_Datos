package practicas.recursividad;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de datos: ");
        int size = sc.nextInt();
        int[] arr  = new int[size];
        sc.nextLine();
        sc.close();

        Random random = new Random();
        for(int i = 0; i < size; i++) {
            arr[i] = random.nextInt(100000);
        }
        System.out.println("Arreglo aleatorio generado: ");
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        int iterativo = maximoIterativo(arr);
        System.out.println("El maximo iterativo es: " + iterativo);
        int recursivo = maximoRecursivo(arr, 0, arr.length - 1);
        System.out.println("El maximo recursivo es: " + recursivo);
    }

    // Complejidad temporal O(n)
    private static int maximoIterativo(int[] arr) {
        int maximo = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maximo){
                maximo = arr[i];
            }
        }
        return maximo;
    }

    private static int maximoRecursivo(int[] arr, int i, int j) {
        if(i == j)
            return arr[i];
        int mid = (i + j) / 2;
        int left =  maximoRecursivo(arr, i, mid);
        int right = maximoRecursivo(arr, mid + 1, j);
        return Math.max(left, right);
    }
}
