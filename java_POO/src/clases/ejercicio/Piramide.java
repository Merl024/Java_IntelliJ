package clases.ejercicio;


import java.util.Scanner;

public class Piramide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de filas para la pirámide: ");
        int filas = scanner.nextInt();

        // Bucle para generar la pirámide
        for (int i = 1; i <= filas; i++) {
            // Imprimir espacios antes de los asteriscos
            for (int j = 1; j <= filas - i; j++) {
                System.out.print(" ");
            }
            // Imprimir los asteriscos
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            // Nueva línea para la siguiente fila
            System.out.println();
        }
        scanner.close(); // Cerrar el Scanner
    }

}


