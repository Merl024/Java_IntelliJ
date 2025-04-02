package clases.semana9;

import java.util.HashMap;
import java.util.Map;

public class EjemploHashMap {
    public static void main(String[] args) {
        HashMap<String, String> capitales = new HashMap<>();

        capitales.put("El Salvador", "San Salvador");
        capitales.put("Colombia", "Bogota");

        // Para acceder a un valor usamos .get(llave)
        System.out.println(capitales.get("Colombia")); // Regresa el valor

        // EntrySet ayuda a retornar tanto la clave como el valor
        for (Map.Entry<String, String> capital : capitales.entrySet()){
            System.out.println("La capital " + capital.getValue() + " esta en " + capital.getKey());
        }
    }
}
