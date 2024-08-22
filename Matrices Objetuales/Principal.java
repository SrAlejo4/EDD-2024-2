import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String marca = "", modelo = "";
        int precio = 0;
        Mesa m = new Mesa();
        System.out.println("Ingrese la dimencion de matriz");
        int dim = sc.nextInt();
        Mesa[][] MprimeraForma = new Mesa[dim][dim];
        Mesa[][] MSegundaForma = new Mesa[dim][dim];
        // de manera individual
        // System.out.println("ingrese la marca");
        // m.setMarca(sc.next());
        // System.out.println("ingrese modelo");
        // m.setModelo(sc.next());
        // System.out.println("Ingrese precio");
        // m.setPrecio(sc.nextInt());

        // System.out.println("la marca es " + m.getMarca()
        //         + "\n el modelo es:" + m.getModelo() + 
        //         "\n el precio es " + m.getPrecio());
        // primera forma
        for (int i = 0; i < MprimeraForma.length; i++) {
            for (int j = 0; j < MprimeraForma.length; j++) {                
                Mesa datosSegundaforma = new Mesa();
                System.out.println("ingrese la marca");
                marca = sc.next();
                datosSegundaforma.setMarca(marca);
                System.out.println("ingrese modelo");
                modelo = sc.next();
                datosSegundaforma.setModelo(modelo);
                System.out.println("Ingrese precio");
                precio = sc.nextInt();
                datosSegundaforma.setPrecio(precio);
                // Mesa datosPrimeraforma = new Mesa(marca, modelo, precio);
                // MprimeraForma[i][j] = datosPrimeraforma;
                MSegundaForma[i][j] = datosSegundaforma;
            }

        }
        
        // System.out.println("primera forma de la matriz ");
        // for (int i = 0; i < MprimeraForma.length; i++) {
        //     for (int j = 0; j < MprimeraForma.length; j++) {
        //         System.out.print("==" + MprimeraForma[i][j].getMarca());
        //         System.out.print("==" + MprimeraForma[i][j].getModelo());
        //         System.out.print("==" + MprimeraForma[i][j].getPrecio());
        //     }
        //     System.out.println("");

        // }

        System.out.println("Segunda forma de la matriz ");
        for (int i = 0; i < MSegundaForma.length; i++) {
            for (int j = 0; j < MSegundaForma.length; j++) {
                System.out.print("==" + MSegundaForma[i][j].getMarca());
                System.out.print("==" + MSegundaForma[i][j].getModelo());
                System.out.print("==" + MSegundaForma[i][j].getPrecio());
            }
            System.out.println("");

        }

    }
}