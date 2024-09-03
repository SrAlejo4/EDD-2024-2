package Ejercicio_10;

import java.util.Scanner;

//10)	Se tiene un matriz con n productos y se requiere saber cuántos productos están en oferta
//Solución cree una matriz cuadrada e incremente la cantidad que productos en
// ofertas y muestre el total
public class Productos {
    private String nombre;
    private double precio;
    private boolean enOferta;

    public Productos(String nombre, double precio, boolean enOferta) {
        this.nombre = nombre;
        this.precio = precio;
        this.enOferta = enOferta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isEnOferta() {
        return enOferta;
    }

    public void setEnOferta(boolean enOferta) {
        this.enOferta = enOferta;
    }
    public static Productos leer (Scanner entrada){
        System.out.println("Ingrese el nombre del producto");
        String nombre= entrada.next();
        System.out.println("Ingrese el precio del producto");
        double precio= entrada.nextDouble();
        System.out.println("¿Este producto esta en oferta? (true/false): ");
        boolean enOferta= entrada.nextBoolean();

        return new Productos(nombre,precio,enOferta);
    }

}
