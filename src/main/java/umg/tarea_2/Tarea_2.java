package umg.tarea1;

import umg.tarea_2.Vehiculo;
import java.util.Scanner;

public class Tarea_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        Vehiculo vehiculo = new Vehiculo();

        while (opcion != 3) {

            System.out.println("1. Calcular velocidad promedio");
            System.out.println("2. Ingresar datos de otro vehículo");
            System.out.println("3. Salir");
            System.out.print("Ingresa una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    vehiculo.calcularVelocidadPromedio();
                    break;
                case 2:
                    vehiculo.ingresarDatosVehiculo();
                    break;
                case 3:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Inténtalo nuevamente.");
            }
        }

        scanner.close();
    }
}
