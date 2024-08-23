public class Vehiculo {
    private String vehiculo, marca, color;
    private int modelo,  precio;

    public Vehiculo() {
        super();
    }

    public Vehiculo(String vehiculo, String marca, String color, int modelo, int precio){
        this.vehiculo = vehiculo;
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
