import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ExportarListas {

    public void exportarEstudiantesIngenieria(ArrayList<EstudianteIngenieria> listaEstudiantesIngenieria){
        if (listaEstudiantesIngenieria.isEmpty()) {
            System.out.println("No se puede exportar. Lista de Estudiantes Ingeniería vacía.");
        } else {
            try (FileWriter escriba = new FileWriter("EstudiantesIngeniería.txt")) {
                for (EstudianteIngenieria estIng : listaEstudiantesIngenieria) {
                    escriba.write("Cedula: " + estIng.getCedula() + "\n");
                    escriba.write("Nombre: " + estIng.getNombre() + "\n");
                    escriba.write("Apellido: " + estIng.getApellido() + "\n");
                    escriba.write("Teléfono: " + estIng.getTelefono() + "\n");
                    escriba.write("Semestre actual: " + estIng.getSemestreActual() + "\n");
                    escriba.write("Promedio acumulado: " + estIng.getPromedioAcumulado() + "\n");
                    escriba.write("---------------------------------------\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

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
