package practicas;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


class GrafoPractica {
    int origen;
    int destino;

    public GrafoPractica(int origen, int destino) {
        this.origen = origen;
        this.destino = destino;
    }

}

public class listaSecGrado {
    private static ArrayList<GrafoPractica> Arraylista;
    private static ArrayList<Integer> secuenciaGrados = new ArrayList<>(8);
    
    public listaSecGrado() {
        this.Arraylista = new ArrayList<GrafoPractica>();
    }

    public void agregarArista(int origen, int destino) {
        Arraylista.add(new GrafoPractica(origen, destino));
    }

    public void imprimirLista() {
        for (GrafoPractica grafoPractica : Arraylista) {
            System.out.println(grafoPractica.origen + " -> " + grafoPractica.destino);
        }
    }

    public static void llenar(){
        for(int i = 0; i < 9; i++){
            secuenciaGrados.add(0);
        }
    }

    public static void generarLista(){
        for(GrafoPractica arista : Arraylista){
            int valor = arista.origen;
            secuenciaGrados.set(valor - 1, secuenciaGrados.get(valor - 1) + 1);
            int valor1 = arista.destino;
            secuenciaGrados.set(valor1 - 1, secuenciaGrados.get(valor1 - 1) + 1);


        }
    }

    public static void main(String[] args) {
        listaSecGrado grafoPractica = new listaSecGrado();
        grafoPractica.agregarArista(1, 2);
        grafoPractica.agregarArista(1, 3);
        grafoPractica.agregarArista(2, 4);
        grafoPractica.agregarArista(2, 5);
        grafoPractica.agregarArista(3, 6);
        grafoPractica.agregarArista(3, 7);
        grafoPractica.agregarArista(4, 5);
        grafoPractica.agregarArista(4, 8);
        grafoPractica.agregarArista(5, 9);
        grafoPractica.agregarArista(6, 7);
        grafoPractica.agregarArista(7, 8);
        grafoPractica.agregarArista(8, 9);
        grafoPractica.agregarArista(9, 6);


        llenar();
        generarLista();

        System.out.println(secuenciaGrados);
    }

    public ArrayList<Integer> getSecuenciaGrados() {
        return secuenciaGrados;
    }
}
