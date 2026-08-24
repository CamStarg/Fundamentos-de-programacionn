import java.util.Scanner;

public class AsignacionBecas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la edad del estudiante: ");
        int edad = scanner.nextInt();

        System.out.print("Ingrese el promedio del estudiante: ");
        double promedio = scanner.nextDouble();

        System.out.println("\n--- Resultado de la Solicitud ---");

        if (edad > 18) {
            // Criterios para mayores de 18 años
            if (promedio >= 9.0) {
                System.out.println("Monto de la beca asignada: $10,000.00");
            } else if (promedio >= 7.5) {
                System.out.println("Monto de la beca asignada: $8,000.00");
            } else if (promedio >= 6.0) {
                System.out.println("Monto de la beca asignada: $5,000.00");
            } else {
                System.out.println("No alcanza beca. Se enviará una carta de invitación incitándolo a estudiar más.");
            }
        } else {
            // Criterios para 18 años o menores
            if (promedio >= 9.0) {
                System.out.println("Monto de la beca asignada: $8,000.00");
            } else if (promedio >= 8.0) {
                System.out.println("Monto de la beca asignada: $6,000.00");
            } else if (promedio >= 6.0) {
                System.out.println("Monto de la beca asignada: $4,000.00");
            } else {
                System.out.println("No alcanza beca. Se enviará una carta de invitación incitándolo a estudiar más.");
            }
        }

        scanner.close();
    }
}
