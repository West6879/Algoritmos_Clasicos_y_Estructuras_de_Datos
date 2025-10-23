package ejemplos;

import java.util.ArrayList;
import java.util.List;

public class DatoDinamico {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add(new String("Cien"));
        lista.add(new String("Cien"));
        System.out.println(lista.get(0).equals(lista.get(1)));

    }

}


