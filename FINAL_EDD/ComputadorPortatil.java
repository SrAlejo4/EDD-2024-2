import java.util.Scanner;

public class ComputadorPortatil {

    private String serial;
    private String marca;
    private float tamano;
    private String so;
    private String procesador;
    private float precio;
    private boolean prestado;
    private static int contadorIngenieria = 1;

    // Constructor vacío
    public ComputadorPortatil(){}

    // Constructor para crear pórtatil que se ingrese por entrada de usuario
    public ComputadorPortatil(String marca, float tamano, String so, String procesador, float precio) {
        this.serial = generarSerialIngenieria();
        this.marca = validarCadena(marca, "Marca");
        this.tamano = tamano;
        this.so = so;
        this.procesador = procesador;
        this.precio = precio;
        this.prestado = false;  // Por defecto, no está prestado
    }

    // Constructor para Importar lista como un archivo
    public ComputadorPortatil(String serial, String marca, float tamano, String so, String procesador, float precio, boolean prestado){
        this.serial = serial;
        this.marca = marca;
        this.tamano = tamano;
        this.so = so;
        this.procesador = procesador;
        this.precio = precio;
        this.prestado = prestado;
    }

    private String validarCadena(String input, String campo) {
        while (!input.matches("[a-zA-Z]+")) {
            System.out.println(campo + " inválido. Intente nuevamente:");
            input = new Scanner(System.in).nextLine();
        }
        return input;
    }

    private String generarSerialIngenieria() {
        String serialGenerado = String.format("ING%03d", (contadorIngenieria + 1));
        contadorIngenieria++;
        return serialGenerado;
    }

    // Getters y Setters
    public String getSerial() { return serial; }
    public String getMarca() {return marca; }
    public float getTamano() {return tamano; }
    public String getSO() {return so; }
    public String getProcesador() {return procesador; }
    public float getPrecio() {return precio; }
    public boolean isPrestado() { return prestado; } // Getter de Prestado
    public int getContadorIngenieria() { return contadorIngenieria; }

    public void setPrestado(boolean prestado) { this.prestado = prestado; } // Setter de prestado
    public void setSerial (String serial) {this.serial = serial; }
    public void setContadorIngenieria (int contadorIngenieria) {this.contadorIngenieria = contadorIngenieria; }
}

