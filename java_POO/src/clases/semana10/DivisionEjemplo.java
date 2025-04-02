package clases.semana10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionEjemplo {
    public static int dividir(int a, int b){
        return a/b;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        try {
            int num1 = s.nextInt();
            int num2 = s.nextInt();
            int resultado = dividir(num1, num2);
            System.out.println("Resultado " + resultado);
        }catch (ArithmeticException e){
            System.out.println("Operacion no admitida");
            System.out.println(e.getMessage());
        } catch (InputMismatchException e){
            System.out.println("El tipo de dato debe ser un entero");
        }
    }
}
