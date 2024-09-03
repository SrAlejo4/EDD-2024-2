package Ejercicio_9;

import java.util.Scanner;

//Se tiene una matriz 5*12 la cual cada fila corresponde a cada vendedor y sus ventas
// en el año, se requiere sumar por fila e identificar cuál de todos los vendedores vendió mas en el
// año y se debe mostrar el nombre y valor de la venta
//Solución: recorra una matriz 5* 12 y suma cada fila y las compara para saber cuál de los
// vendedores vendió mas
public class Ventas {
    private String nombre;
    private int[] ventas;

    public Ventas(String nombre, int[] ventas) {
        this.nombre = nombre;
        this.ventas = ventas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int[] getVentas() {
        return ventas;
    }

    public void setVentas(int[] ventas) {
        this.ventas = ventas;
    }

    public int sumarVent() {
        int total = 0;
        for (int venta : ventas) {
            total += venta;
        }
        return total;
    }

    public static Ventas leer(Scanner entrada, int meses) {
        System.out.println("Ingrese el nombre del vendedor:");
        String nombre = entrada.next();
        int[] ventas = new int[meses];
        for (int i = 0; i < meses; i++) {
            System.out.println("Ingrese las ventas del mes " + (i + 1) + " :");
            ventas[i] = entrada.nextInt();
        }
        return new Ventas(nombre, ventas);
    }
    public void Mostrar() {
        System.out.println("El vendedor con más ventas es : " + getNombre()+" con un total de: "+sumarVent()+" ventas");
    }

}
