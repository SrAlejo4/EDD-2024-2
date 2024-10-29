import java.util.Scanner;

public class ComputadorPortatil {
    private String serial;
    private String marca;
    private float tamano;
    private float precio;
    private boolean prestado;
    private static int contadorIngenieria = 1;

    public ComputadorPortatil(String marca, float tamano, float precio) {
        this.serial = generarSerialIngenieria();
        this.marca = validarCadena(marca, "Marca");
        this.tamano = tamano;
        this.precio = precio;
        this.prestado = false;  // Por defecto, no está prestado
    }

    private String validarCadena(String input, String campo) {
        while (!input.matches("[a-zA-Z]+")) {
            System.out.println(campo + " inválido. Intente nuevamente:");
            input = new Scanner(System.in).nextLine();
        }
        return input;
    }
    private String generarSerialIngenieria() {
        String serialGenerado = String.format("ING%03d", contadorIngenieria);
        contadorIngenieria++;
        return serialGenerado;
    }

    // Getters y Setters
    public String getSerial() { return serial; }
    public String getMarca() {return marca; }
    public float getTamano() {return tamano; }
    public float getPrecio() {return precio; }
    public boolean isPrestado() { return prestado; } // Getter de Prestado
    public void setPrestado(boolean prestado) { this.prestado = prestado; }
}

