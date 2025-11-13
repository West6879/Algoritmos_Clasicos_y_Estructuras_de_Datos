package coursera.module1;

import java.util.*;
import java.io.*;

public class tree_height {
    class FastScanner {
		StringTokenizer tok = new StringTokenizer("");
		BufferedReader in;

		FastScanner() {
			in = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() throws IOException {
			while (!tok.hasMoreElements())
				tok = new StringTokenizer(in.readLine());
			return tok.nextToken();
		}
		int nextInt() throws IOException {
			return Integer.parseInt(next());
		}
	}

	public class TreeHeight {
		int n; // Total de nodos.
		int parent[]; // Arreglo de los padres de cada nodo.
		
		void read() throws IOException {
			FastScanner in = new FastScanner();
			n = in.nextInt();
			parent = new int[n];
			for (int i = 0; i < n; i++) {
				parent[i] = in.nextInt();
			}
		}

		int computeHeight() {
                        // Replace this code with a faster implementation
            if(n == 0) return 0; // Si n es 0, no hay nodos, la altura es 0.
            List<Integer>[] adj = new ArrayList[n]; // Crear una lista de adyacencia.
            for(int i = 0; i < n; i++) {
                // Inicializar la lista de adyacencia.
                adj[i] = new ArrayList<>();
            }
            int root = -1; // Variable para guardar la raiz.
            for(int i = 0; i < n; i++) {
                if(parent[i] == -1) { // Si en el arreglo de padres en indice, el valor es -1, ese es la raiz.
                    root = i; // Se guarda el indice de la raiz.
                } else {
                    adj[parent[i]].add(i); // Se guardan cada nodo con la listas de todos sus hijos correspondientes.
                }
            }

            if(root == -1) return 0; // Si no se encontro raiz, no es un arbol, retorna altura 0.
            return dfs(root, adj);
		}

        private static int dfs(int root, List<Integer>[] adj) {
            if(adj[root].isEmpty()) return 1; // Si el nodo no tiene hijos, retorna 1.

            int maxHeight = 0; // Variable para la altura
            for(int v : adj[root]) { // Recorre cada hijo del nodo padre.
                /*
                    Compara la altura actual con la altura que se consigue all llamar la función
                    recursivamente con el hijo actual. El proceso se repite hasta que se lleguen
                    a nodos que no tienen hijos, que retornaran 1.
                */
                maxHeight = Math.max(maxHeight, dfs(v, adj));
            }
            /*
                Cada nodo que tenga hijo retorna su altura más uno. Se repetirá hasta que
                cada nodo sea recorrido, y recursivamente se va añadiendo las alturas de cada
                rama y comparando entre diferentes ramas para encontrar la mayor altura.
            */
            return 1 + maxHeight;
        }
	}

	static public void main(String[] args) throws IOException {
            new Thread(null, new Runnable() {
                    public void run() {
                        try {
                            new tree_height().run();
                        } catch (IOException e) {
                        }
                    }
                }, "1", 1 << 26).start();
	}
	public void run() throws IOException {
		TreeHeight tree = new TreeHeight();
		tree.read();
		System.out.println(tree.computeHeight());
	}
}
