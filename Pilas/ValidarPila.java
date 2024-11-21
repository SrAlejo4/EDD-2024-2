import java.util.Stack;
import java.util.Scanner;

public class ValidarPila {
    public static void main(String[] args) {
        Stack<Integer> pilaNumeros = new Stack<>();
        Stack<Integer> pilaModificada = new Stack<>();
        Stack<Integer> pilaRaices = new Stack<>();

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de la pila: ");
        int tamano = entrada.nextInt();
        pilaNumeros = generarPila(tamano);
        System.out.println(pilaNumeros);

        pilaModificada = modificarPila(pilaNumeros);
        System.out.println(pilaModificada);
    }

    public static Stack<Integer> generarPila(int tamano){
        Stack<Integer> pila = new Stack<>();

        for (int i = 0; i < tamano; i++) {
            pila.push((int)(Math.random()*100+1));
        }

        return pila;
    }

    public static Stack<Integer> modificarPila(Stack<Integer> pila){
        Stack<Integer> pilaModificada = new Stack<>();
        int tamanoPila = pila.size();

        for (int i = 0; i < tamanoPila; i++) {
            int elementoPila = pila.pop();
            if (elementoPila < 0){
                pilaModificada.push(0);
            }else if(elementoPila >= 8 && elementoPila <= 20){
                pilaModificada.push(50);
            }else if(elementoPila > 60 && elementoPila < 62){
                pilaModificada.push(100);
            }else{
                pilaModificada.push(elementoPila);
            }
        }

        return pilaModificada;
    }
}
