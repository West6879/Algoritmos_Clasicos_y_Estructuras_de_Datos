package coursera.module1;

import java.util.*;
import java.io.*;

public class StackWithMax {
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

    public void solve() throws IOException {
        FastScanner scanner = new FastScanner();
        int queries = scanner.nextInt();
        Stack<Integer> stack = new Stack<Integer>();
        Stack<Integer> maxStack = new Stack<>(); // Crear otro stack para guardar los valores maximos.

        for (int qi = 0; qi < queries; ++qi) {
            String operation = scanner.next();
            if ("push".equals(operation)) {
                int value = scanner.nextInt();
                // Si las maxStack esta vacía o si el nuevo valor es mayor al valor de arriba de la maxStack.
                if(maxStack.isEmpty() || value >= maxStack.peek()) {
                    // Se añade a la maxStack.
                    maxStack.push(value);
                }
                stack.push(value);
            } else if ("pop".equals(operation)) {
                int value = stack.pop();
                // Solo se elimina de la maxStack si el valor por sacar es igual al del arriba de la maxStack.
                if(!maxStack.isEmpty() && value == maxStack.peek()) {
                    maxStack.pop();
                }
            } else if ("max".equals(operation)) {
                // Imprimir el valor de arriba de la maxStack.
                System.out.println(maxStack.peek());
            }
        }
    }

    static public void main(String[] args) throws IOException {
        new StackWithMax().solve();
    }
}
