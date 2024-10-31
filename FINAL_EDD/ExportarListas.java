import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ExportarListas {
    ComputadorPortatil metodosPortatil = new ComputadorPortatil();

    public void exportarComputadores(ArrayList<ComputadorPortatil> listaComputadores) {
        if (listaComputadores.isEmpty()) {
            System.out.println("No se puede exportar. Lista de Computadores Portátiles vacía.");
        } else {
            try (FileWriter escriba = new FileWriter("Portátiles.txt")) {
                for (ComputadorPortatil com : listaComputadores) {
                    escriba.write("Serial: " + com.getSerial() + "\n");
                    escriba.write("Marca: " + com.getMarca() + "\n");
                    escriba.write("Tamaño: " + com.getTamano() + "\n");
                    escriba.write("Sistema operativo: " + com.getSO() + "\n");
                    escriba.write("Procesador: " + com.getProcesador() + "\n");
                    escriba.write("Precio: " + com.getPrecio() + "\n");
                    escriba.write("Prestado: " + com.isPrestado() + "\n");
                    escriba.write("---------------------------------------\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
