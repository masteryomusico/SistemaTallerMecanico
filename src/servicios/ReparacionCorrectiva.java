package src.servicios;

import src.interfaces.Reparable;

public class ReparacionCorrectiva extends Servicio implements Reparable {

    private String tipoDanio;

    public ReparacionCorrectiva(String descripcion, double costoBase, String tipoDanio) {
        super(descripcion, costoBase);
        this.tipoDanio = tipoDanio;
    }

    @Override
    public void reparar() {
        System.out.println("Reparación completada del daño: " + tipoDanio);
    }

    @Override
    public double calcularCosto() {
        return costoBase + 120000;
    }
}