package src.modelos;

public class Vehiculo {

    private String placa;
    private String marca;
    private String modelo;
    private String propietario;

    public Vehiculo(String placa, String marca, String modelo, String propietario) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.propietario = propietario;
    }

    public void mostrarInfo() {
        System.out.println("Vehículo: " + marca + " " + modelo);
        System.out.println("Placa: " + placa);
        System.out.println("Propietario: " + propietario);
    }
}
