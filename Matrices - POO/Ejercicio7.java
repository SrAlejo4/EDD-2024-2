
public class Ejercicio7 {

    public void positivosNegativos(){
        RandomMatriz randomM = new RandomMatriz(); // Creamos una instancia de la clase RandomMatriz ...
        ImprimirMatriz imprimirM = new ImprimirMatriz(); // Creamos una instancia de la clase ImprimirMatriz ...

        int filas = 5;
        int columnas = 6;
        int[][] matriz = randomM.generarMatriz(filas, columnas); // Creamos matriz con números aleatorios llamando al método randomMatriz
        int pos = 0;
        int neg = 0;
        int zero = 0;

        System.out.println("\n ----- EJERCICIO 7 ----- \n");
        imprimirM.imprimirMatriz(matriz);

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
