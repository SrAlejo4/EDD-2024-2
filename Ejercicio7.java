import java.util.Random;

public class Ejercicio7 {

    // Método para generar matriz con números aleatorios ...
    public int [][] randomMatriz(int fila, int columna){
        int[][] matriz = new int[fila][columna];
        Random numeroRandom = new Random();

        for(int i = 0; i < fila; i++){
            for(int j = 0; j < columna; j++){
                matriz[i][j] = numeroRandom.nextInt(41) - 20;
            }
        }

        return matriz; // Retornamos la matriz
    }

    // Método para imprimir la matriz ...
    public void imprimirMatriz(int[][] matriz){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(" " + matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void positivosNegativos(){
        int filas = 5;
        int columnas = 6;
        int[][] matriz = randomMatriz(filas, columnas); // Creamos matriz con números aleatorios llamando al método randomMatriz
        int pos = 0;
        int neg = 0;
        int zero = 0;

        System.out.println("\n ----- EJERCICIO 7 ----- \n");
        imprimirMatriz(matriz);

        for(int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
                if(matriz[i][j] > 0){
                    pos++;
                }else if(matriz[i][j] < 0){
                    neg++;
                }else{
                    zero++;
                }
            }
        }

        System.out.println("\n La cantidad de números positivos es: " + pos + 
                            "\nLa cantidad de números negativos es: " + neg +
                            "\nLa cantidad de ceros de la matriz es: " + zero);
    }

    public static void main(String[] args) {
        Ejercicio7 prueba = new Ejercicio7();
        prueba.positivosNegativos();
    }
}
