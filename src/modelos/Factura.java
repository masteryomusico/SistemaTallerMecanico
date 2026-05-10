package src.modelos;

public class Factura {

    private int numeroFactura;
    private double total;

    public Factura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public void calcularTotal(double servicios, double repuestos) {
        total = servicios + repuestos;
    }

    public void mostrarFactura() {
        System.out.println("\n===== FACTURA =====");
        System.out.println("Factura N°: " + numeroFactura);
        System.out.println("Total a pagar: $" + total);
    }
}
