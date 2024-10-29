import java.util.Scanner;

public abstract class Persona { // Con abstract se declara una clase que no se puede instanciar (Solo sirve de clase Padre)
    protected String cedula;
    protected String nombre;
    protected String apellido;
    protected String telefono;
    protected String serial;  // Serial del equipo prestado

    public Persona(String cedula, String nombre, String apellido, String telefono) {
        this.cedula = validarCed(cedula, "Cédula");
        this.nombre = validarCadena(nombre, "Nombre");
        this.apellido = validarCadena(apellido, "Apellido");
        this.telefono = validarTelefono(telefono);
        this.serial = "";  // No tiene equipo prestado inicialmente
    }

    // Validaciones
    public String validarCed(String input, String campo) {
        while (!input.matches("[0-9]+")) {
            System.out.println(campo + " inválido. Intente nuevamente:");
            input = new Scanner(System.in).nextLine();
        }
        return input;
    }

    public String validarCadena(String input, String campo) {
        while (!input.matches("[a-zA-Z]+")) {
            System.out.println(campo + " inválido. Intente nuevamente:");
            input = new Scanner(System.in).nextLine();
        }
        return input;
    }

    public String validarTelefono(String telefono) {
        while (!telefono.matches("\\d{10}")) {
            System.out.println("Teléfono inválido. Ingrese 10 dígitos:");
            telefono = new Scanner(System.in).nextLine();
        }
        return telefono;
    }

    // Métodos getter y setter
    public String getCedula() { return cedula; }
    public String getSerial() { return serial; }
    public void setSerial(String serial) { this.serial = serial; }
}


