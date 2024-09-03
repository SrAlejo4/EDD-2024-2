package Ejercicio_10;

public class Oferta {
    public String contarProdOfer(Productos[][]matriz){
        int contador=0;
        double precioT=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j].isEnOferta()){
                    contador++;
                    precioT+=matriz[i][j].getPrecio();
                }
            }
        }
        return contador+" y el precio total : "+precioT;
    }
}
