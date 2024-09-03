package Ejercicio_9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese la cantidad de vendedores");
        int numVendedores= entrada.nextInt();
        System.out.println("Ingrese la cantidad de meses");
        int meses =entrada.nextInt();
        Ventas[] vendedores= new Ventas[numVendedores];

        for (int i = 0; i < numVendedores; i++) {
            System.out.println("Vendedor "+ (i+1)+" : ");
            vendedores[i]=Ventas.leer(entrada,meses);


        }
        Analizar_Ventas analizarVentas= new Analizar_Ventas();
        Ventas mejorVendedor= analizarVentas.EvendeMaxV(vendedores);
        mejorVendedor.Mostrar();
    }
}
