package practicas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MergeSort {

    public static void main(String[] args) {
        Random rand = new Random();
        // Cambiar el limite maximo de la lista aqui
        int size = rand.nextInt(50);
        System.out.println("Size: " + size);
        List<Estudiante> lista = new ArrayList<>(size);
        for(int ind = 0; ind < size; ind++) {
            lista.add(new Estudiante(rand.nextInt(1000), "Pepe", 4 * rand.nextDouble()));
        }
        // Cambiar el orden, true para ascendiente y false para descendiente
        lista = ordenarMergeSort(lista, true);
        for(int ind = 0; ind < size; ind++) {
            System.out.printf("%s [%d] Indice: %.2f\n", lista.get(ind).getNombre(), lista.get(ind).getMatricula(),
                    lista.get(ind).getIndiceAcademico());
        }
    }

    public static List<Estudiante> ordenarMergeSort(List<Estudiante> listaSinOrdenar, boolean ascendente) {
        if(listaSinOrdenar.size() <= 1) return listaSinOrdenar;
        int medio = listaSinOrdenar.size() / 2; // El medio de la lista
        List<Estudiante> izquierda = new ArrayList<>(listaSinOrdenar.subList(0, medio)); // Mitad izquierda
        List<Estudiante> derecha = new ArrayList<>(listaSinOrdenar.subList(medio, listaSinOrdenar.size())); // Mitad derecha

        // Usar recursividad para separar la lista en listas de 1 elemento
        izquierda = ordenarMergeSort(izquierda, ascendente);
        derecha = ordenarMergeSort(derecha, ascendente);

        return merge(listaSinOrdenar, izquierda, derecha, ascendente);
    }

    public static List<Estudiante> merge(List<Estudiante> resultado, List<Estudiante> izquierda,
                                         List<Estudiante> derecha, boolean ascendente) {
        int i = 0, j = 0, k = 0; // i = indice de izquierda, j = indice de derecha, k = indice de resultado
        while(i < izquierda.size() && j < derecha.size()) {
            // Comparar si el indice en la izquierda es menor a el de la derecha
            boolean comparacion = izquierda.get(i).getIndiceAcademico() <= derecha.get(j).getIndiceAcademico();
            // Si es ascendiente la comparacion tiene que ser verdadera, si descendiento lo contrario.
            if((ascendente && comparacion) || (!ascendente && !comparacion)) {
                resultado.set(k++, izquierda.get(i++));
            } else {
                resultado.set(k++, derecha.get(j++));
            }
        }
        // Llenar con los elementos restantes
        while(i < izquierda.size()) {
            resultado.set(k++, izquierda.get(i++));
        }
        while(j < derecha.size()) {
            resultado.set(k++, derecha.get(j++));
        }
        return resultado;
    }

}
