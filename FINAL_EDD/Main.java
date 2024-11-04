import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        ComputadorPortatil computador = new ComputadorPortatil();
        TabletaGrafica tableta = new TabletaGrafica();
        SubMenu sub_menu = new SubMenu();
        Scanner sc = new Scanner(System.in);
        int opcion;

        // Importamos archivos de listas para persistencia de datos
        ImportarListas importarArchivos = new ImportarListas();
        inventario.setEstudiantesIngenieria(importarArchivos.importarEstudiantesIngenieria(inventario.getEstudiantesIngenieria()));
        inventario.setEstudiantesDiseno(importarArchivos.importarEstudiantesDiseno(inventario.getEstudiantesDiseno()));
        inventario.setComputadores(importarArchivos.importarPortatiles(inventario.getComputadoresPortatiles()));
        inventario.setTabletas(importarArchivos.importarTabletas(inventario.getTabletaGraficas()));
        computador.setContadorIngenieria(importarArchivos.importarSerialIngenieria());
        tableta.setContadorDiseno(importarArchivos.importarSerialDiseno());
        

        do {
            System.out.println("==== MENÚ PRINCIPAL ====");
            System.out.println("1. Agregar Estudiantes y Equipos");
            System.out.println("2. Gestión de Estudiantes de Ingeniería");
            System.out.println("3. Gestión de Estudiantes de Diseño");
            System.out.println("4. Imprimir Inventario");
            System.out.println("5. Guardar información (Exportar Listas)");
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
                    sub_menu.ExportarArchivos(inventario);
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 6);
    }
}
