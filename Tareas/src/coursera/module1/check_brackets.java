package coursera.module1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

class Bracket {
    Bracket(char type, int position) {
        this.type = type;
        this.position = position;
    }

    boolean Match(char c) {
        if (this.type == '[' && c == ']')
            return true;
        if (this.type == '{' && c == '}')
            return true;
        if (this.type == '(' && c == ')')
            return true;
        return false;
    }

    char type;
    int position;
}

class check_brackets {
    public static void main(String[] args) throws IOException {
        InputStreamReader input_stream = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input_stream);
        String text = reader.readLine();
        int lastBracket = 0; // Variable para guardar el último paréntesis fallado.

        Stack<Bracket> opening_brackets_stack = new Stack<Bracket>();
        for (int position = 0; position < text.length(); ++position) {
            char next = text.charAt(position);

            if (next == '(' || next == '[' || next == '{') {
                // Process opening bracket, write your code here
                // Añadir los paréntesis de apertura a la stack.
                opening_brackets_stack.push(new Bracket(next, position + 1));
            }

            if (next == ')' || next == ']' || next == '}') {
                // Process closing bracket, write your code here
                // Si es un paréntesis de cerrar y la stack esta vacía, significa que este paréntesis esta mal.
                if(opening_brackets_stack.isEmpty()) {
                    lastBracket = position + 1;
                    break;
                }
                // Saca el último paréntesis de apertura añadido.
                Bracket bracket = opening_brackets_stack.pop();
                if(!bracket.Match(next)) { // Si el paréntesis no matchea bien con el de cerradura.
                    lastBracket = position + 1; // Retorna la posición del paréntesis de cerradura fallado.
                    break;
                }
            }

        }

        // Printing answer, write your code here
        // Si la stack está vacía y la variable nunca cambio, significa que todos los paréntesis matchearon bien.
        if(lastBracket == 0 && opening_brackets_stack.isEmpty()) {
            System.out.println("Success");
        } else if(lastBracket != 0){ // Si la stack no esta vacía pero la variable cambio.
            System.out.println(lastBracket); // Imprime la posición del primer paréntesis de cerradura mal.
        } else {
            // Si no, entonces imprime la posición del primer paréntesis de apertura que falla.
            System.out.println(opening_brackets_stack.peek().position);
        }
    }
}
