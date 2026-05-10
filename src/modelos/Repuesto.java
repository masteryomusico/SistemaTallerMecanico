package src.modelos;

public class Repuesto {

    private int idRepuesto;
    private String nombre;
    private int stock;
    private double precio;

    public Repuesto(int idRepuesto, String nombre, int stock, double precio) {
        this.idRepuesto = idRepuesto;
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdRepuesto() {
        return idRepuesto;
    }

    public int getStock() {
        return stock;
    }
}