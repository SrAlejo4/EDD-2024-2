import java.util.Stack;
import java.util.Scanner;

// PENDIENTE IMPLEMENTAR COLA

public class sumaMatriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Stack<Integer> pilaSuma = new Stack<>();

        System.out.print("Ingrese la cantidad de filas: ");
        int filas = entrada.nextInt();
        System.out.print("Ingrese la cantidad de columnas: ");
        int columnas = entrada.nextInt();

        int[][] matriz = llenarMatriz(filas, columnas);
        imprimirMatriz(matriz);
        pilaSuma = sumarFilas(matriz);
        System.out.println("\n" + pilaSuma);

    }

    public static int[][] llenarMatriz(int filas, int columnas){
        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = (int) (Math.random()*50+1);
            }
        }

        return matriz;
    }

    public static Stack<Integer> sumarFilas(int[][] matriz){
        Stack<Integer> pilaSuma = new Stack<>();

        for (int i = 0; i < matriz.length; i++) {
            int sumaFilas = 0;
            for (int j = 0; j < matriz.length; j++) {
                sumaFilas += matriz[i][j];
            }
            pilaSuma.push(sumaFilas);
        }
        return pilaSuma;
    }

    public static void imprimirMatriz(int[][] matriz){
        System.out.println("");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
