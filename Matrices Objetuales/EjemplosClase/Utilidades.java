import java.text.DecimalFormat;
import java.util.Scanner;

public class Utilidades {
    String TipoVehiculo;
    Double Precio;
    int Cantidad;
    Scanner sc = new Scanner(System.in);

    public Utilidades() {
        TipoVehiculo = "";
        Precio = 0.0;
        Cantidad = 0;
    }

    public String getTipoVehiculo() {
        return TipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        TipoVehiculo = tipoVehiculo;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double precio) {
        Precio = precio;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public double[] llenarArray(int n) {
        double[] array = new double[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (double) (Math.random() * 500 + 1);
        }
        return array;
    }

    public void mostrarArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " - ");
        }
    }

    public double[][] llenarMatriz(int n) {
        double[][] matriz = new double[n][n];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (double) (Math.random() * 500 + 1);
            }

        }
        return matriz;
    }

    public void mostrarMatriz(double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " - ");
            }
            System.out.println();

        }
    }

    public Utilidades[][] LlenarMatrizObjetual(int n) {
        Utilidades[][] mo = new Utilidades[n][n];
        for (int i = 0; i < mo.length; i++) {
            for (int j = 0; j < mo.length; j++) {
                Utilidades u = new Utilidades();
                System.out.println("ingrese el tipo de vehiculo");
                u.setTipoVehiculo(sc.next());
                System.out.println("Ingrese el precio del vehiculo");
                u.setPrecio(sc.nextDouble());
                System.out.println("ingres la cantidad en stock");
                u.setCantidad(sc.nextInt());
                mo[i][j] = u;
            }
        }
        return mo;
    }

    public void MotrarMatrizObjetual(Utilidades[][] Mo) {

        for (int i = 0; i < Mo.length; i++) {
            for (int j = 0; j < Mo.length; j++) {
                System.out.println("el tipo de vehiculo es: " + Mo[i][j].getTipoVehiculo());
                System.out.println("el precio del vehiculo es: " + Mo[i][j].getPrecio());
                System.out.println("la cantidad en stok es : " + Mo[i][j].getCantidad());
            }
            System.out.println("\n");
        }
    }
}
