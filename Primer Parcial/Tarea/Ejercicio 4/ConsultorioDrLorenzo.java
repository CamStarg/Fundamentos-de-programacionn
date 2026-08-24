import java.util.Scanner;

public class ConsultorioDrLorenzo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de cita: ");
        int numeroCita = scanner.nextInt();

        double costoCita;
        double totalTratamiento;

        if (numeroCita >= 1 && numeroCita <= 3) {
            costoCita = 900.0;
            totalTratamiento = numeroCita * 900.0;
        } else if (numeroCita >= 4 && numeroCita <= 5) {
            costoCita = 800.0;
            totalTratamiento = 2700.0 + (numeroCita - 3) * 800.0;
        } else if (numeroCita >= 6 && numeroCita <= 8) {
            costoCita = 600.0;
            totalTratamiento = 4300.0 + (numeroCita - 5) * 600.0;
        } else {
            costoCita = 500.0;
            totalTratamiento = 6100.0 + (numeroCita - 8) * 500.0;
        }

        System.out.println("\n--- Resumen del Cobro ---");
        System.out.printf("Costo de la cita #%d: $%.2f%n", numeroCita, costoCita);
        System.out.printf("Monto acumulado del tratamiento: $%.2f%n", totalTratamiento);

        scanner.close();
    }
}
