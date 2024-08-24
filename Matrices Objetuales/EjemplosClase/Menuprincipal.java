import java.text.DecimalFormat;
import java.util.Scanner;

public class Menuprincipal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0, opt = 0, continuar = 0;
        System.out.println("Ingrese la cantidad de registros");
        n = sc.nextInt();
        double[] array = new double[n];
        double[][] matriz = new double[n][n];
        Utilidades[][] Mo = new Utilidades[n][n];
        Utilidades u = new Utilidades();
        boolean bandera = true;

        while (bandera) {
            System.out
                    .println("ingrese la opcion que desee 1: llenarArray ,2:Llenar matriz , 3:LLenar matriz Objetual");
            opt = sc.nextInt();
            switch (opt) {
                case 1:
                    array = u.llenarArray(n);
                    u.mostrarArray(array);
                    break;
                case 2:
                    matriz = u.llenarMatriz(n);
                    u.mostrarMatriz(matriz);
                    break;
                case 3:
                    Mo = u.LlenarMatrizObjetual(n);
                    u.MotrarMatrizObjetual(Mo);
                    break;

                default:
                    break;
            }
            System.out.println("desea continuar 1: si , 2: no");
            continuar = sc.nextInt();
            if (continuar > 1) {
                bandera = false;
            }
        }

    }
}