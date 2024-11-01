
public class EstudianteIngenieria extends Persona {
    private int semestreActual;
    private float promedioAcumulado;

    // Constructor vacío
    public EstudianteIngenieria(){}

    // Constructor para crear EstudianteIngenieria por entrada de usuario ...
    public EstudianteIngenieria(String cedula, String nombre, String apellido, String telefono, int semestreActual, float promedioAcumulado) {
        super(cedula, nombre, apellido, telefono);
        this.semestreActual = semestreActual;
        this.promedioAcumulado = promedioAcumulado;
    }

    // Constructor para crear EstudianteIngenieria si tiene equipo Prestado
    public EstudianteIngenieria(String serial, String cedula, String nombre, String apellido, String telefono, int semestreActual, float promedioAcumulado){
        super(serial, cedula, nombre, apellido, telefono);
        this.semestreActual = semestreActual;
        this.promedioAcumulado = promedioAcumulado;
    }

    // Getters
    public int getSemestreActual() { return semestreActual; }
    public float getPromedioAcumulado() { return promedioAcumulado; }
}


