import java.util.Scanner;

public class EstudianteDiseno extends Persona {
    private String modalidadEstudio;
    private int cantidadAsignaturas;

    // Constructor vacío
    public EstudianteDiseno(){}

    // Constructor para crear EstudianteDiseno por entrada de usuario
    public EstudianteDiseno(String cedula, String nombre, String apellido, String telefono, String modalidadEstudio, int cantidadAsignaturas) {
        super(cedula, nombre, apellido, telefono);
        this.modalidadEstudio = validarModalidad(modalidadEstudio);
        this.cantidadAsignaturas = cantidadAsignaturas;
    }

    //Constructor para crear EstudianteDiseno si tiene equipo prestado
    public EstudianteDiseno(String serial, String cedula, String nombre, String apellido, String telefono, String modalidadEstudio, int cantidadAsignaturas){
        super(serial, cedula, nombre, apellido, telefono);
        this.modalidadEstudio = validarModalidad(modalidadEstudio);
        this.cantidadAsignaturas = cantidadAsignaturas;
    }

    private String validarModalidad(String modalidad) {
        while (!modalidad.equalsIgnoreCase("presencial") && !modalidad.equalsIgnoreCase("virtual")) {
            System.out.println("Modalidad inválida. Ingrese 'presencial' o 'virtual':");
            modalidad = new Scanner(System.in).nextLine();
        }
        return modalidad;
    }

    // Getters
    public String getModalidadEstudio() {return modalidadEstudio; }
    public int getCantidadAsignaturas() {return cantidadAsignaturas; }

}
