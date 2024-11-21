import java.util.Stack;
import java.util.Scanner;
import java.util.Arrays;

public class PilaFibonacci{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("\nIngrese el tamaño de la pila: ");
        int tam = entrada.nextInt();

        Stack<Integer> pilaOriginal = generarPila(tam);
        System.out.println("\nPila original: \n" + pilaOriginal);
        System.out.print("\nSecuencia fibonacci: ");
        generarFibonacci(pilaOriginal);

        Stack<Integer> pilaOrdenada = ordenarPila(pilaOriginal);
        System.out.println("\n\nPila ordenada: \n" + pilaOrdenada);

        int opcion;
        do{
            System.out.print("\nIngrese un elemento a eliminar: ");
            int elemento = entrada.nextInt();
            System.out.print("\nPila ordenada: \n" + buscarElemento(pilaOrdenada, elemento));
            System.out.print("\n¿Desea seguir eliminando elementos? (1. Si)(2. No): ");
            opcion = entrada.nextInt();
        }while(opcion == 1);
    }

    // Método que genera una pila copn números aleatorios de tamaño ingresado por el usuario ...
    public static Stack<Integer> generarPila(int tam){
        Stack<Integer> pilaGenerada = new Stack<>();

        for (int i = 0; i < tam; i++) {
            pilaGenerada.push( (int) (Math.random()*50+1) );
        }

        return pilaGenerada;
    }

    // Método para generar secuencia Fibonacci ...
    public static void generarFibonacci(Stack<Integer> pila){
        Stack<Integer> copiaPila = new Stack<>();
        copiaPila.addAll(pila); // Se crea una copia de la pila para no vaciar la pila original ...

        int max = copiaPila.size();
        int primero = 0;
        int segundo = 1;
        int fibonacci = 0;

        // Se imprimen los dos primeros números de la secuencia Fibonacci ...
        System.out.print(primero + " " + segundo + " ");

        for (int i = 0; i < max; i++) {

            fibonacci = primero + segundo;
            System.out.print(fibonacci + " ");

            primero = copiaPila.pop();
            segundo = fibonacci;
        }
    }

    // Método para ordenar de manera ascendente una pila
    public static Stack<Integer> ordenarPila(Stack<Integer> pila){
        int tam = pila.size();
        int [] arreglo = new int[tam];

        for (int i = 0; i < tam; i++) {
            arreglo[i] = pila.pop();
        }

        Arrays.sort(arreglo);

        for (int i = 0; i < tam; i++) {
            pila.push(arreglo[i]);
        }

        return pila;
    }

    // Método para buscar un elemento y eliminarlo ...
    public static Stack<Integer> buscarElemento(Stack<Integer> pila, int elemento){
        Stack<Integer> aux = new Stack<>();
        boolean encontrado = false;

        if(!pila.isEmpty())
        {
            while(!encontrado){
                aux.push(pila.pop());      
                if(aux.peek() == elemento){
                    aux.pop();
                    encontrado = true;
                }
            }
        
            while(!aux.isEmpty()){
                pila.push(aux.pop());
            }

            if(!encontrado){
                System.out.println("No se encontró el elemento ingresado en la PILA ...");
            }

        }else{
            System.out.println("La pila está vacía");
        }
        return pila;
    }
}