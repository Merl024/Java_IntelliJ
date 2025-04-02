package clases.colecciones;

import java.util.*;

public class EjemploArrayList {
    public static void main(String[] args) {
        ArrayList<String> estudiantes = new ArrayList<>();
        //  CRUD - add,get, set, remove
        estudiantes.add("Juan");
        estudiantes.add("Melisa");
        System.out.println(estudiantes);

        // Set es para update el nombre en una posicion en especifico
        System.out.println(estudiantes.get(1));
        estudiantes.add("Alejandra");
        estudiantes.add("Alisson");
        estudiantes.add("Christian");
        estudiantes.set(0, "Joaquin");
        System.out.println(estudiantes);

        estudiantes.remove(0);
        System.out.println(estudiantes);

        // Natural order ordena las cosas en orden alfabetico
        estudiantes.sort(Comparator.naturalOrder());
//        estudiantes.sort(Comparator.reverseOrder()); // Los ordena al reves
        System.out.println(estudiantes);

        // Otra alternativa
        Collections.sort(estudiantes);
        System.out.println(estudiantes);

        estudiantes.clear();
        System.out.println(estudiantes);

        // Otra forma de estanciar las ArrayList
        ArrayList<String> nombres = new ArrayList<>(Arrays.asList("Daniel", "Francisco", "Jose", "Ana"));
        System.out.println(nombres.size());

        /* REVISAR DIAPOSITIVA Y RECORDAR A ALE DE HACER LO MISMO */
    }
}
