package umg.tarea_2;

import java.util.Scanner;

public class Vehiculo {

    public void calcularVelocidadPromedio() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el número de vueltas recorridas: ");
        int vueltas = scanner.nextInt();

        System.out.print("Ingresa el tiempo total transcurrido (en segundos): ");
        double tiempoTotal = scanner.nextDouble();

        double velocidadProm = vueltas / (tiempoTotal / 3600.0); // Convertir segundos a horas

        System.out.println("La velocidad promedio del vehículo fue: " + velocidadProm + " km/h");
    }

    public void ingresarDatosVehiculo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el nombre del vehículo: ");
        String nombreVehiculo = scanner.nextLine();

        int vueltas = 0;
        double tiempoTotal = 0;

        System.out.println("Ingresa los tiempos de cada vuelta (en segundos).");
        int vueltaActual = 1;

        while (true) {
            System.out.print("Tiempo de vuelta " + vueltaActual + " (o -1 para terminar): ");
            double tiempoVuelta = scanner.nextDouble();

            if (tiempoVuelta == -1) {
                break;
            }

            vueltas++;
            tiempoTotal += tiempoVuelta;
            vueltaActual++;
        }

        double velocidadPromedio = vueltas / (tiempoTotal / 3600.0); // Convertir segundos a horas

        System.out.println("La velocidad promedio del vehículo " + nombreVehiculo + " fue: " + velocidadPromedio + " km/h");
    }
}
