import java.util.ArrayList;
import java.util.Scanner;

public class Inventario {
    private ArrayList<EstudianteIngenieria> estudiantesIngenieria = new ArrayList<>();
    private ArrayList<EstudianteDiseno> estudiantesDiseno = new ArrayList<>();
    private ArrayList<ComputadorPortatil> computadores = new ArrayList<>();
    private ArrayList<TabletaGrafica> tabletas = new ArrayList<>();

    // Getters de las listas
    public ArrayList<EstudianteIngenieria> getEstudiantesIngenieria()  {return estudiantesIngenieria;}
    public ArrayList<EstudianteDiseno> getEstudiantesDiseno() { return estudiantesDiseno;}
    public ArrayList<ComputadorPortatil> getComputadoresPortatiles() { return computadores;}
    public ArrayList<TabletaGrafica> getTabletaGraficas() { return tabletas;}
    // Setters de la listas
    public void setEstudiantesIngenieria(ArrayList<EstudianteIngenieria> estudiantesIngenieria) {this.estudiantesIngenieria = estudiantesIngenieria; }
    public void setEstudiantesDiseno(ArrayList<EstudianteDiseno> estudiantesDiseno) {this.estudiantesDiseno = estudiantesDiseno; }
    public void setComputadores(ArrayList<ComputadorPortatil> computadores) {this.computadores = computadores; }
    public void setTabletas(ArrayList<TabletaGrafica> tabletas) {this.tabletas = tabletas; }

    // Registrar préstamo para estudiantes de Ingeniería
    public void registrarPrestamoIngenieria(String cedula, String serialEquipo) {
        for (EstudianteIngenieria estudiante : estudiantesIngenieria) {
            if (estudiante.getCedula().equals(cedula) && estudiante.getSerial().isEmpty()) {
                for (ComputadorPortatil comp : computadores) {
                    if (comp.getSerial().equals(serialEquipo) && !comp.isPrestado()) {
                        estudiante.setSerial(serialEquipo);
                        comp.setPrestado(true);
                        System.out.println("Préstamo registrado correctamente.");
                        return;
                    }
                }
                System.out.println("Préstamo NO registrado correctamente.");
                return;
            }
        }
        System.out.println("Estudiante no encontrado o ya tiene equipo prestado.");
    }

    // Registrar préstamo para estudiantes de Diseño
    public void registrarPrestamoDiseno(String cedula, String serialEquipo) {
        for (EstudianteDiseno estudiante : estudiantesDiseno) {
            if (estudiante.getCedula().equals(cedula) && estudiante.getSerial().isEmpty()) {
                for (TabletaGrafica tableta : tabletas) {
                    if (tableta.getSerial().equals(serialEquipo) && !tableta.isPrestado()) {
                        estudiante.setSerial(serialEquipo);
                        tableta.setPrestado(true);
                        System.out.println("Préstamo registrado correctamente.");
                        return;
                    }
                }
                System.out.println("Préstamo NO registrado correctamente.");
                return;
            }
        }
        System.out.println("Estudiante no encontrado o ya tiene equipo prestado.");
    }

    public void modificarPrestamo(String identificador) {
        Scanner sc = new Scanner(System.in);
        Persona estudiante = buscarEstudiantePorIdentificador(identificador);

        if (estudiante == null) {
            System.out.println("Estudiante no encontrado.");
            return;
        }

        if (!estudiante.getSerial().isEmpty()) {
            liberarEquipo(estudiante.getSerial());
        }

        System.out.println("Seleccione el nuevo equipo para el préstamo:");
        if (estudiante instanceof EstudianteIngenieria) {
            mostrarPortatilesDisponibles();
            System.out.println("Ingrese el serial del nuevo portátil:");
        } else if (estudiante instanceof EstudianteDiseno) {
            mostrarTabletasDisponibles();
            System.out.println("Ingrese el serial de la nueva tableta:");
        }

        String nuevoSerial = sc.nextLine();

        if (asignarNuevoEquipo(estudiante, nuevoSerial)) {
            System.out.println("El préstamo de equipo ha sido modificado exitosamente.");
        } else {
            System.out.println("No se pudo modificar el préstamo. Verifique que el equipo esté disponible.");
        }
    }

    private boolean asignarNuevoEquipo(Persona estudiante, String nuevoSerial) {
        // Para estudiantes de Ingeniería
        for (ComputadorPortatil portatil : computadores) {
            if (portatil.getSerial().equals(estudiante.getSerial()) && !portatil.isPrestado()) {
                estudiante.setSerial(nuevoSerial);  // Actualiza el serial en el estudiante
                portatil.setSerial(nuevoSerial);
                portatil.setPrestado(true);         // Marca el equipo como prestado
                return true;
            }
        }

        // Para estudiantes de Diseño
        for (TabletaGrafica tableta : tabletas) {
            if (tableta.getSerial().equals(estudiante.getSerial()) && !tableta.isPrestado()) {
                estudiante.setSerial(nuevoSerial);  // Actualiza el serial en el estudiante
                tableta.setSerial(nuevoSerial);
                tableta.setPrestado(true);          // Marca el equipo como prestado
                return true;
            }
        }
        return false;
    }

    private void liberarEquipo(String serial) {
        for (ComputadorPortatil portatil : computadores) {
            if (portatil.getSerial().equals(serial)) {
                portatil.setPrestado(false);
                break;
            }
        }
        for (TabletaGrafica tableta : tabletas) {
            if (tableta.getSerial().equals(serial)) {
                tableta.setPrestado(false);
                break;
            }
        }
    }

    private void mostrarPortatilesDisponibles() {
        System.out.println("Portátiles disponibles:");
        for (ComputadorPortatil portatil : computadores) {
            if (!portatil.isPrestado()) {
                System.out.println("Serial: " + portatil.getSerial());
            }
        }
    }

    private void mostrarTabletasDisponibles() {
        System.out.println("Tabletas disponibles:");
        for (TabletaGrafica tableta : tabletas) {
            if (!tableta.isPrestado()) {
                System.out.println("Serial: " + tableta.getSerial());
            }
        }
    }

    private Persona buscarEstudiantePorIdentificador(String identificador) {
        for (EstudianteIngenieria estudiante : estudiantesIngenieria) {
            if (estudiante.getCedula().equals(identificador) || estudiante.getSerial().equals(identificador)) {
                return estudiante;
            }
        }
        for (EstudianteDiseno estudiante : estudiantesDiseno) {
            if (estudiante.getCedula().equals(identificador) || estudiante.getSerial().equals(identificador)) {
                return estudiante;
            }
        }
        return null;
    }


    // Devolución de equipo
    public void devolverEquipo(String serial) {
        for (ComputadorPortatil comp : computadores) {
            if (comp.getSerial().equals(serial)) {
                comp.setPrestado(false);
                System.out.println("Equipo devuelto correctamente.");
                return;
            }
        }
        for (TabletaGrafica tableta : tabletas) {
            if (tableta.getSerial().equals(serial)) {
                tableta.setPrestado(false);
                System.out.println("Equipo devuelto correctamente.");
                return;
            }
        }
        System.out.println("No se encontró un equipo con ese serial.");
    }

    // Buscar equipo por cédula
    public void buscarEquipoPorCedula(String cedula) {
        for (EstudianteIngenieria estudiante : estudiantesIngenieria) {
            if (estudiante.getCedula().equals(cedula)) {
                System.out.println("Equipo asignado: " + estudiante.getSerial());
                return;
            }
        }
        for (EstudianteDiseno estudiante : estudiantesDiseno) {
            if (estudiante.getCedula().equals(cedula)) {
                System.out.println("Equipo asignado: " + estudiante.getSerial());
                return;
            }
        }
        System.out.println("No se encontró equipo para la cédula ingresada.");
    }

    // Buscar equipo por serial
    public void buscarEquipoPorSerial(String serial) {
        for (ComputadorPortatil comp : computadores) {
            if (comp.getSerial().equals(serial)) {
                System.out.println("Equipo " + serial + " está " + (comp.isPrestado() ? "prestado." : "disponible."));
                return;
            }
        }
        for (TabletaGrafica tableta : tabletas) {
            if (tableta.getSerial().equals(serial)) {
                System.out
                        .println("Equipo " + serial + " está " + (tableta.isPrestado() ? "prestado." : "disponible."));
                return;
            }
        }
        System.out.println("No se encontró un equipo con ese serial.");
    }

    // Imprimir inventario completo
    public void imprimirInventario() {
        System.out.println("Inventario de Computadores Portátiles:");
        for (ComputadorPortatil comp : computadores) {
            System.out.println("Serial: " + comp.getSerial() + " - Prestado: " + comp.isPrestado());
        }

        System.out.println("Inventario de Tabletas Gráficas:");
        for (TabletaGrafica tableta : tabletas) {
            System.out.println("Serial: " + tableta.getSerial() + " - Prestado: " + tableta.isPrestado());
        }
    }

    public int mostrarPortatiles() {
        System.out.println("Listado de Portátiles:");
        for (ComputadorPortatil comp : computadores) {
            System.out.println("Serial: " + comp.getSerial() + " - Prestado: " + (comp.isPrestado() ? "Sí" : "No"));
        }
        System.out.println("Total de portátiles en el inventario: " + computadores.size());
        return computadores.size();
    }

    public int mostrarTablet() {
        System.out.println("Listado de Tablet Graficas:");
        for (TabletaGrafica tab : tabletas) {
            System.out.println("Serial: " + tab.getSerial() + " - Prestado: " + (tab.isPrestado() ? "Sí" : "No"));
        }
        System.out.println("Total de tabletas gráficas en el inventario: " + tabletas.size());
        return tabletas.size();
    }

    public int leerOpcion(Scanner sc) { // Método que valida las entradas de opción a elegir
        int opcion = -1;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.println("Ingrese una opcion: ");
                opcion = Integer.parseInt(sc.next());
                entradaValida = true;
            } catch (NumberFormatException e) {
                System.out.println("Entrada no valida. Ingrese un numero");
            }
        }
        return opcion;
    }

    public float leerDecimalConComa(Scanner sc) {
        String entrada = "";
        boolean entradaValida = false;
        float decimal = 0;
        while(!entradaValida){
            try {
                if (!entrada.matches("\\d+,\\d+")) {
                    System.out.println("Ingrese un número decimal con coma (ejemplo: 10,5):");
                    entrada = sc.next();
                    entrada = entrada.replace(",", ".");
                    decimal = Float.parseFloat(entrada);
                    entradaValida = true;
                } else {
                    System.out.println("Formato inválido. Asegúrese de usar una coma (,) como separador decimal.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada no valida. Ingrese un numero");
            }
        }
        return decimal;
    }

    // Método que valida que el semestre del estudiante ingeniería sea ENTERO ...
    public int validarSemestre(Scanner sc) {
        int semestre = 0;
        boolean entradaValida = false;

        while (!entradaValida || semestre < 0) {
            try {
                System.out.println("Ingrese el semestre actual del estudiante: ");
                semestre = Integer.parseInt(sc.next());
                entradaValida = true;
            } catch (NumberFormatException e) {
                System.out.println("Entrada no valida. Ingrese un número entero positivo");
            }
        }
        return semestre;
    }

    // Método que valida que la cantAsignaturas de estudiante de diseño sea ENTERO ...
    public int validarAsignaturas(Scanner sc) {
        int cantAsignaturas = 0;
        boolean entradaValida = false;
        
        while(!entradaValida || cantAsignaturas < 0){
            try {
                System.out.println("Ingrese la cantidad de asignaturas: ");
                cantAsignaturas = Integer.parseInt(sc.next());
                entradaValida = true;
            } catch (NumberFormatException e) {
                System.out.println("Entrada no valida. Ingrese un número entero positivo");
            }
        }
        return cantAsignaturas;
    }

    // Método para validar el precio ingresado ...
    public float validarPrecio(Scanner sc){
        float checkedPrecio = 0;
        boolean entradaValida = false;

        while(!entradaValida){
            try{
                System.out.println("Ingrese el precio: ");
                checkedPrecio = Float.parseFloat(sc.next());
                entradaValida = true;
            }catch (NumberFormatException e){
                System.out.println("Entrada no valida. Ingrese un número entero positivo");   
            }
        }

        return checkedPrecio;
    }
    // Métodos para agregar estudiantes y equipos
    public void agregarEstudianteIngenieria(EstudianteIngenieria estudiante) {
        estudiantesIngenieria.add(estudiante);
        System.out.println("El estudiante de ingenieria fue registrado exitosamente");
    }

    public void agregarEstudianteDiseno(EstudianteDiseno estudiante) {
        estudiantesDiseno.add(estudiante);
        System.out.println("El estudiante de diseño fue registrado exitosamente");
    }

    public void agregarComputador(ComputadorPortatil comp) {
        computadores.add(comp);
        System.out.println("El computador fue registrado exitosamente");
    }

    public void agregarTableta(TabletaGrafica tableta) {
        tabletas.add(tableta);
        System.out.println("La tableta fue registrada exitosamente");
    }
}
