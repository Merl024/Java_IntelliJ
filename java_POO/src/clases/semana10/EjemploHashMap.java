package clases.semana10;

import java.util.HashMap;
import java.util.Map;

public class EjemploHashMap {
    public static void main(String[] args) {
        // En los maps no se puede usar datos primitivos sino que se usan wrappers
        // Los diccionarios igual que los sets no tienen un indice, por lo que no tiene un orden
        HashMap<Integer, Double> notas = new HashMap<>(); // Creando un diccionario vacio
    // >> Para bucles usar for-each
        notas.put(20245324, 8.95);
        notas.put(20245223, 7.7);
        notas.put(20245983, 9.8);
        notas.put(20245243, 5.35);
        System.out.println(notas);

        System.out.println(notas.get(20245324));
        double promedio = notas.get(20245324) * 0.4;
        System.out.println(promedio);
        System.out.println(notas.get(20245320)); // por lo mismo que no hay indices es que no devuelve un -1, sino un null

        notas.replace(20245243, 6.0);
        System.out.println(notas.get(20245243));

        notas.remove(20245223);
        System.out.println(notas);

        System.out.println(notas.containsKey(20245223));
        System.out.println(notas.containsValue(10.0));
        System.out.println(notas.size());

        // Iterar la llaves
        for(Integer carnet : notas.keySet()){ // Key set es un metodo de hashmap que regresa un lista de todas las llaves
            System.out.println(carnet);
        }

        // Iterar los valores
        double suma = 0.0;
        for(Double nota : notas.values()){
            suma += nota;
        }
        System.out.println("El promedio de las notas es: "+ (suma/ notas.size()));

        // Entry trabaja con key y value al mismo tiempo
        for (Map.Entry<Integer, Double> entry : notas.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
