package src.servicios;

public abstract class Servicio {

    protected String descripcion;
    protected double costoBase;

    public Servicio(String descripcion, double costoBase) {
        this.descripcion = descripcion;
        this.costoBase = costoBase;
    }

    public abstract double calcularCosto();

    public String getDescripcion() {
        return descripcion;
    }
}