package Ejercicio_10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la matriz");
        int cantidad= entrada.nextInt();
        Productos[][] matriz= new Productos[cantidad][cantidad];
        for (int i = 0; i < cantidad; i++) {
            for (int j = 0; j < cantidad; j++) {
                System.out.println("Productos en la posición ("+i+","+j+"): ");
                matriz[i][j]= Productos.leer(entrada);
            }
        }
        Oferta contarOferta=new Oferta();
        String totalOferta=contarOferta.contarProdOfer(matriz);
        System.out.println("El total de productos en oferta son: "+totalOferta);
    }
}
