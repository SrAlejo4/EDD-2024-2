import java.util.Scanner;

public class Almacenamiento {
    private String nombre;
    private double peso;
    private char categoria;
    Scanner entrada = new Scanner(System.in);

    public Almacenamiento() {
        super();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    // Método para llenar matriz Almacenamiento ...
    public Almacenamiento[][] llenarMatrizAlmacenamiento(int dim){
        Almacenamiento[][] almacen1 = new Almacenamiento[dim][dim];
        System.out.println("\n ----------- INGRESE LOS PRODUCTOS DE LA ESTANTERIA ----------- ");
        for (int i = 0; i < almacen1.length; i++) {
            for (int j = 0; j < almacen1.length; j++) {
                Almacenamiento producto = new Almacenamiento();
                System.out.print("\nNombre del producto: ");
                producto.setNombre(entrada.next());
                System.out.print("Peso: ");
                producto.setPeso(entrada.nextDouble());
                System.out.print("Categoria: ");
                producto.setCategoria(Character.toUpperCase(entrada.next().charAt(0))); // Character.toUpperCase() Permite volver mayúscula a la entrada
                almacen1[i][j] = producto;
            }
        }
        return almacen1;
    }

    // Método para filtrar por categoria y asignar en vectores ...
    public void filtrarEstanterias(Almacenamiento[][] matrizAlm){
        // Creamos variables para almacenar la cantidad de elementos en las categorías ...
        int cantA = 0, cantB = 0, cantC = 0;

        // For para determinar el tamaño de los vectores (Se determinará a partir de la cantidad de elementos por categoría ...)
        for (int i = 0; i < matrizAlm.length; i++) {
            for (int j = 0; j < matrizAlm.length; j++) {
                if(matrizAlm[i][j].getCategoria() == 'A'){
                    cantA++;
                }
                else if(matrizAlm[i][j].getCategoria() == 'B'){
                    cantB++;
                }
                else if(matrizAlm[i][j].getCategoria() == 'C'){
                    cantC++;
                }     
            }
        }
        
        // Creamos los vectores con sus respectivos tamaños ...
        Almacenamiento[] vectorA = new Almacenamiento[cantA];
        Almacenamiento[] vectorB = new Almacenamiento[cantB];
        Almacenamiento[] vectorC = new Almacenamiento[cantC];

        // For que recorre la matriz para llenar los vectores ...

        Almacenamiento [][] matrizFiltrada = {
            vectorA, vectorB, vectorC
        };

        System.out.println("\n ---------- MATRIZ FILTRADA ---------- ");
        mostrarEstanteria(matrizFiltrada);
    }

    // Método para imprimir la matriz organizada por sus categorias ...
    public void mostrarEstanteria(Almacenamiento[][] matrizAlm) {
        for (int i = 0; i < matrizAlm.length; i++) {
            for (int j = 0; j < matrizAlm.length; j++) {
                if (matrizAlm[i][j] != null) {
                    System.out.println("Nombre producto: " + matrizAlm[i][j].getNombre());
                    System.out.println("Peso: " + matrizAlm[i][j].getPeso() + " kg");
                    System.out.println("Categoria: " + matrizAlm[i][j].getCategoria());
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("\nIngrese la dimensión de la matriz ALMACEN : ");
        int dim = entrada.nextInt();
        Almacenamiento bodega = new Almacenamiento();

        Almacenamiento[][] matrizAlmacen = new Almacenamiento[dim][dim];
        
        matrizAlmacen = bodega.llenarMatrizAlmacenamiento(dim);
        bodega.filtrarEstanterias(matrizAlmacen, dim);
    }
}
