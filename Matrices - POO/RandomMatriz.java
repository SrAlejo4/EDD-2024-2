import java.util.Random;

public class RandomMatriz{
    // Método para generar matriz con números aleatorios ...
    public int [][] generarMatriz(int fila, int columna){
        int[][] matriz = new int[fila][columna];
        Random numeroRandom = new Random();

        for(int i = 0; i < fila; i++){
            for(int j = 0; j < columna; j++){
                matriz[i][j] = numeroRandom.nextInt(41) - 20;
            }
        }

        return matriz; // Retornamos la matriz
    }
}
