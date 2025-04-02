package ejercicios;

/* Desarrolle un programa que convierta temperaturas entre Celsius y Fahrenheit usando arrays.
Para comenzar, inicialice un array de 7 temperaturas en Celsius
Luego, el programa debe:
• Convertir todas las temperaturas a Fahrenheit (usando la fórmula F = C * 9/5 + 32)
• Almacenar las temperaturas convertidas en un nuevo array
• Imprimir ambos arrays lado a lado
• Encontrar los días más cálido y más frío */

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertidorTemperaturas {
    public static void main(String[] args) {
        ArrayList<String> diasSemana = new ArrayList<>(List.of("Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"));
        ArrayList<Integer> tempCelcius = new ArrayList<>(List.of(29, 23, 21, 19, 20, 40, 37));

        // Conviertiendo los celcius a Fahrenheit
        ArrayList<Integer> tempFahrenheit = new ArrayList<>();

        for (int temp : tempCelcius){
            int fahrenheit = temp * 9/5 + 32;
            tempFahrenheit.add(fahrenheit);
        }

        System.out.println("\t   Celcius >>>> Fahrenheit");
        for (int i = 0; i < tempCelcius.size(); i++){
            System.out.println(diasSemana.get(i) + ": " +tempCelcius.get(i) + " >>>> " + tempFahrenheit.get(i));
        }

        // Encontrar los dias mas calidos y mas frios
        int calido = tempCelcius.getFirst();
        int frio = tempCelcius.getFirst();
        int posicionCalido = tempCelcius.getFirst();
        int posicionFrio = tempCelcius.getFirst();
        for (int temp : tempCelcius){
            if(temp > calido) {
                calido = temp;
                posicionCalido = tempCelcius.indexOf(calido);
            } else if(temp < frio){
                frio = temp;
                posicionFrio = tempCelcius.indexOf(frio);
            }
        }
        System.out.println("El dia mas calido es " + diasSemana.get(posicionCalido) + " con " + calido + " de temperatura");
        System.out.println("El dia mas frio es " + diasSemana.get(posicionFrio) + " con " + frio + " de temperatura");

    }
}
