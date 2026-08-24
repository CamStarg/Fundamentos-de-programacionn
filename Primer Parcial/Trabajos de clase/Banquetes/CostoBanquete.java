import java.util.Scanner;

public class CostoBanquete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cantidad;
        double precioPorPlatillo, total;

        System.out.print("Ingrese la cantidad de platillos: ");
        cantidad = sc.nextInt();

        if (cantidad <= 200) {
            precioPorPlatillo = 95.0;
        } else if (cantidad <= 300) {
            precioPorPlatillo = 85.0;
        } else {
            precioPorPlatillo = 75.0;
        }

        total = cantidad * precioPorPlatillo;

        System.out.println("El costo total del banquete es: $" + String.format("%.2f", total));

        sc.close();
    }
}
