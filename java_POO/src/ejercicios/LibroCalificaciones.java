package ejercicios;

/* Escriba un programa que procese calificaciones de estudiantes almacenadas en un array.
Para comenzar, inicialize un array con 5 calificaciones en escala de 0 a 100
Luego:
• Calcule la calificación promedio
• Convierta calificaciones numéricas a letras (A: 90-100, B: 80-89, C: 70-79, D: 60-69, F:
0-59)
• Cuente cuántos estudiantes aprobaron (calificación >= 60)
• Verifique si algún estudiante obtuvo calificación perfecta (100) */

import java.util.Arrays;

public class LibroCalificaciones {


    public static void main(String[] args) {
        int[] notas = {85, 35, 90, 100, 68};

        // Sacando promedio de las notas del arreglo
        double promedio = 0;
        double suma = 0;
        for(int nota : notas){
            suma += nota;
            promedio = suma / notas.length;
        }
        System.out.println("El promedio de las notas es: " + promedio);

        // Convirtienndo las notas a letras
        char[] notasLetras = new char[notas.length];
        for ( int i = 0; i < notas.length; i++){
            if(notas[i] >= 90){
                notasLetras[i] = 'A';
            } else if (notas[i] >= 80) {
                notasLetras[i] = 'B';
            } else if (notas[i] >= 70) {
                notasLetras[i] = 'C';
            } else if (notas[i] >= 60) {
                notasLetras[i] = 'D';
            } else {
                notasLetras[i] = 'F';
            }
        }

        System.out.println("Las notas con escala A - F: " + Arrays.toString(notasLetras));

        // Aprobados
        int aprobado = 0;
        for(int nota : notas){
            if(nota >= 60){
                aprobado++;
            }
        }
        System.out.println(aprobado + " estudiantes aprobaron");

        // Nota maxima
        int contador = 0;
        for(int nota :notas){
            if(nota == 100){
                contador++;
                System.out.println("Hay " + contador + " estudiante/s con una nota perfecta");
                break;
            }
        }
    }
}
