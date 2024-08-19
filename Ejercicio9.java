import java.util.Scanner;

public class Ejercicio9 {
    private int filas;
    private int columnas;
    private int[][] matriz;

    public Ejercicio9(int filas, int columnas){
        this.filas = filas;
        this.columnas = columnas;
        RandomMatriz randomM = new RandomMatriz(); // Instanciamos la clase RandomMatriz ...
        this.matriz = randomM.generarMatriz(filas, columnas);
    }

    // Método que crea instancia de ImprimirMatriz ...
    public void imprimirMatriz(){
        ImprimirMatriz imprimirM = new ImprimirMatriz();
        imprimirM.imprimirMatriz(matriz);
    }
    
    // Método que retorna el mayor número de la matriz e imprime su posición ...
    public int maxNum(){
        int maxNum = 0;
        int posx = 0;
        int posy = 0;

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(maxNum < matriz[i][j]){
                    maxNum = matriz[i][j];
                    posx = i + 1;
                    posy = j + 1;
                }
            }
        }

        System.out.println("\nLa posición del número " + maxNum + " es "+ " [" + posx + " , " + posy + "] ");
        return maxNum;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ImprimirMatriz imprimirM = new ImprimirMatriz();

        System.out.print("\nIngrese la cantidad de filas de la matriz: ");
        int filas = entrada.nextInt();
        System.out.print("\nIngrese la cantidad de colummnas de la matriz: ");
        int columnas = entrada.nextInt();

        Ejercicio9 prueba = new Ejercicio9(filas, columnas);

        System.out.println("\n ----- MATRIZ GENERADA ----- \n");
        prueba.imprimirMatriz();
        System.out.println(prueba.maxNum());

    }
}
