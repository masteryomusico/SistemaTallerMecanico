package src.servicios;

import src.interfaces.Tarifa;

public class CalculadorCostos implements Tarifa {

    private Servicio servicio;

    public CalculadorCostos(Servicio servicio) {
        this.servicio = servicio;
    }

    @Override
    public double calcularTarifa() {
        return servicio.calcularCosto();
    }
}