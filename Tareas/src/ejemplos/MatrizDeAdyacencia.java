package ejemplos;

public class MatrizDeAdyacencia {
    int[][] matriz;

    MatrizDeAdyacencia(int numVertices) {
        this.matriz = new int[numVertices][numVertices];
    }

    public void agregar(int origen, int destino) {
        matriz[origen][destino] = 1;
        matriz[destino][origen] = 1; // Para grafos no dirigidos
    }

    public void imprimirMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        MatrizDeAdyacencia matrizDeAdyacencia = new MatrizDeAdyacencia(9);
        matrizDeAdyacencia.agregar(0, 1);
        matrizDeAdyacencia.agregar(0, 2);
        matrizDeAdyacencia.agregar(1, 3);
        matrizDeAdyacencia.agregar(1, 4);
        matrizDeAdyacencia.agregar(2, 5);
        matrizDeAdyacencia.agregar(2, 6);
        matrizDeAdyacencia.agregar(3, 4);
        matrizDeAdyacencia.agregar(3, 7);
        matrizDeAdyacencia.agregar(4, 8);
        matrizDeAdyacencia.agregar(5, 6);
        matrizDeAdyacencia.agregar(5, 8);
        matrizDeAdyacencia.agregar(6, 7);
        matrizDeAdyacencia.agregar(7, 8);

        matrizDeAdyacencia.imprimirMatriz();

    }
}