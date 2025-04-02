package clases.semana8.prueba;

import java.util.ArrayList;
import java.util.Comparator;

public class EjemploLista {
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();

        productos.add(new Producto("Botella de agua", "Alpina", 123, 1.50));
        productos.add(new Producto("Cafe", "The ccoffe cup", 234, 4.50));
        productos.add(new Producto("Coca-Cola", "Coca-Cola", 345, 1.50));

        System.out.println(productos);
        System.out.println(productos.get(2));

        int posicion = -1;
        for( int i =0; i < productos.size(); i++ ){
            if (productos.get(i).getCodigo() == 234 ){
                posicion = i;
                break;
            }
        }
        System.out.println(posicion);

        boolean existe = false;
        for( int i =0; i < productos.size(); i++ ){
            if (productos.get(i).getNombre().equals("Botella de agua") ){
                existe = true;
            }
        }

        if (existe = true){
            System.out.println("Si existe en la lista");
        } else {
            System.out.println("No esta en la lista");
        }

        productos.remove(0);
        productos.sort(Comparator.comparingDouble(Producto::getPrecio));
        System.out.println(productos);
    }
}
