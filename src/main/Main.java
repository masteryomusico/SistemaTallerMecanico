package src.main;

import src.modelos.*;
import src.servicios.*;

public class Main {

    public static void main(String[] args) {

        Vehiculo vehiculo1 = new Vehiculo(
                "ABC123",
                "Toyota",
                "Corolla",
                "Carlos Pérez"
        );

        Mecanico mecanico1 = new Mecanico(
                1,
                "Juan Martínez",
                "Motor y transmisión"
        );

        Servicio servicio1 = new ReparacionCorrectiva(
                "Cambio de transmisión",
                300000,
                "Daño en caja"
        );

        Repuesto rep1 = new Repuesto(
                1,
                "Aceite de transmisión",
                10,
                80000
        );

        Repuesto rep2 = new Repuesto(
                2,
                "Filtro",
                5,
                30000
        );

        OrdenTrabajo orden1 = new OrdenTrabajo(
                5001,
                "10/05/2026",
                vehiculo1,
                servicio1,
                mecanico1
        );

        orden1.agregarRepuesto(rep1);
        orden1.agregarRepuesto(rep2);

        orden1.mostrarOrden();

        orden1.generarFactura();
    }
}