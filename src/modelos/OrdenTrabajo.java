package src.modelos;

import java.util.ArrayList;
import java.util.List;

import src.interfaces.Facturable;
import src.servicios.CalculadorCostos;
import src.servicios.Servicio;

public class OrdenTrabajo implements Facturable {

    private int idOrden;
    private String fecha;

    private Vehiculo vehiculo;
    private Servicio servicio;
    private Mecanico mecanico;

    private List<Repuesto> repuestos;

    public OrdenTrabajo(int idOrden, String fecha,
                        Vehiculo vehiculo,
                        Servicio servicio,
                        Mecanico mecanico) {

        this.idOrden = idOrden;
        this.fecha = fecha;
        this.vehiculo = vehiculo;
        this.servicio = servicio;
        this.mecanico = mecanico;

        repuestos = new ArrayList<>();
    }

    public void agregarRepuesto(Repuesto repuesto) {
        repuestos.add(repuesto);
    }

    public double calcularTotalRepuestos() {

        double total = 0;

        for (Repuesto r : repuestos) {
            total += r.getPrecio();
        }

        return total;
    }

    public void mostrarOrden() {

        System.out.println("\n===== ORDEN DE TRABAJO =====");
        System.out.println("Orden #: " + idOrden);
        System.out.println("Fecha: " + fecha);

        vehiculo.mostrarInfo();

        System.out.println("\nServicio: " + servicio.getDescripcion());

        mecanico.mostrarMecanico();

        System.out.println("\nRepuestos:");

        for (Repuesto r : repuestos) {
            System.out.println("- " + r.getNombre() + " (ID: " + r.getIdRepuesto() + ", stock: " + r.getStock() + ")");
        }
    }

    @Override
    public void generarFactura() {

        CalculadorCostos calculador = new CalculadorCostos(servicio);

        double costoServicio = calculador.calcularTarifa();
        double costoRepuestos = calcularTotalRepuestos();

        Factura factura = new Factura(1001);

        factura.calcularTotal(costoServicio, costoRepuestos);

        factura.mostrarFactura();
    }
}