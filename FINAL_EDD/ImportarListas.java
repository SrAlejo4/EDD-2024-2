import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ImportarListas {
    // Método para importar archivo de portátiles
    Inventario inventario = new Inventario(); // Instancio objeto de clase Inventario para acceder a las listas ...
    
    public ArrayList<ComputadorPortatil> importarPortatiles(ArrayList<ComputadorPortatil> listaPortatiles){
        String rutaArchivo = "Portátiles.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String line;
            String serial = "";
            String marca = "";
            float tamano = 0.0f;
            String so = "";
            String procesador = "";
            float precio = 0.0f;
            boolean prestado = false;


            while ((line = br.readLine()) != null) {
                // Procesar cada campo
                if (line.startsWith("Serial: ")) {
                    serial = line.substring(8).trim(); // Captura el Serial
                } else if (line.startsWith("Marca: ")) {
                    marca = line.substring(7).trim(); // Captura la Marca
                } else if (line.startsWith("Tamaño: ")) {
                    tamano = Float.parseFloat(line.substring(8).trim()); // Captura el Tamaño
                } else if (line.startsWith("Sistema operativo: ")){
                    so = line.substring(19).trim(); // Captura el Sistema Operativo
                } else if(line.startsWith("Procesador: ")){
                    procesador = line.substring(12).trim(); // Captura el Procesador
                }else if (line.startsWith("Precio: ")) {
                    precio = Float.parseFloat(line.substring(8).trim()); // Captura el Precio
                } else if (line.startsWith("Prestado: ")) {
                    prestado = Boolean.parseBoolean(line.substring(10).trim()); // Captura el valor (TRUE/FALSE) de la variable prestado ...
                }

                if(line.isEmpty() || line.startsWith("---------------------------------------")){
                    ComputadorPortatil portatil = new ComputadorPortatil(serial, marca, tamano, so, procesador, precio, prestado);
                    listaPortatiles.add(portatil);

                    // Reiniciar variables para el siguiente computador
                    serial = "";
                    marca = "";
                    tamano = 0.0f;
                    so = "";
                    procesador = "";
                    precio = 0.0f;
                    prestado = false;
                }
            }

            if (!serial.isEmpty()) {
                ComputadorPortatil portatil = new ComputadorPortatil(serial, marca, tamano, so, procesador, precio, prestado);
                listaPortatiles.add(portatil);    
            }

        }catch (IOException e){
            e.printStackTrace();
        }
        catch (NumberFormatException e){
            System.out.println("Error de formato numérico: " + e.getMessage());
        }

        return listaPortatiles;
    }    

}
            
        


