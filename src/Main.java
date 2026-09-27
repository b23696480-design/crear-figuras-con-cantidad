//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de la figura: ");
        int tamaño = teclado.nextInt();

        System.out.println("\n===== CUADRADO CON FOR =====");

        // Dibujar un cuadrado
        for (int fila = 1; fila <= tamaño; fila++) {

            for (int columna = 1; columna <= tamaño; columna++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println("\n===== TRIANGULO CON FOR =====");

        // Dibujar un triángulo
        for (int fila = 1; fila <= tamaño; fila++) {

            for (int columna = 1; columna <= fila; columna++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println("\n===== CUADRADO CON DO WHILE =====");

        int fila = 1;

        do {
            int columna = 1;

            do {
                System.out.print("* ");
                columna++;
            } while (columna <= tamaño);

            System.out.println();
            fila++;

        } while (fila <= tamaño);

        System.out.println("\n===== TRIANGULO CON DO WHILE =====");

        fila = 1;

        do {
            int columna = 1;

            do {
                System.out.print("* ");
                columna++;
            } while (columna <= fila);

            System.out.println();
            fila++;

        } while (fila <= tamaño);

        teclado.close();
    }
}
