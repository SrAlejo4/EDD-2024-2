import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ImportarListas {

    // Método para importar archivo de Estudiantes de INGENIERÍA ...
    public ArrayList<EstudianteIngenieria> importarEstudiantesIngenieria(ArrayList<EstudianteIngenieria> listaEstudiantesIngenieria){
        String rutaArchivo = "EstudiantesIngeniería.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String line;
            String serial = "";
            String cedula = "";
            String nombre = "";
            String apellido = "";
            String telefono = "";
            int semestreActual = 0;
            float promedioAcumulado = 0.0f;

            while ((line = br.readLine()) != null) {
                // Procesar cada campo
                if(line.startsWith("Serial: ")){
                    serial = line.substring(8).trim(); // Captura el Serial (EN CASO DE QUE TENGA EQUIPO PRESTADO)
                }else if (line.startsWith("Cedula: ")) {
                    cedula = line.substring(8).trim(); // Captura la cedula
                } else if (line.startsWith("Nombre: ")) {
                    nombre = line.substring(8).trim(); // Captura el Nombre
                } else if (line.startsWith("Apellido: ")) {
                    apellido = line.substring(10).trim(); // Captura el Apellido
                } else if (line.startsWith("Teléfono: ")){
                    telefono = line.substring(10).trim(); // Captura el Teléfono
                } else if(line.startsWith("Semestre actual: ")){
                    semestreActual = Integer.parseInt(line.substring(17).trim()); // Captura el Semestre actual
                }else if (line.startsWith("Promedio acumulado: ")) {
                    promedioAcumulado = Float.parseFloat(line.substring(20).trim()); // Captura el Promedio Acumulado
                }

                if(line.isEmpty() || line.startsWith("---------------------------------------")){
                    if(!serial.equals("")){
                        EstudianteIngenieria estIng = new EstudianteIngenieria(serial, cedula, nombre, apellido, telefono, semestreActual, promedioAcumulado);
                        listaEstudiantesIngenieria.add(estIng);
                    }else{
                        EstudianteIngenieria estIng = new EstudianteIngenieria(cedula, nombre, apellido, telefono, semestreActual, promedioAcumulado);
                        listaEstudiantesIngenieria.add(estIng);
                    }

                    // Reiniciar variables para el siguiente computador
                    serial = "";
                    cedula = "";
                    nombre = "";
                    apellido = "";
                    telefono = "";
                    semestreActual = 0;
                    promedioAcumulado = 0.0f;
                }
            }

        }catch (IOException e){
            e.printStackTrace();
        }
        catch (NumberFormatException e){
            System.out.println("Error de formato numérico: " + e.getMessage());
        }

        return listaEstudiantesIngenieria;
    }

    // Método para importar archivo Estudiantes de DISEÑO
    public ArrayList<EstudianteDiseno> importarEstudiantesDiseno(ArrayList<EstudianteDiseno> listaEstudiantesDiseno){
        String rutaArchivo = "EstudiantesDiseño.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String line;
            String serial = "";
            String cedula = "";
            String nombre = "";
            String apellido = "";
            String telefono = "";
            String modalidadEstudio = "";
            int cantidadAsignaturas = 0;

            while ((line = br.readLine()) != null) {
                // Procesar cada campo
                if(line.startsWith("Serial: ")){
                    serial = line.substring(8).trim(); // Captura el Serial (EN CASO DE QUE TENGA EQUIPO PRESTADO)
                }else if (line.startsWith("Cedula: ")) {
                    cedula = line.substring(8).trim(); // Captura la cedula
                } else if (line.startsWith("Nombre: ")) {
                    nombre = line.substring(8).trim(); // Captura el Nombre
                } else if (line.startsWith("Apellido: ")) {
                    apellido = line.substring(10).trim(); // Captura el Apellido
                } else if (line.startsWith("Teléfono: ")){
                    telefono = line.substring(10).trim(); // Captura el Teléfono
                } else if(line.startsWith("Modalidad de estudio: ")){
                    modalidadEstudio = line.substring(22).trim(); // Captura la Modalidad de Estudio
                }else if (line.startsWith("Cantidad de asignaturas: ")) {
                    cantidadAsignaturas = Integer.parseInt(line.substring(25).trim()); // Captura la Cantidad de Asignaturas
                }

                if(line.isEmpty() || line.startsWith("---------------------------------------")){
                    if(!serial.equals("")){
                        EstudianteDiseno estDis = new EstudianteDiseno(serial, cedula, nombre, apellido, telefono, modalidadEstudio, cantidadAsignaturas);
                        listaEstudiantesDiseno.add(estDis);
                    }else{
                        EstudianteDiseno estDis = new EstudianteDiseno(cedula, nombre, apellido, telefono, modalidadEstudio, cantidadAsignaturas);
                        listaEstudiantesDiseno.add(estDis);
                    }

                    // Reiniciar variables para el siguiente computador
                    serial = "";
                    cedula = "";
                    nombre = "";
                    apellido = "";
                    telefono = "";
                    modalidadEstudio = "";
                    cantidadAsignaturas = 0;
                }
            }

        }catch (IOException e){
            e.printStackTrace();
        }
        catch (NumberFormatException e){
            System.out.println("Error de formato numérico: " + e.getMessage());
        }

        return listaEstudiantesDiseno;
    }

    
    // Método para importar archivo de portátiles
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

        }catch (IOException e){
            e.printStackTrace();
        }
        catch (NumberFormatException e){
            System.out.println("Error de formato numérico: " + e.getMessage());
        }

        return listaPortatiles;
    }

    // Método para importar archivo de Tabletas
        public ArrayList<TabletaGrafica> importarTabletas(ArrayList<TabletaGrafica> listaTabletas){
        String rutaArchivo = "Tabletas.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String line;
            String serial = "";
            String marca = "";
            String almacenamiento = "";
            float tamaño = 0.0f;
            float peso = 0.0f;
            float precio = 0.0f;
            boolean prestado = false;


            while ((line = br.readLine()) != null) {
                // Procesar cada campo
                if (line.startsWith("Serial: ")) {
                    serial = line.substring(8).trim(); // Captura el Serial
                } else if (line.startsWith("Marca: ")) {
                    marca = line.substring(7).trim(); // Captura la Marca
                } else if (line.startsWith("Almacenamiento: ")) {
                    almacenamiento = line.substring(16).trim(); // Captura el Almacenamiento
                } else if (line.startsWith("Tamaño: ")){
                    tamaño = Float.parseFloat(line.substring(8).trim()); // Captura el Tamaño
                } else if(line.startsWith("Peso: ")){
                    peso = Float.parseFloat(line.substring(6).trim()); // Captura el Peso
                }else if (line.startsWith("Precio: ")) {
                    precio = Float.parseFloat(line.substring(8).trim()); // Captura el Precio
                } else if (line.startsWith("Prestado: ")) {
                    prestado = Boolean.parseBoolean(line.substring(10).trim()); // Captura el valor (TRUE/FALSE) de la variable prestado ...
                }

                if(line.isEmpty() || line.startsWith("---------------------------------------")){
                    TabletaGrafica tableta = new TabletaGrafica(serial, marca, almacenamiento, tamaño, peso, precio, prestado);
                    listaTabletas.add(tableta);

                    // Reiniciar variables para el siguiente computador
                    serial = "";
                    marca = "";
                    almacenamiento = "";
                    tamaño = 0.0f;
                    peso = 0.0f;
                    precio = 0.0f;
                    prestado = false;
                }
            }

        }catch (IOException e){
            e.printStackTrace();
        }
        catch (NumberFormatException e){
            System.out.println("Error de formato numérico: " + e.getMessage());
        }

        return listaTabletas;
    }

    // Métodos para importar contadores de seriales
    public int importarSerialIngenieria(){
        String rutaArchivo = "Seriales.txt";
        int contadorIngenieria = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String line;

            while ((line = br.readLine()) != null) {
                // Procesar cada campo
                if (line.startsWith("Contador Ingenieria: ")) {
                    contadorIngenieria = Integer.parseInt(line.substring(21).trim());
                }
            }

        }catch (IOException e){
            e.printStackTrace();
        }
        catch (NumberFormatException e){
            System.out.println("Error de formato numérico: " + e.getMessage());
        }
        return contadorIngenieria;
    }

    public int importarSerialDiseno(){
        String rutaArchivo = "Seriales.txt";
        int contadorDiseno = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String line;

            while ((line = br.readLine()) != null) {
                // Procesar cada campo
                if (line.startsWith("Contador Diseño: ")) {
                    contadorDiseno = Integer.parseInt(line.substring(17).trim());
                }
            }

        }catch (IOException e){
            e.printStackTrace();
        }
        catch (NumberFormatException e){
            System.out.println("Error de formato numérico: " + e.getMessage());
        }
        return contadorDiseno;
    }
}
            
        


