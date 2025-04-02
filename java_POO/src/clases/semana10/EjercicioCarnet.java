package clases.semana10;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class EjercicioCarnet {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // tiene que tener 8 digitos
        // de 1994 a 2024 -- error aritmetico
        // si mete otro tipo de dato -- NumberFormatEcxception

        int primero = 1993;
        int ultimo = 2025;


        try {
            System.out.println("Ingrese su numero de carnet:");
            String input = s.nextLine();
            int carnet = Integer.parseInt(input);
            int anio = Integer.parseInt(input.substring(0,4));

            if ( input.length() != 8 ){
                throw new ArithmeticException("El carnet tiene que ser estrictamente de 8 digitos");
            }
            if (anio < primero || anio > ultimo){
                throw new ArithmeticException("Los primeros digitos tienen que estar dentro de los años " + primero + " y " + ultimo);
            }
            System.out.println("Carnet valido " + carnet);
        } catch (ArithmeticException e){
            System.err.printf("Error: " + e.getMessage());
//            e.printStackTrace();  // este ayuda a que de mas informacion sobre el error
        } catch (NumberFormatException e){
            System.err.printf("Solo se admiten numeros");
        }
    }
}
