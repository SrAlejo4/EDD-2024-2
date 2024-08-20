import java.util.Scanner;

public class Ejercicio9 {
    private int filas;
    private int columnas;
    private int[][] matriz;
    private int posxMax;
    private int posyMax;

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
        this.posxMax = posxMax;
        this.posyMax = posyMax;

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(maxNum < matriz[i][j]){
                    maxNum = matriz[i][j];
                    this.posxMax = i;
                    this.posyMax = j;
                }
            }
        }

        int posx = this.posxMax;
        int posy = this.posyMax;
        System.out.println("\nLa posición del número MAYOR es  [" + (posx + 1)  + " , " + (posy + 1) + "] ");
        return maxNum;
    }

    public int minNum(){
            int minNum = 0;
            int posx = 0;
            int posy = 0;
    
            for(int i = 0; i < matriz.length; i++){
                for(int j = 0; j < matriz[i].length; j++){
                    if(minNum > matriz[i][j]){
                        minNum = matriz[i][j];
                        posx = i + 1;
                        posy = j + 1;
                    }
                }
            }
    
            System.out.println("\nLa posición del número MENOR es  [" + posx + " , " + posy + "] ");
            return minNum;
    }

    public void maxColumna(){
        for(int i = 0; i < matriz.length; i++){
            System.out.print(" " + matriz[i][this.posyMax] + " ");
        }
    }

    public void maxFila(){
        for(int j = 0; j < matriz.length; j++){
            System.out.print(" " + matriz[this.posxMax][j] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("\nIngrese la cantidad de filas de la matriz: ");
        int filas = entrada.nextInt();
        System.out.print("\nIngrese la cantidad de colummnas de la matriz: ");
        int columnas = entrada.nextInt();

        Ejercicio9 prueba = new Ejercicio9(filas, columnas);

        System.out.println("\n ----- MATRIZ GENERADA ----- \n");
        prueba.imprimirMatriz();
        System.out.println("El número MAYOR es: " + prueba.maxNum());
        System.out.println("El número MENOR es: " + prueba.minNum());
        System.out.println("\nLa columna del número mayor es : ");
        prueba.maxColumna();
        System.out.println("\nLa columna del número menor es : ");
        prueba.maxFila();

    }
}
