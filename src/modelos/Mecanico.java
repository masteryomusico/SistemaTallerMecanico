package src.modelos;

public class Mecanico {

    private int idMecanico;
    private String nombre;
    private String especialidad;

    public Mecanico(int idMecanico, String nombre, String especialidad) {
        this.idMecanico = idMecanico;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public void mostrarMecanico() {
        System.out.println("Mecánico: " + nombre + " (ID: " + idMecanico + ")");
        System.out.println("Especialidad: " + especialidad);
    }
}