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
                    if(!estIng.getSerial().equals("")){
                        escriba.write("Serial: " + estIng.getSerial() + "\n");
                    }
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

    public void exportarEstudiantesDiseno(ArrayList<EstudianteDiseno> listaEstudiantesDiseno){
        if (listaEstudiantesDiseno.isEmpty()) {
            System.out.println("No se puede exportar. Lista de Estudiantes Diseño vacía.");
        } else {
            try (FileWriter escriba = new FileWriter("EstudiantesDiseño.txt")) {
                for (EstudianteDiseno estDis : listaEstudiantesDiseno) {
                    if(!estDis.getSerial().equals("")){
                        escriba.write("Serial: " + estDis.getSerial() + "\n");
                    }
                    escriba.write("Cedula: " + estDis.getCedula() + "\n");
                    escriba.write("Nombre: " + estDis.getNombre() + "\n");
                    escriba.write("Apellido: " + estDis.getApellido() + "\n");
                    escriba.write("Teléfono: " + estDis.getTelefono() + "\n");
                    escriba.write("Modalidad de estudio: " + estDis.getModalidadEstudio() + "\n");
                    escriba.write("Cantidad de asignaturas: " + estDis.getCantidadAsignaturas() + "\n");
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

    public void exportarTabletas(ArrayList<TabletaGrafica> listaTabletas) {
        if (listaTabletas.isEmpty()) {
            System.out.println("No se puede exportar. Lista de Tabletas Gráficas vacía.");
        } else {
            try (FileWriter escriba = new FileWriter("Tabletas.txt")) {
                for (TabletaGrafica tab : listaTabletas) {
                    escriba.write("Serial: " + tab.getSerial() + "\n");
                    escriba.write("Marca: " + tab.getMarca() + "\n");
                    escriba.write("Almacenamiento: " + tab.getAlmacenamiento() + "\n");
                    escriba.write("Tamaño: " + tab.getTamano() + "\n");
                    escriba.write("Peso: " + tab.getPeso() + "\n");
                    escriba.write("Precio: " + tab.getPrecio() + "\n");
                    escriba.write("Prestado: " + tab.isPrestado() + "\n");
                    escriba.write("---------------------------------------\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void exportarSeriales(ComputadorPortatil com, TabletaGrafica tab){
        try (FileWriter escriba = new FileWriter("Seriales.txt")) {
            escriba.write("Contador Ingenieria: " + com.getContadorIngenieria() + "\n");
            escriba.write("Contador Diseño: " + tab.contadorDiseno() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
