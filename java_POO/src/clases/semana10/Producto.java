package clases.semana10;

import java.util.HashMap;
import java.util.Map;

public class Producto {
    public static void main(String[] args) {
        HashMap<String, Double> productos = new HashMap<>();
        productos.put("Jugo de naranja", 2.75);
        productos.put("Manzana", 0.75);
        productos.put("Café", 3.75);
        productos.put("Pan integral", 3.00);

        for (Map.Entry<String, Double> producto : productos.entrySet()){
            System.out.println("Producto: " + producto.getKey() + " precio: " + producto.getValue());
        }
    }
}
