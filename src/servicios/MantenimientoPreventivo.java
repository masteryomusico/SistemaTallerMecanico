package src.servicios;

import src.interfaces.Diagnosticable;

public class MantenimientoPreventivo extends Servicio implements Diagnosticable {

    private String tipoRevision;

    public MantenimientoPreventivo(String descripcion, double costoBase, String tipoRevision) {
        super(descripcion, costoBase);
        this.tipoRevision = tipoRevision;
    }

    @Override
    public void diagnosticar() {
        System.out.println("Diagnóstico preventivo realizado. Tipo de revisión: " + tipoRevision);
    }

    @Override
    public double calcularCosto() {
        return costoBase + 50000;
    }
}