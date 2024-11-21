import java.util.Stack;
import java.util.Scanner;

public class InvertirCadena {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Stack<Character> pila = new Stack<>();

        System.out.print("Ingrese una cadena de texto: ");
        String cadena = entrada.nextLine();
        pila = InvertirPila(cadena);
        System.out.println(pila);
    }

    public static Stack<Character> InvertirPila(String cadena){
        char [] cadenaArray = cadena.toCharArray();
        Stack<Character> pilaOrdenada = new Stack<>();
        Stack<Character> pilaInvertida = new Stack<>();

        // For que recorre la lista de caracteres y agrega sus elementos en una pila ...
        for (int i = 0; i < cadenaArray.length; i++) {
            pilaOrdenada.push(cadenaArray[i]);
        }

        for (int i = 0; i < cadenaArray.length; i++) {
            pilaInvertida.push(pilaOrdenada.pop());
        }
        
        System.out.print("\nEl tamaño de la cadena es: " + cadenaArray.length + "\n");
        return pilaInvertida;
    }
}
