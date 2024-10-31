
public class EstudianteIngenieria extends Persona {
    private int semestreActual;
    private float promedioAcumulado;

    // Constructor para crear EstudianteIngenieria por entrada de usuario ...
    public EstudianteIngenieria(String cedula, String nombre, String apellido, String telefono, int semestreActual, float promedioAcumulado) {
        super(cedula, nombre, apellido, telefono);
        this.semestreActual = semestreActual;
        this.promedioAcumulado = promedioAcumulado;
    }

    //Constructor para importar archivo de lista ...

    // Getters
    public String getCedula(){ return cedula; }
    public String getNombre(){ return nombre; }
    public String getApellido(){ return apellido; }
    public String getTelefono() { return telefono; }
    public int getSemestreActual() { return semestreActual; }
    public float getPromedioAcumulado() { return promedioAcumulado; }
}


