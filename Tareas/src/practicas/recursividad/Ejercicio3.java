package practicas.recursividad;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la cadena a invertir: ");
        String s = sc.nextLine();
        System.out.println("Cadena invertida iterativa: ");
        System.out.println(invertirIterativo(s));
        System.out.println("Cadena invertida recursiva: ");
        System.out.println(invertirRecursivo(s, s.length() - 1));
    }

    // Complejidad temporal O(n)
    private static String invertirIterativo(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    // Complejidad temporal O(n)
    private static String invertirRecursivo(String s, int i) {
        // Caso base, cuando el índice sea 0.
        if(i == 0) {
            return s.charAt(i) + "";
        }
        // Caso recursivo, añadir el carácter actual con el proximo en orden decreciente.
        return s.charAt(i) + invertirRecursivo(s, i - 1);
    }

}
