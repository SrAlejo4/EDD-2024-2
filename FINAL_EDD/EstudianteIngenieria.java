import java.util.Scanner;

public class EstudianteIngenieria extends Persona {
    private int semestreActual;
    private float promedioAcumulado;

    public EstudianteIngenieria(String cedula, String nombre, String apellido, String telefono, int semestreActual, float promedioAcumulado) {
        super(cedula, nombre, apellido, telefono);
        this.semestreActual = validarEntero(semestreActual, "Semestre Actual");
        this.promedioAcumulado = validarFlotante(promedioAcumulado, "Promedio Acumulado");
    }

    private int validarEntero(int valor, String campo) {
        while (valor <= 0) {
            System.out.println(campo + " inválido. Ingrese un número positivo:");
            valor = new Scanner(System.in).nextInt();
        }
        return valor;
    }

    private float validarFlotante(float valor, String campo) {
        while (valor <= 0) {
            System.out.println(campo + " inválido. Ingrese un número positivo:");
            valor = new Scanner(System.in).nextFloat();
        }
        return valor;
    }

    // Getters
    public int getSemestreActual() { return semestreActual; }
    public float getPromedioAcumulado() { return promedioAcumulado; }
}


