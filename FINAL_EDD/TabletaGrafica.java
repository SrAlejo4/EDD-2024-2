import java.util.Scanner;

public class TabletaGrafica {
    private String serial;
    private String marca;
    private String almacenamiento;
    private float tamano;
    private float peso;
    private float precio;
    private boolean prestado;
    private static int contadorDiseno = 1;

    // Constructor vacío
    public TabletaGrafica(){}

    // Constructor para crear una tableta gráfica por entrada de usuario
    public TabletaGrafica(String marca, String almacenamiento, float tamano, float peso, float precio) {
        this.serial = generarSerialDiseno();
        this.marca = validarCadena(marca, "Marca");
        this.almacenamiento = almacenamiento;
        this.tamano = tamano;
        this.peso = peso;
        this.precio = precio;
        this.prestado = false;  // Por defecto, no está prestado
    }

    // Constructor para Importar lista como un archivo
    public TabletaGrafica(String serial, String marca, String almacenamiento, float tamano, float peso, float precio, boolean prestado) {
        this.serial = serial;
        this.marca = marca;
        this.almacenamiento = almacenamiento;
        this.tamano = tamano;
        this.peso = peso;
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
    private String generarSerialDiseno() {
        String serialGenerado = String.format("DIS%03d", contadorDiseno);
        contadorDiseno++;
        return serialGenerado;
    }
    // Getters
    public String getSerial() { return serial; }
    public String getMarca() { return marca; }
    public String getAlmacenamiento() { return almacenamiento; }
    public float getTamano() { return tamano; }
    public float getPeso() { return peso; }
    public float getPrecio() { return precio; }
    public boolean isPrestado() { return prestado; }

    // Setters
    public void setPrestado(boolean prestado) { this.prestado = prestado; }
    public void setSerial(String serial) {this.serial = serial; }
}


