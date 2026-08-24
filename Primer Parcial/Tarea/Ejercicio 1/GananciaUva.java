import java.util.Scanner;

public class GananciaUva {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double precioInicial;
        double precioFinal;
        double kilos;
        double ganancia;

        char tipo;
        int tamaño;

        System.out.print("Ingrese el precio inicial por kilo: $");
        precioInicial = sc.nextDouble();

        System.out.print("Ingrese el tipo de uva (A o B): ");
        tipo = sc.next().toUpperCase().charAt(0);

        System.out.print("Ingrese el tamaño de la uva (1 o 2): ");
        tamaño = sc.nextInt();

        System.out.print("Ingrese la cantidad de kilos: ");
        kilos = sc.nextDouble();

        precioFinal = precioInicial;

        if (tipo == 'A') {
            if (tamaño == 1) {
                precioFinal = precioInicial + 0.20;
            } else if (tamaño == 2) {
                precioFinal = precioInicial + 0.30;
            }
        } else if (tipo == 'B') {
            if (tamaño == 1) {
                precioFinal = precioInicial - 0.30;
            } else if (tamaño == 2) {
                precioFinal = precioInicial - 0.50;
            }
        }

        ganancia = precioFinal * kilos;

        System.out.println("\nPrecio final por kilo: $" + precioFinal);
        System.out.println("Cantidad que recibirá el productor: $" + ganancia);

        sc.close();
    }
}