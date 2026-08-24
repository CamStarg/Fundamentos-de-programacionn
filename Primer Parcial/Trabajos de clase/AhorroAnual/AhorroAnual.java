import java.util.Scanner;

public class AhorroAnual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mes;
        double ahorroMes, ahorroTotal;

        ahorroTotal = 0;

        for (mes = 1; mes <= 12; mes++) {
            System.out.print("Ingrese la cantidad ahorrada en el mes " + mes + ": ");
            ahorroMes = sc.nextDouble();

            while (ahorroMes < 0) {
                System.out.print("El monto debe ser positivo. Ingrese nuevamente: ");
                ahorroMes = sc.nextDouble();
            }

            ahorroTotal += ahorroMes;
        }

        System.out.println("El total de ahorro acumulado en el año es: $" + String.format("%.2f", ahorroTotal));

        sc.close();
    }
}
