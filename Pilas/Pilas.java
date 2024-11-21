import java.util.Scanner;
import java.util.Stack;

public class Pilas {
    public static void main(String[] args) {
        Stack<Integer> numberStack = new Stack<>();
        Scanner entrada = new Scanner(System.in);
        int opcion;
        
        System.out.print(" ------ Menú Stack ----- \n" +
                            "1. Ingresar elemento\n" +
                            "2. Imprimir Stack\n" +
                            "3. Imprimir Cima\n" +
                            "4. Finalizar programa\n");
        
        do{
            System.out.print("\nIngrese opción: ");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese elemento númerico a la lista: ");
                    int newNumber = entrada.nextInt();
                    numberStack.push(newNumber);
                    break;
                case 2:
                    System.out.println("\n PILA INGRESADA: ");
                    System.out.println(numberStack);
                    break;
                case 3:
                    System.out.print(" \n CIMA PILA: " + numberStack.peek());
                    break;
                case 4:
                    System.out.println("Cerrando programa ... ");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor ingrese de nuevo: ");
                    break;
            }
        }while(opcion != 4);
        
    }
}