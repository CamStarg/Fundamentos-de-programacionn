import java.util.Scanner;

public class CobroEstacionamiento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de horas en el estacionamiento: ");
        int horas = scanner.nextInt();

        double totalPagar;

        if (horas <= 0) {
            System.out.println("Error: El tiempo ingresado debe ser mayor a 0 horas.");
        } else {
            if (horas <= 2) {
                totalPagar = horas * 30.0;
            } else if (horas <= 5) {
                totalPagar = 60.0 + (horas - 2) * 25.0;
            } else if (horas <= 10) {
                totalPagar = 135.0 + (horas - 5) * 20.0;
            } else {
                totalPagar = 380.0; // Tarifa fija para más de 10 horas
            }

            System.out.println("\n--- Recibo de Cobro ---");
            System.out.println("Horas registradas: " + horas);
            System.out.printf("Total a pagar: $%.2f%n", totalPagar);
        }

        scanner.close();
    }
}
