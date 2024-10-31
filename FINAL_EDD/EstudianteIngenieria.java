
public class EstudianteIngenieria extends Persona {
    private int semestreActual;
    private float promedioAcumulado;

    public EstudianteIngenieria(String cedula, String nombre, String apellido, String telefono, int semestreActual, float promedioAcumulado) {
        super(cedula, nombre, apellido, telefono);
        this.semestreActual = semestreActual;
        this.promedioAcumulado = promedioAcumulado;
    }

    // Getters
    public int getSemestreActual() { return semestreActual; }
    public float getPromedioAcumulado() { return promedioAcumulado; }
}


