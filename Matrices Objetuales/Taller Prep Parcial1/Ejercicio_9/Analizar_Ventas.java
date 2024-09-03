package Ejercicio_9;

public class Analizar_Ventas {
    public Ventas EvendeMaxV(Ventas[] vendedor){
        Ventas mejorVendedor= vendedor[0];
        int maxVenta= vendedor[0].sumarVent();
        for (int i = 0; i < vendedor.length; i++) {
            int ventasTotales=vendedor[i].sumarVent();
            if (ventasTotales>maxVenta){
                maxVenta=ventasTotales;
                mejorVendedor=vendedor[i];

            }

        }

      return mejorVendedor;
    }
}
