import java.util.Scanner;

public class MainVehiculo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Variable de entrada de datos ...
        String tipoV = "", marca = "", color = "";
        int modelo = 0;
        double precio = 0, precioD = 0;

        System.out.print("\nIngrese el tamaño de la matriz: ");
        int tam = entrada.nextInt();
        Vehiculo[][] matrizVehiculos = new Vehiculo[tam][tam];

        // For para llenar la matriz de los vehículos ...
        for(int i = 0; i < tam; i++){
            for(int j = 0; j < tam; j++){
                Vehiculo datos = new Vehiculo();
                System.out.print("\nIngrese el tipo de vehiculo: ");
                tipoV = entrada.next();
                datos.setVehiculo(tipoV);

                System.out.print("Ingrese la marca del vehiculo: ");
                marca = entrada.next();
                datos.setMarca(marca);

                System.out.print("Ingrese el color del vehículo: ");
                color = entrada.next();
                datos.setColor(color);

                System.out.print("Ingrese el modelo del vehículo: ");
                modelo = entrada.nextInt();
                datos.setModelo(modelo);

                System.out.print("Ingrese el precio del vehiculo: ");
                precio = entrada.nextDouble();
                datos.setPrecio(precio);

                matrizVehiculos[i][j] = datos;
            }
        }

        // For para imprimir la matriz ingresada...
        System.out.println("\n ------ MATRIZ INGRESADA ------ \n");
        for(int i = 0; i < tam; i++){
            for(int j = 0; j < tam; j++){
                System.out.print(" " + matrizVehiculos[i][j].getVehiculo());
                System.out.print(" " + matrizVehiculos[i][j].getMarca());
                System.out.print(" " + matrizVehiculos[i][j].getColor());
                System.out.print(" " + matrizVehiculos[i][j].getModelo());
                System.out.print(" " + matrizVehiculos[i][j].getPrecio() + "   ");
            }
            System.out.println("\n");
        }

        // For para determinar los porcentajes de aumento o descuento ...
        for(int i = 0; i < tam; i++){
            for(int j = 0; j < tam; j++){
                if(matrizVehiculos[i][j].getModelo() >= 2000 && matrizVehiculos[i][j].getModelo() <= 2015){
                    precioD = matrizVehiculos[i][j].getPrecio();
                    precioD *= 0.85;
                    matrizVehiculos[i][j].setPrecio(precioD);
                }
                else if(matrizVehiculos[i][j].getModelo() > 2015){
                    precioD = matrizVehiculos[i][j].getPrecio();
                    precioD *= 1.15;
                    matrizVehiculos[i][j].setPrecio(precioD);
                }
            }
        }

        // For para imprimir la matriz ACTUALIZADA...
        System.out.println("\n ------ MATRIZ CON DESCUENTOS O AUMENTOS ------ \n");
        for(int i = 0; i < tam; i++){
            for(int j = 0; j < tam; j++){
                System.out.print(" " + matrizVehiculos[i][j].getVehiculo());
                System.out.print(" " + matrizVehiculos[i][j].getMarca());
                System.out.print(" " + matrizVehiculos[i][j].getColor());
                System.out.print(" " + matrizVehiculos[i][j].getModelo());
                System.out.print(" " + matrizVehiculos[i][j].getPrecio() + "   ");
            }
            System.out.println("\n");
        }
    }
}
