public class ImprimirMatriz {
    // Método para imprimir la matriz ...
    public void imprimirMatriz(int[][] matriz){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(" " + matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
