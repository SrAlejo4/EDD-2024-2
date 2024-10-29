import java.util.Scanner;

public class EstudianteDiseno extends Persona {
    private String modalidadEstudio;
    private int cantidadAsignaturas;


    public EstudianteDiseno(String cedula, String nombre, String apellido, String telefono, String modalidadEstudio, int cantidadAsignaturas) {
        super(cedula, nombre, apellido, telefono);
        this.modalidadEstudio = validarModalidad(modalidadEstudio);
        this.cantidadAsignaturas = validarEntero(cantidadAsignaturas, "Cantidad de Asignaturas");
    }

    private String validarModalidad(String modalidad) {
        while (!modalidad.equalsIgnoreCase("presencial") && !modalidad.equalsIgnoreCase("virtual")) {
            System.out.println("Modalidad inválida. Ingrese 'presencial' o 'virtual':");
            modalidad = new Scanner(System.in).nextLine();
        }
        return modalidad;
    }

    private int validarEntero(int valor, String campo) {
        while (valor <= 0) {
            System.out.println(campo + " inválido. Ingrese un número positivo:");
            valor = new Scanner(System.in).nextInt();
        }
        return valor;
    }

    // Getters
    public String getModalidadEstudio() { return modalidadEstudio; }
    public int getCantidadAsignaturas() { return cantidadAsignaturas; }
}

