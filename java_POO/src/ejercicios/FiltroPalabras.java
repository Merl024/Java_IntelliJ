package ejercicios;

/* Escriba un programa que filtre palabras de un ArrayList de strings. Comience creando un
ArrayList de palabras
El programa debe:
• Eliminar todas las palabras con menos de 3 letras
• Encontrar todas las palabras que empiezan con vocal
• Contar cuántas palabras contienen una letra específica
• Imprimir la palabra más larga de la lista */

import java.util.ArrayList;
import java.util.List;


public class FiltroPalabras {
    public static void main(String[] args) {
        ArrayList<String> palabras = new ArrayList<>(List.of("si", "no", "melisa", "hola", "al", "adios", "esther", "telefono", "computadora"));
        System.out.println( "Lista original" + palabras);

        // Eliminar las palabras con menos de 3 letras
        palabras.removeIf(palabra -> palabra.length() < 3);
        System.out.println( "Eliminando palabras con menos de 3 letras: " + palabras);

        // Encontrar todas las palabras que empiezan con una vocal
        String vocales = "aeiouáéíóú";

        ArrayList<String> palabrasConVocal = new ArrayList<>();

        for(String palabra : palabras){
            if(palabra.startsWith("a") || palabra.startsWith("e") || palabra.startsWith("i") || palabra.startsWith("o") || palabra.startsWith("u")){
                palabrasConVocal.add(palabra);
            }
        }
        System.out.println("Las palabras que empiezan con una vocal son " + palabrasConVocal);

        // Contar cuantas palabras contienen una letra especifica
        System.out.println("Ingrese una letra: ");
        char letra = 'a';
        int contador = 0;
        for(String palabra : palabras){
            if(palabra.contains(Character.toString(letra))){
                contador++;
            }
        }

        System.out.println("La cantidad de palabras que contiene la letra '" + letra + "' es: " + contador);

        // Imprimiendo la palabra mas larga de la lista
        String masLargo = "";

        for(String palabra : palabras){
            if(palabra.length() > masLargo.length()){
                masLargo = palabra;
            }
        }
        System.out.println("La palabra mas larga en el arreglo es: " + masLargo);
    }
}
