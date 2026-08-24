import java.util.Scanner;

public class VentasPorCategorias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double venta, totalGlobal;
        int contMas1000, cont500a1000, contMenos500;
        double totalMas1000, total500a1000, totalMenos500;
        String continuar;

        contMas1000 = 0;
        cont500a1000 = 0;
        contMenos500 = 0;
        totalMas1000 = 0;
        total500a1000 = 0;
        totalMenos500 = 0;
        totalGlobal = 0;

        System.out.print("¿Desea registrar una venta? (si / no): ");
        continuar = sc.nextLine().toLowerCase();

        while (continuar.equals("si")) {
            System.out.print("Ingrese el monto de la venta: ");
            venta = sc.nextDouble();

            while (venta <= 0) {
                System.out.print("El monto debe ser positivo. Ingrese nuevamente: ");
                venta = sc.nextDouble();
            }

            if (venta > 1000) {
                contMas1000++;
                totalMas1000 += venta;
            } else if (venta > 500) {
                cont500a1000++;
                total500a1000 += venta;
            } else {
                contMenos500++;
                totalMenos500 += venta;
            }

            totalGlobal += venta;

            sc.nextLine(); // limpiar buffer
            System.out.print("¿Desea registrar otra venta? (si / no): ");
            continuar = sc.nextLine().toLowerCase();
        }

        if (totalGlobal > 0) {
            System.out.println("==============================");
            System.out.println("      RESUMEN DE VENTAS");
            System.out.println("==============================");
            System.out.println("Ventas mayores a $1000: " + contMas1000);
            System.out.println("  Monto total: $" + String.format("%.2f", totalMas1000));
            System.out.println("Ventas entre $500 y $1000: " + cont500a1000);
            System.out.println("  Monto total: $" + String.format("%.2f", total500a1000));
            System.out.println("Ventas menores o iguales a $500: " + contMenos500);
            System.out.println("  Monto total: $" + String.format("%.2f", totalMenos500));
            System.out.println("------------------------------");
            System.out.println("Monto global vendido: $" + String.format("%.2f", totalGlobal));
            System.out.println("Total de ventas: " + (contMas1000 + cont500a1000 + contMenos500));
            System.out.println("==============================");
        } else {
            System.out.println("No se registró ninguna venta. Fin del programa.");
        }

        sc.close();
    }
}

