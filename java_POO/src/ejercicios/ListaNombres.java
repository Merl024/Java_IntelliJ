package ejercicios;

/* Escriba un programa que gestione una lista de nombres usando ArrayList<String>. Inicialice
la lista con al menos 5 nombres de personas.
El programa debe realizar lo siguiente:
• Agregar un nuevo nombre a la lista
• Eliminar un nombre de la lista
• Verificar si un nombre existe en la list
• Imprimir todos los nombres en orden alfabético
• Contar cuántos nombres empiezan con una letra determinada. */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaNombres {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>(List.of("Melisa", "Alisson", "Ale", "Chris", "Lis"));

        boolean online = true;

        while (online) {
            System.out.println("Escoja una de las opciones:");
            System.out.println("1. Agregar un nuevo nombre a la lista");
            System.out.println("2. Eliminar un nombre de la lista");
            System.out.println("3. Verificar si existe un nombre en la lista");
            System.out.println("4. Imprimir todos los nombres en orden alfabetico");
            System.out.println("5. Contar cuantos nombres empiezan con una letra determinada");
            System.out.println("\t Presiona 0 para salir del sistema");
            String opcion = scanner.nextLine();
//            scanner.nextLine()

            switch (opcion) {
                case "1":
                    System.out.println("Ingresa el nombre que deseas agregar: ");
                    String nombreAdd = scanner.nextLine();
                    nombres.add(nombreAdd);
                    System.out.println("El nombre " + nombreAdd + " ha sido guardado exitosamente!");
                    System.out.println(nombres);
                    break;

                case "2":
                    System.out.println("Ingrese el nombre de la persona que desea eliminar");
                    String nombreRemove = scanner.nextLine();
                    nombres.remove(nombreRemove);
                    System.out.println(nombreRemove + " ha sido exitosamente eliminado.");
                    System.out.println(nombres);
                    break;

                case "3":
                    System.out.println("Escribe el nombre de la persona que deseas buscar");
                    String nombreBuscar = scanner.nextLine();

                    if (nombres.contains(nombreBuscar)){
                        System.out.println(nombreBuscar + " si se encuentra en la lista");
                    } else{
                        System.out.println(nombreBuscar + " no se encuentra en la lista");
                    }
                    break;

                case "4":
                    nombres.sort(String::compareTo);
                    System.out.println("Nombres por orden alfabetico" + nombres);
                    break;

                case "5":
                    System.out.println("Ingrese una letra para hacer el conteo");
                    char letra = scanner.nextLine().charAt(0);
                    int cuenta = 0;
                    for (String nombre : nombres){
                        if(nombre.startsWith(String.valueOf(letra))){
                            cuenta++;
                        }
                    }
                    System.out.println("Cantidad de nombre que empiezan con " + letra + ": " + cuenta);
                    break;

                case "0":
                    System.out.println("Saliendo del sistema...");
                    online = false;

                default:
                    System.out.println("Escoga una de las opciones validas");
            }
        }
        scanner.close();
    }
}

