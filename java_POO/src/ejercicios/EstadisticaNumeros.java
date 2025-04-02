package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class EstadisticaNumeros{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        ArrayList<Integer> numeros = new ArrayList<>();

        // Guardandos los 10 numeros en el arreglos
        while(contador < 10) {
            ++contador;
            System.out.println("Ingrese el " + contador + "° numero");
            int numero = scanner.nextInt();
            numeros.add(numero);
        }

        // promediando los numeros que estan dentro del arreglo
        double promedio = 0;
        double suma = 0;

        for(int i = 0; i < numeros.size(); ++i) {
            suma += numeros.get(i);
            promedio = suma / (double)numeros.size();
        }

        System.out.println("El promedio de los numeros escritos es " + promedio);

        // Sacando cuantos numeros pares hay dentro del arreglo
        int totalNumerosPares = 0;

        for(int numero : numeros) {
            if (numero % 2 == 0) {
                ++totalNumerosPares;
            }
        }

        System.out.println("Hay " + totalNumerosPares + " de numeros pares en el arreglo");

        // Encontrando el numero mas grande y mas pequeño dentro del arreglos
        int mayor = numeros.get(0);
        int menor = numeros.get(0);

        for(int numero : numeros) {
            if (numero > mayor) {
                mayor = numero;
            } else if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("El numero mayor de los numeros ingresados es " + mayor);
        System.out.println("Y el numero menor del arreglo es  " + menor);

        for(int i = numeros.size() - 1; i >= 0; --i) {
            System.out.println(numeros.get(i));
        }

    }

}


