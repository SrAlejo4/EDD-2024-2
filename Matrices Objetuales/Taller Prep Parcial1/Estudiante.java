import java.util.Scanner;

public class Estudiante {
    private String nombre;
    private char calificacion;
    Scanner entrada = new Scanner(System.in);

    public Estudiante() {
        super();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(char calificacion) {
        this.calificacion = calificacion;
    }

    // Método para llenar matriz Estudiantes ...
    public Estudiante[][] llenarMatrizEstudiantes(int tam){
        Estudiante[][] listado = new Estudiante[tam][tam];
        System.out.println("\n ---------- INGRESE LA INFORMACIÓN DE LOS ESTUDIANTES ---------- ");
        for (int i = 0; i < listado.length; i++) {
            for (int j = 0; j < listado.length; j++) {
                Estudiante infoE = new Estudiante();
                System.out.print("\nNombre: ");
                infoE.setNombre(entrada.next());
                System.out.print("Calificación: ");
                infoE.setCalificacion(entrada.next().charAt(0));
                listado[i][j] = infoE;
            }
        }
        return listado;
    }

    // Método para filtrar estudiantes por su calificación ...
    public void filtrarEstudiantes(Estudiante[][] matrizE, int tam){
        Estudiante[][] EstudiantesA = new Estudiante[tam][tam];
        Estudiante[][] EstudiantesB = new Estudiante[tam][tam];
        Estudiante[][] EstudiantesC = new Estudiante[tam][tam];
        
        for (int i = 0; i < matrizE.length; i++) {
            for (int j = 0; j < matrizE.length; j++) {
                if(matrizE[i][j].getCalificacion() == 'A'){ // Los datos de tipo char se escriben en COMILLAS SIMPLES ''
                    EstudiantesA[i][j] = matrizE[i][j];
                }
                else if(matrizE[i][j].getCalificacion() == 'B'){
                    EstudiantesB[i][j] = matrizE[i][j];
                }
                else if(matrizE[i][j].getCalificacion() == 'C'){
                    EstudiantesC[i][j] = matrizE[i][j];
                }
                else{
                    System.out.println("CALIFICACIÓN INGRESADA NO VÁLIDA .... ");
                }
            }
        }

        System.out.println("\n ---------- CALIFICACIÓN A ---------- ");
        mostrarListadoEstudiantes(EstudiantesA);
        System.out.println("\n ---------- CALIFICACIÓN B ---------- ");
        mostrarListadoEstudiantes(EstudiantesB);
        System.out.println("\n ---------- CALIFICACIÓN C ---------- ");
        mostrarListadoEstudiantes(EstudiantesC);

    }

    // Método que imprime matriz de tipo Estudiante ...
    public void mostrarListadoEstudiantes(Estudiante[][] matrizE) {
        for (int i = 0; i < matrizE.length; i++) {
            for (int j = 0; j < matrizE.length; j++) {
                if (matrizE[i][j] != null) {
                    System.out.println("Alumno: " + matrizE[i][j].getNombre());
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Estudiante grupoEDD = new Estudiante();

        System.out.print("\nIngrese el tamaño de la matriz ESTUDIANTES: ");
        int tam = entrada.nextInt();

        Estudiante[][] Mest = new Estudiante[tam][tam];
        Mest = grupoEDD.llenarMatrizEstudiantes(tam);
        grupoEDD.filtrarEstudiantes(Mest, tam);
    }

}
