import java.util.Random;
import java.util.Scanner;

public class Matrices {

    // Método para generar matrices de números aleaotorios ...
    public static int[][] crearMatrices(int tam){
        int[][] matriz = new int[tam][tam];
        Random randomNum = new Random();
        
        for(int i = 0; i < tam; i++){
            for(int j = 0; j < tam; j++){
                matriz[i][j] = randomNum.nextInt(50);
            }
        }
        
        return matriz; // Retorno la matriz generada con números aleaotorios ... 
    }

    // Método para imprimir matrices que se generen por cada ejercicio ...
    public void imprimirMatrices(int[][] matrizX){

        for(int i = 0; i < matrizX.length; i++){
            for(int j = 0; j < matrizX.length; j++){
                System.out.print(" " + matrizX[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public int ejercicio1(){
        int tam = 6;
        int sumaElementos = 0;
        int [][] matriz1 = crearMatrices(tam);

        System.out.println("\n ----- EJERCICIO 1 ----- \n");
        imprimirMatrices(matriz1); // Llamo método para imprimir la matriz ...

        for(int i = 0; i < tam; i++){
            for(int j = 0; j < tam; j++){
                sumaElementos += matriz1[i][j];
            }
        }

        return sumaElementos;
    }

    public void ejercicio2(){
        int tam = 5;
        int [][] matriz2 = crearMatrices(tam);
        int numMayor = matriz2[0][0];
        int posX = 0;
        int posY = 0;

        System.out.println("\n ----- EJERCICIO 2 ----- \n");
        imprimirMatrices(matriz2); // Llamo método para imprimir la matriz ...

        for(int i = 0; i < tam; i++){
            for(int j = 0; j < tam; j++){
                if(numMayor < matriz2[i][j]){
                    numMayor = matriz2[i][j];
                    posX = i + 1;
                    posY = j + 1;
                }
            }
        }

        System.out.println("\nEl número mayor de la matriz es " + numMayor + " y su posición es " + "[" + posX + "," + posY + "] ");

    }

    public void ejercicio3(){
        int tam = 5;
        int [][] matriz3 = crearMatrices(tam);
        int [] sumFilas = new int[tam];
        int [] sumColumnas = new int [tam];
        int sumaF, sumaC;

        System.out.println("\n ----- EJERCICIO 3 ----- \n");
        imprimirMatrices(matriz3); // Llamo método para imprimir la matriz ...

        // Suma de filas y agregación a arreglo ...
        for(int i = 0; i < tam; i++){
            sumaF = 0;
            for(int j = 0; j < tam; j++){
                sumaF += matriz3[i][j];
            }
            sumFilas[i] = sumaF;
        }

        // Suma de columnas y agregación a arreglo ... 
        for(int i = 0; i < tam; i++){
            sumaC = 0;
            for(int j = 0; j < tam; j++){
                sumaC += matriz3[j][i];
            }
            sumColumnas[i] = sumaC;
        }

        // Se recorre arreglo de suma de filas y se imprime ...
        System.out.println("\nLa suma de las filas es : ");
        for(int i = 0; i < sumFilas.length; i++){
            System.out.print(sumFilas[i] + " ");
        }

        // Se recorre arreglo de suma de columnas y se imprime ...
        System.out.println("\nLa suma de las columnas es : ");
        for(int i = 0; i < sumColumnas.length; i++){
            System.out.print(sumColumnas[i] + " ");
        }
    }

    public void ejercicio4(){
        int tam = 10;
        int [][] matriz4 = crearMatrices(tam);
        int [] sumColumnas = new int[tam];
        int sumaC;
        int mayorElem = 0;
        int pos = 0;

        System.out.println("\n ----- EJERCICIO 4 ----- \n");
        imprimirMatrices(matriz4); // Llamo método para imprimir la matriz ...

        // Suma de columnas y agregación a arreglo ...
        for(int i = 0; i < tam; i++){
            sumaC = 0;
            for(int j = 0; j < tam; j++){
                sumaC += matriz4[j][i];
            }
            sumColumnas[i] = sumaC;
        }

        // Se recorre arreglo de suma de columnas y se determina el elemento de mayor valor y su posición ...
        // Este sera la columna con la suma de sus elementos mayor ... 
        // Imprimimos el arreglo ...
        System.out.println("\n El arreglo con la suma de columnas es: ");
        for(int i = 0; i < sumColumnas.length; i++){
            System.out.print(sumColumnas[i] + " ");
        }

        // Definimos el elemento mayor junto a su pocición
        for(int i = 0; i < sumColumnas.length; i++){
            if(mayorElem < sumColumnas[i]){
                mayorElem = sumColumnas[i];
                pos = i + 1;
            }
        }

    System.out.println("\n\nLa columna con mayor valor en su suma fue la " + pos + " y su suma de " + mayorElem + "\n");
    }

    public void ejercicio5(){
        int tam = 5;
        int [][] matriz5 = crearMatrices(tam);
        int [] arreglo = new int[tam*tam];
        int cont = 0;

        System.out.println("\n ----- EJERCICIO 5 ----- \n");
        imprimirMatrices(matriz5);

        for(int i = 0; i < tam; i++){
            for(int j = 0; j < tam; j++){
                arreglo[cont] = matriz5[i][j];
                cont += 1;
            }
        }

        // Recorro e imprimo el arreglo con todos los elementos de la matriz ...
        System.out.println("\nEl arreglo de los elementos de la matriz es: ");
        for(int i = 0; i < arreglo.length; i++){
            System.out.print(arreglo[i] + " ");
        }
    }

    public void ejercicio6(){
        int tam = 8;
        int [][] matriz6 = crearMatrices(tam);
        int sumaF, sumaC;
        int [] arreglo = new int[tam*2];
        int cont = 0;

        System.out.println("\n ----- EJERCICIO 6 ----- \n");
        imprimirMatrices(matriz6);

        // Se recorre la matriz por filas, se suman y se agregan al arreglo ...
        for(int i = 0; i < tam; i++){
            sumaF = 0;
            for(int j = 0; j < tam; j++){
                sumaF += matriz6[i][j];
            }
            arreglo[cont] = sumaF;
            cont += 1;
        }

        // Se recorre la matriz por columnas, se suman y se agregan al arreglo ... 
        for(int i = 0; i < tam; i++){
            sumaC = 0;
            for(int j = 0; j < tam; j++){
                sumaC += matriz6[j][i];
            }
            arreglo[cont] = sumaC;
            cont += 1;
        }

        // Se imprime el arreglo que contiene la suma de filas y la suma de columnas ...
        System.out.println("\n La suma de las filas y columnas son: \n");
        for(int i = 0; i < arreglo.length; i++){
            System.out.print(arreglo[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Matrices prueba = new Matrices(); // Creo una instancia de la clase para usar los métodos ...

        System.out.println("\n ----- MENÚ EJERCICIOS MATRICES ----- \n" +
                            "1. Ejercicio 1 \n" +
                            "2. Ejercicio 2 \n"  +
                            "3. Ejercicio 3 \n" +
                            "4. Ejercicio 4 \n" +
                            "5. Ejercicio 5 \n" +
                            "6. Ejercicio 6 \n");
        
        System.out.print("\n Ingrese el ejercicio que desea visualizar: ");
        int opcion = entrada.nextInt();
        
        switch(opcion){
            case 1: 
                System.out.println(prueba.ejercicio1());
                break;  
            case 2:
                prueba.ejercicio2();
                break;
            case 3:
                prueba.ejercicio3();
                break;   
            case 4:
                prueba.ejercicio4();
                break;
            case 5:
                prueba.ejercicio5();
                break;
            case 6:
                prueba.ejercicio6();
                break;
        }
    }
}
