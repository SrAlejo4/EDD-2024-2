import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lista_Doblemente Lista = new Lista_Doblemente();
        Scanner entrada = new Scanner(System.in);
        int opcion = 0, elemento;

        System.out.print("\n ------- Menú de opciones ------- \n" +
                "1. Agregar un nodo al Inicio\n" +
                "2. Agregar nodo al Final\n" +
                "3. Mostrar Lista INICIO - FIN\n" +
                "4. Mostrar Lista FIN - INICIO\n" +
                "5. Salir");

        do {
            System.out.print("\n Ingrese opción: ");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("\nIngrese el valor del Nodo: ");
                    elemento = entrada.nextInt();
                    Lista.agregarInicioList(elemento);
                    System.out.println("- Nodo agregado al Inicio ... ");
                    break;

                case 2:
                    System.out.print("\nIngrese el valor del Nodo: ");
                    elemento = entrada.nextInt();
                    Lista.agregarFinList(elemento);
                    System.out.println("- Nodo agregado al Final ... ");
                    break;

                case 3:
                    System.out.println("\n ------- Lista INICIO - FIN ------- ");
                    Lista.mostrarInicioFin();
                    break;

                case 4:
                    System.out.println("\n ------- Lista FIN - INICIO ------- ");
                    Lista.mostrarFinInicio();
                    break;

                case 5:
                    System.out.println("\n ------ FIN PROGRAMA ------ ");
                    break;
                    
                default:
                    System.out.println(" OPCIÓN NO VÁLIDA ");
                    break;
            }
        } while (opcion != 5);
    }
}
