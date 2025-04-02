package clases.colecciones;

import java.util.HashSet;
import java.util.Stack;

public class EjemploHashSets {
    public static void main(String[] args) {
        HashSet<String> nombres = new HashSet<>();
        nombres.add("Melisa");
        nombres.add("Alisson");
        nombres.add("Alejandra");
        nombres.add("Christian");
        nombres.add("Edilson");

        System.out.println(nombres); // No respeta un orden, por lo que no hay indices.
        System.out.println(nombres.contains("Alejandra"));

        HashSet<String> alumnos = new HashSet<>();
        alumnos.add("Dante");
        alumnos.add("Fernanda");
        alumnos.add("Brenda");
        alumnos.add("Melisa");

        nombres.addAll(alumnos);
        System.out.println(nombres);
        alumnos.retainAll(nombres); // Investigar sobre su uso
        // pero practicamente solo muestra los elementos comunes

        



    }
}
