import java.util.Scanner;

public class Ejercicio10 {
    private String[][] matrizText;
    private int[][] matrizNum;

    // Constructor que inicializa el tamaño de las matrices ...
    public Ejercicio10(int filas, int columnas){
        this.matrizText = new String[filas][columnas];
        this.matrizNum = new int[filas][columnas];
    }

    public void llenarMatriz(){
        String cadena = "";
        Scanner entrada = new Scanner(System.in);
        for(int i = 0; i < this.matrizText.length; i++){
            for(int j = 0; j < this.matrizText[i].length; j++){
                System.out.print("Ingrese el texto para la posición [" + i + "," + j + "] : ");
                cadena = entrada.next();
                this.matrizText[i][j] = cadena;
            }
        }
    }

    public void imprimirMatrices(){
        // Imprimimos la matriz de STRINGS ...
        for(int i = 0; i < this.matrizText.length; i++){
            for(int j = 0; j < this.matrizText[i].length; j++){
                System.out.print(" " + this.matrizText[i][j] + " ");
            }
            System.out.println();
        }

        // Imprimimos la matriz de dígitos ...
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite la cantidad de filas de la matriz: ");
        int filas = entrada.nextInt();
        System.out.print("\nDigite la cantidad de columnas de la matriz: ");
        int columnas = entrada.nextInt();

        Ejercicio10 prueba = new Ejercicio10(filas, columnas);
        prueba.llenarMatriz();
        prueba.imprimirMatrices();

    }
}
