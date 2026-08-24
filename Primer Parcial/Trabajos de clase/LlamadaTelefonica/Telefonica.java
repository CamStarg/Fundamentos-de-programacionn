import java.util.Scanner;

public class Telefonica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Duración de la llamada (minutos): ");
        int duracion = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        System.out.print("Día (domingo / habil): ");
        String dia = sc.nextLine().toLowerCase();

        String turno = "NO APLICA";
        if (dia.equals("habil")) {
            System.out.print("Turno (matutino / vespertino): ");
            turno = sc.nextLine().toLowerCase();
        }

        // Cálculo del costo base
        double costo_base = (duracion <= 5) ? duracion * 1.0 :
                            (duracion <= 8) ? 5 + (duracion - 5) * 0.8 :
                            (duracion <= 10) ? 5 + 3 * 0.8 + (duracion - 8) * 0.7 :
                                               5 + 3 * 0.8 + 2 * 0.7 + (duracion - 10) * 0.5;

        // Cálculo del impuesto
        double impuesto = dia.equals("domingo") ? costo_base * 0.03 :
                          turno.equals("matutino") ? costo_base * 0.15 :
                          turno.equals("vespertino") ? costo_base * 0.10 : 0;

        double total = costo_base + impuesto;

        // Salida
        System.out.println("=== DESGLOSE DE PAGO ===");
        System.out.println("Día: " + dia);
        System.out.println("Turno: " + turno);
        System.out.println("Duración: " + duracion + " min");
        System.out.println("Costo base: $" + costo_base);
        System.out.println("Impuesto:   $" + impuesto);
        System.out.println("Total:      $" + total);

        sc.close();
    }
}
