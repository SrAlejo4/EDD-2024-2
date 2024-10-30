import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        SubMenu sub_menu = new SubMenu();
        Scanner sc = new Scanner(System.in);
        int opcion;

        ImportarListas importarArchivos = new ImportarListas();
        inventario.setComputadores(importarArchivos.importarPortatiles(inventario.getComputadoresPortatiles()));

        do {
            System.out.println("==== MENÚ PRINCIPAL ====");
            System.out.println("1. Agregar Estudiantes y Equipos");
            System.out.println("2. Gestión de Estudiantes de Ingeniería");
            System.out.println("3. Gestión de Estudiantes de Diseño");
            System.out.println("4. Imprimir Inventario");
            System.out.println("5. Exportar archivo de Listas");
            System.out.println("6. Salir");
            System.out.println("=========================");
            opcion = inventario.leerOpcion(sc);

            switch (opcion) {
                case 1:
                    sub_menu.menuAgregar(inventario);
                    break;
                case 2:
                    sub_menu.menuIngenieria(inventario);
                    break;
                case 3:
                    sub_menu.menuDiseno(inventario);
                    break;
                case 4:
                    inventario.imprimirInventario();
                    break;
                case 5:
                    sub_menu.menuExportarArchivos(inventario);
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 6);
    }
}
