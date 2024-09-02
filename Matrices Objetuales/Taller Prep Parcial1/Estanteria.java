import java.util.Scanner;

public class Estanteria {
    private String nombre;
    private double precio;
    private boolean disponibilidad;
    Scanner entrada = new Scanner(System.in);

    public Estanteria() {
        super();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    // Método que llena una matriz de tipo Estenteria ...
    public Estanteria[][] llenarEstanteria(int dim){
        int available = 0;
        Estanteria[][] estanteria = new Estanteria[dim][dim];
        System.out.println("\n ----- INGRESE LOS PRODUCTOS DE LA ESTANTERIA ----- ");
        for (int i = 0; i < estanteria.length; i++) {
            for (int j = 0; j < estanteria.length; j++) {
                Estanteria producto = new Estanteria();
                System.out.print("\nNombre del producto: ");
                producto.setNombre(entrada.next());
                System.out.print("Precio: ");
                producto.setPrecio(entrada.nextDouble());
                System.out.print("Disponibilidad: Ingrese (1 - SI , 2 - NO): ");
                available = entrada.nextInt();

                if(available != 1 || available != 2){
                    while(available != 1 && available != 2){
                        System.out.print("Valor no válido, por favor ingrese (1 - SI, 2 -NO): ");
                        available = entrada.nextInt();
                    }
                }

                if(available == 1){
                    producto.setDisponibilidad(true);       
                }
                else{
                    producto.setDisponibilidad(false);
                }
                estanteria[i][j] = producto;
            }
        }
        return estanteria;
    }

    // Método para filtrar la matriz estanteria por disponibilidad ...
    public Estanteria[][] filtrarDisponibles(Estanteria[][] matrizF){
        Estanteria[][] matrizDisponibles = new Estanteria[matrizF.length][matrizF.length];
        for (int i = 0; i < matrizF.length; i++) {
            for (int j = 0; j < matrizF.length; j++) {
                if(matrizF[i][j].isDisponibilidad() == true){
                    matrizDisponibles[i][j] = matrizF[i][j];
                }
            }
        }
        return matrizDisponibles;
    }

    // Método para imrprimir matrices ...
    public void mostrarMatrizEstanteria(Estanteria[][] matrizE) {
        for (int i = 0; i < matrizE.length; i++) {
            for (int j = 0; j < matrizE.length; j++) {
                if (matrizE[i][j] != null) {
                    System.out.println("\nProducto: " + matrizE[i][j].getNombre());
                    System.out.println("Precio: " + matrizE[i][j].getPrecio());
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Estanteria ejecutor = new Estanteria();

        System.out.print("\nIngrese la dimensión de la matriz ESTANTERIA: ");
        int dim = entrada.nextInt();

        Estanteria[][] Me = new Estanteria[dim][dim];
        Estanteria[][] Mdispo = new Estanteria[dim][dim];

        Me = ejecutor.llenarEstanteria(dim);
        Mdispo = ejecutor.filtrarDisponibles(Me);
        ejecutor.mostrarMatrizEstanteria(Mdispo);
    }


}
