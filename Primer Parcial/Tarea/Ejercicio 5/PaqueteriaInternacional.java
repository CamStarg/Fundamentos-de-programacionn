import java.util.Scanner;

public class PaqueteriaInternacional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el peso del paquete en gramos: ");
        double pesoGramos = scanner.nextDouble();

        // Validación de peso máximo (5 kg = 5000 gramos)
        if (pesoGramos > 5000) {
            System.out.println("\n[RECHAZADO] El paquete supera los 5 kg (5000g). No se puede realizar el envío por políticas de logística.");
        } else if (pesoGramos <= 0) {
            System.out.println("\nError: El peso debe ser mayor a 0 gramos.");
        } else {
            System.out.println("\n--- Selección de Zona ---");
            System.out.println("1. América del Norte ($11/g)");
            System.out.println("2. América Central ($10/g)");
            System.out.println("3. América del Sur ($12/g)");
            System.out.println("4. Europa ($25/g)");
            System.out.println("5. Asia ($30/g)");
            System.out.print("Ingrese el número de zona de destino: ");
            int zona = scanner.nextInt();

            double costoGramo = 0;
            boolean zonaValida = true;

            switch (zona) {
                case 1:
                    costoGramo = 11.0;
                    break;
                case 2:
                    costoGramo = 10.0;
                    break;
                case 3:
                    costoGramo = 12.0;
                    break;
                case 4:
                    costoGramo = 25.0;
                    break;
                case 5:
                    costoGramo = 30.0;
                    break;
                default:
                    zonaValida = false;
                    System.out.println("\nError: La zona seleccionada no existe.");
                    break;
            }

            if (zonaValida) {
                double total = pesoGramos * costoGramo;
                System.out.printf("\n--- Resumen del Envío ---%n");
                System.out.printf("Peso: %.2f g%n", pesoGramos);
                System.out.printf("Costo por gramo: $%.2f%n", costoGramo);
                System.out.printf("Cobro Total: $%.2f%n", total);
            }
        }

        scanner.close();
    }
}