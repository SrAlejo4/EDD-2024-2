import java.util.Scanner;

public class SubMenu {
    Inventario inventario = new Inventario();
    ExportarListas exportar = new ExportarListas();
    ComputadorPortatil computador = new ComputadorPortatil();
    TabletaGrafica tableta = new TabletaGrafica();
    Scanner sc = new Scanner(System.in);
    int opcion;

    // Menú para agregar estudiantes y equipos
    public void menuAgregar(Inventario inventario) {
        do {
            System.out.println("=== AGREGAR ESTUDIANTES Y EQUIPOS ===");
            System.out.println("1. Agregar Estudiante de Ingeniería");
            System.out.println("2. Agregar Estudiante de Diseño");
            System.out.println("3. Agregar Computador Portátil");
            System.out.println("4. Agregar Tableta Gráfica");
            System.out.println("5. Volver al menú principal");
            opcion = inventario.leerOpcion(sc);

            switch (opcion) {
                case 1:
                    // Agregar Estudiante de Ingeniería
                    System.out.println("Ingrese la cédula del estudiante:");
                    String cedulaIng = sc.next();
                    System.out.println("Ingrese el nombre del estudiante:");
                    String nombreIng = sc.next();
                    System.out.println("Ingrese el apellido del estudiante:");
                    String apellidoIng = sc.next();
                    System.out.println("Ingrese el teléfono del estudiante:");
                    String telefonoIng = sc.next();
                    int semestre = inventario.validarSemestre(sc);
                    System.out.println("Ingrese el promedio del estudiante:");
                    float promedio = inventario.leerDecimalConComa(sc);

                    EstudianteIngenieria estudianteIng = new EstudianteIngenieria(cedulaIng, nombreIng, apellidoIng,
                            telefonoIng, semestre, promedio);
                    inventario.agregarEstudianteIngenieria(estudianteIng);
                    break;

                case 2:
                    // Agregar Estudiante de Diseño
                    System.out.println("Ingrese la cédula del estudiante:");
                    String cedulaDis = sc.next();
                    System.out.println("Ingrese el nombre del estudiante:");
                    String nombreDis = sc.next();
                    System.out.println("Ingrese el apellido del estudiante:");
                    String apellidoDis = sc.next();
                    System.out.println("Ingrese el teléfono del estudiante:");
                    String telefonoDis = sc.next();
                    System.out.println("Ingrese la modalidad de estudio (presencial/virtual):");
                    String modalidad = sc.next();
                    int asignaturas = inventario.validarAsignaturas(sc);

                    EstudianteDiseno estudianteDis = new EstudianteDiseno(cedulaDis, nombreDis, apellidoDis,
                            telefonoDis, modalidad, asignaturas);
                    inventario.agregarEstudianteDiseno(estudianteDis);
                    break;

                case 3:
                    // Agregar Computador Portátil
                    String marca = "";
                    do {
                        System.out.println("Seleccione la marca del portátil:");
                        System.out.println("1. HP");
                        System.out.println("2. Dell");
                        System.out.println("3. Asus");
                        System.out.println("4. Lenovo");
                        opcion = inventario.leerOpcion(sc);
                        switch (opcion) {
                            case 1:
                                marca = "HP";
                                break;
                            case 2:
                                marca = "Dell";
                                break;
                            case 3:
                                marca = "Asus";
                                break;
                            case 4:
                                marca = "Lenovo";
                                break;
                            default:
                                System.out.println("Opción inválida. Intente de nuevo.");
                        }
                    } while (opcion < 1 || opcion > 4);

                    float tamano = 0;
                    do {
                        System.out.println("Seleccione el tamaño del portátil:");
                        System.out.println("1. 14 pulgadas");
                        System.out.println("2. 16 pulgadas");
                        opcion = inventario.leerOpcion(sc);
                        switch (opcion) {
                            case 1:
                                tamano = 14;
                                break;
                            case 2:
                                tamano = 16;
                                break;
                            default:
                                System.out.println("Opción inválida. Intente de nuevo.");
                        }
                    } while (opcion != 1 && opcion != 2);

                    String so = "";
                    do{
                        System.out.println("Seleccione el sistema operativo del portátil: ");
                        System.out.println("1. Windows 7");
                        System.out.println("2. Windows 10");
                        System.out.println("3. Windows 11");
                        opcion = inventario.leerOpcion(sc);
                        switch (opcion) {
                            case 1:
                                so = "Windows 7";
                                break;
                            case 2:
                                so = "Windows 10";
                                break;
                            case 3:
                                so = "Windows 11";
                                break;
                            default:
                                System.out.println("Opción inválida. Intente de nuevo.");
                                break;
                        }
                    }while (opcion < 1 || opcion > 4);

                    String procesador = "";
                    do {
                        System.out.println("Seleccione el procesador del portátil:");
                        System.out.println("1. AMD Ryzen");
                        System.out.println("2. Intel® Core™ i5");
                        opcion = inventario.leerOpcion(sc);
                        switch (opcion) {
                            case 1:
                                procesador = "AMD Ryzen";
                                break;
                            case 2:
                                procesador = "Intel® Core™ i5";
                                break;
                            default:
                                System.out.println("Opción inválida. Intente de nuevo.");
                        }
                    } while (opcion != 1 && opcion != 2);

                    float precioPortatil = inventario.validarPrecio(sc);

                    ComputadorPortatil portatil = new ComputadorPortatil(marca, tamano, so, procesador, precioPortatil);
                    inventario.agregarComputador(portatil);
                    break;

                case 4:
                    // Agregar tableta gráfica
                    String marcaTableta = "";
                    do {
                        System.out.println("Seleccione la marca de la tableta:");
                        System.out.println("1. Samsung");
                        System.out.println("2. Lenovo");
                        opcion = inventario.leerOpcion(sc);
                        switch (opcion) {
                            case 1:
                                marcaTableta = "Samsung";
                                break;
                            case 2:
                                marcaTableta = "Lenovo";
                                break;
                            default:
                                System.out.println("Opción inválida. Intente de nuevo.");
                        }
                    } while (opcion != 1 && opcion != 2);

                    String almacenamiento = "";
                    do{
                        System.out.println("Seleccione el almacenamiento de la tableta: ");
                        System.out.println("1. 256 GB");
                        System.out.println("2. 512 GB");
                        System.out.println("3. 1 TB");
                        opcion = inventario.leerOpcion(sc);
                        switch (opcion) {
                            case 1:
                                almacenamiento = "256 GB";
                                break;
                            case 2:
                                almacenamiento = "512 GB";
                                break;
                            case 3:
                                almacenamiento = "1 TB";
                                break;
                            default:
                                System.out.println("Opción inválida. Intente de nuevo.");
                                break;
                        }
                    }while (opcion < 1 || opcion > 3);

                    tamano = 0;
                    do {
                        System.out.println("Seleccione el tamaño de la tableta:");
                        System.out.println("1. 10 pulgadas");
                        System.out.println("2. 12 pulgadas");
                        opcion = inventario.leerOpcion(sc);
                        switch (opcion) {
                            case 1:
                                tamano = 10;
                                break;
                            case 2:
                                tamano = 12;
                                break;
                            default:
                                System.out.println("Opción inválida. Intente de nuevo.");
                        }
                    } while (opcion != 1 && opcion != 2);

                    System.out.println("Ingrese el peso de la tableta en kg:");
                    float pesoTableta = inventario.leerDecimalConComa(sc);
                    
                    float precioTableta = inventario.validarPrecio(sc);

                    TabletaGrafica tableta = new TabletaGrafica(marcaTableta, almacenamiento, tamano, pesoTableta, precioTableta);
                    inventario.agregarTableta(tableta);
                    break;

                case 5:
                    System.out.println("Volviendo al menú principal...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);
    }

    // Menú para gestión de estudiantes de Ingeniería
    public void menuIngenieria(Inventario inventario) {

        do {
            System.out.println("=== GESTIÓN DE ESTUDIANTES DE INGENIERÍA ===");
            System.out.println("1. Registrar préstamo");
            System.out.println("2. Modificar préstamo (Por serial o cédula)");
            System.out.println("3. Devolver equipo");
            System.out.println("4. Buscar equipo (Por serial o cédula)");
            System.out.println("5. Volver al menú principal");
            opcion = inventario.leerOpcion(sc);

            switch (opcion) {
                case 1:
                    if (inventario.mostrarPortatiles() > 0) {
                        System.out.println("Ingrese cédula del estudiante:");
                        String cedula = sc.next();
                        System.out.println("Ingrese serial del equipo a prestar:");
                        String serial = sc.next();
                        inventario.registrarPrestamoIngenieria(cedula, serial);
                    } else {
                        System.out.println("\nNo existen portátiles en el inventario.");
                    }
                    break;

                case 2:
                    inventario.mostrarPortatiles(); // Mostrar portátiles antes de modificar
                    System.out.println("Ingrese cédula o serial del equipo a modificar:");
                    String identificador = sc.next();
                    inventario.modificarPrestamo(identificador);
                    break;

                case 3:
                    System.out.println("Ingrese serial del equipo a devolver:");
                    String serialDevolver = sc.next();
                    inventario.devolverEquipo(serialDevolver);
                    break;

                case 4:
                    System.out.println("Ingrese cédula o serial del equipo a buscar:");
                    String buscar = sc.next();
                    inventario.buscarEquipoPorSerial(buscar);
                    break;

                case 5:
                    System.out.println("Volviendo al menú principal...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);
    }

    // Menú para gestión de estudiantes de Diseño
    public void menuDiseno(Inventario inventario) {

        do {
            System.out.println("=== GESTIÓN DE ESTUDIANTES DE DISEÑO ===");
            System.out.println("1. Registrar préstamo");
            System.out.println("2. Modificar préstamo (Por serial o cédula)");
            System.out.println("3. Devolver equipo");
            System.out.println("4. Buscar equipo (Por serial o cédula)");
            System.out.println("5. Volver al menú principal");
            opcion = inventario.leerOpcion(sc);

            switch (opcion) {
                case 1:
                    if (inventario.mostrarTablet() > 0) {
                        System.out.println("Ingrese cédula del estudiante:");
                        String cedula = sc.next();
                        System.out.println("Ingrese serial del equipo a prestar:");
                        String serial = sc.next();
                        inventario.registrarPrestamoDiseno(cedula, serial);
                    }else{
                    System.out.println("\nNo existen tabletas en el inventario.");
                    }
                    break;

                case 2:
                    inventario.mostrarTablet(); // Mostrar tabletas antes de modificar
                    System.out.println("Ingrese cédula o serial del equipo a modificar:");
                    String identificador = sc.next();
                    inventario.modificarPrestamo(identificador);
                    break;

                case 3:
                    System.out.println("Ingrese serial del equipo a devolver:");
                    String serialDevolver = sc.next();
                    inventario.devolverEquipo(serialDevolver);
                    break;

                case 4:
                    System.out.println("Ingrese cédula o serial del equipo a buscar:");
                    String buscar = sc.next();
                    inventario.buscarEquipoPorSerial(buscar);
                    break;

                case 5:
                    System.out.println("Volviendo al menú principal...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);
    }

    public void ExportarArchivos(Inventario inventario){
        exportar.exportarEstudiantesIngenieria(inventario.getEstudiantesIngenieria());
        exportar.exportarEstudiantesDiseno(inventario.getEstudiantesDiseno());
        exportar.exportarComputadores(inventario.getComputadoresPortatiles()); 
        exportar.exportarTabletas(inventario.getTabletaGraficas());
        exportar.exportarSeriales(computador, tableta);
        System.out.println("Información guardada y exportada con éxito");         
    }
}

