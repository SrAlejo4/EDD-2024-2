import java.util.Scanner;

public class MainListaDoble {
    public static void main(String[] args) {
        ListaDoble myDoubleList = new ListaDoble();
        Scanner entrada = new Scanner(System.in);

        int opcion = 0, elemento;

        // Creamos un menú con DO - WHILE ... 
        do{
            System.out.print("\n ------- Menú de opciones ------- \n" +
                                "1. Agregar un nodo al Inicio\n" + 
                                "2. Agregar nodo al Final\n" +
                                "3. Mostrar Lista INICIO - FIN\n" + 
                                "4. Mostrar Lista FIN - INICIO\n" + 
                                "5. Salir\n" +
                                "Ingrese la opcion: ");

            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("\nIngrese el valor del Nodo: ");
                    elemento = entrada.nextInt();
                    myDoubleList.agregarNodoInicio(elemento);
                    System.out.println("- Nodo agregado al Inicio ... ");
                    break;
 
                case 2:
                    System.out.print("\nIngrese el valor del Nodo: ");
                    elemento = entrada.nextInt();
                    myDoubleList.agregarNodoFinal(elemento);
                    System.out.println("- Nodo agregado al Final ... ");
                    break;

                case 3:
                    System.out.println("\n ------- Lista INICIO - FIN ------- ");
                    myDoubleList.mostrarListaInicioFin();
                    break;

                case 4:
                    System.out.println("\n ------- Lista FIN - INICIO ------- ");
                    myDoubleList.mostrarListaFinInicio();
                    break;

                case 5:
                    System.out.println("\n ------ FIN PROGRAMA ------ ");
                    break;

                default:
                    System.out.println(" OPCIÓN NO VÁLIDA ");
                    break;
            }
        }while(opcion != 5);
    }
}
