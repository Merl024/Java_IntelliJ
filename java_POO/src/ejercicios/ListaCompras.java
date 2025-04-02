package ejercicios;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/* Desarrolle un programa que gestione una lista de compras usando ArrayList<String>.
El programa debe:
• Agregar artículos a la lista
• Eliminar artículos de la lista
• Verificar si un artículo ya está en la lista (sin distinción entre mayúsculas y minúsculas)
• Vaciar la lista completa
• Imprimir la lista con numeración  */

public class ListaCompras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listaCompras = new ArrayList<>();

        boolean online = true;

        System.out.println("Bienvenido al sistema de lista de compras");
        while(online){
            System.out.println("\n1. Agregar artículos a la lista ");
            System.out.println("2. Eliminar artículos de la lista ");
            System.out.println("3. Verificar si un artículo ya está en la lista");
            System.out.println("4. Imprimir la lista");
            System.out.println("\t Presiona 0 para salir del sistema");
            String opcion = scanner.nextLine();
            switch (opcion){
                case "1":
                    System.out.println("Escriba el articulo que quisiera agregar");
                    String articulo = scanner.nextLine().toLowerCase();
                    listaCompras.add(articulo);
                    System.out.println("Su articulo ha sido añadido exitosamente ");
                    System.out.println(listaCompras);
                    break;

                case "2":
                    System.out.println("Escriba el nombre del articulo que quisiera eliminar de la lista");
                    String artRemove = scanner.nextLine().toLowerCase();
                    if(!listaCompras.contains(artRemove)) {
                        System.out.println("No se encontro el producto que quiere eliminar");
                    } else{
                        listaCompras.remove(artRemove);
                        System.out.println("Su articulo ha sido eliminado con exito");
                        System.out.println(listaCompras);
                    }
                    break;

                case "3":
                    System.out.println("Escriba el articulo para verificar si ya esta agregado en la lista");
                    String artBuscar = scanner.nextLine().toLowerCase();
                    if(listaCompras.contains(artBuscar)){
                        System.out.println("El articulo ya se encuentra en la lista de compras");
                    } else {
                        System.out.println("El articulo no se encuentra en la lista de compras");
                    }
                    break;

                case "4":
                    System.out.println("Lista de compras:");
                    int contador = 0;
                    if(listaCompras.isEmpty()){
                        System.out.println("Aun no hay productos dentro de la lista de compra");
                    } else{
                        for(String producto : listaCompras){
                            contador++;
                            System.out.println(contador + ". " + producto);
                        }
                    }
                    break;

                case "0":
                    online = false;
                    System.out.println("\nSaliendo del sistema...");
                    break;
                default:
                    System.out.println("Ingrese una de las opciones validas");
            }
        }
    }
}
