package clases.colecciones;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {
        LinkedList listaAbierta = new LinkedList<>();
        listaAbierta.add("Melisa Rivas");
        listaAbierta.add(1998);
        System.out.println(listaAbierta);
        // No se reserva un tipo de dato en especifico. Esta por medio de punteros
        /* Los punteros se basan en diferentes nodos que redireccionan a otro nodo. Estos no tienen limite  */

        // Otra manera de crear listas sin tener que especificar que tipo de dato son
        ArrayList arrayAbierto = new ArrayList();
        arrayAbierto.add("Melisa");
        arrayAbierto.add(1902);
        System.out.println(arrayAbierto);

        LinkedList<String> nombres = new LinkedList<>();
        nombres.add("Melisa");
        nombres.add("Alisson");
        nombres.offer("Alejandra"); // Ultimo elemento
        nombres.push("Christian"); // Primero elemento
        nombres.add("Edilson");

        System.out.println(nombres);
        System.out.println(nombres.peek());

        nombres.pollLast(); // Recupera y remueve el ultimo elemento de la lista
        System.out.println(nombres);

    }
}
