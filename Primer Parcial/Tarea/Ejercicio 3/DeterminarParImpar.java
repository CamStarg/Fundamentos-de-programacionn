import java.util.Scanner;

public class DeterminarParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        // Primer condicional
        if (numero == 0) {
            System.out.println("El número es Neutro (Cero).");
        } else {
            // Condicional anidado dentro del else
            if (numero % 2 == 0) {
                System.out.println("El número " + numero + " es Par.");
            } else {
                System.out.println("El número " + numero + " es Impar.");
            }
        }

        scanner.close();
    }
}