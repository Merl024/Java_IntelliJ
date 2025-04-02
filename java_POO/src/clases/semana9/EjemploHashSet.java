package clases.semana9;

import java.util.HashSet;


public class EjemploHashSet {
    public static void main(String[] args) {
        /*HashSet<String> letras = HashSet<String>();  contiene las letras de la A a la E
 HashSet<String> vocales = HashSet<String>(); contiene las vocales
 HashSet<String> union = new HashSet<String>(letras);
 union.addAll(vocales);
 HashSet<String> interseccion = new HashSet<String>(letras);
 interseccion.retainAll(vocales);
 HashSet<String> diferencia = new HashSet<String>(letras);
 diferencia.removeAll(vocales);*/
        HashSet<String> letras = new HashSet<String>();
        letras.add("A");
        letras.add("B");
        letras.add("C");
        letras.add("D");
        letras.add("E");
        System.out.println(letras);

        HashSet<String> vocales = new HashSet<>();
        vocales.add("A");
        vocales.add("E");
        vocales.add("I");
        vocales.add("O");
        vocales.add("U");
        System.out.println(vocales);

        // Une los dos set de letras y vocales
        HashSet<String> union = new HashSet<>(letras);
        union.addAll(vocales);
        System.out.println(union);

        // Agarra solo los elementos iguales en las dos listas
        HashSet<String> interseccion = new HashSet<>(letras);
        interseccion.retainAll(vocales);
        System.out.println(interseccion);

        // De la lista de letras imprime aquellas que no estan en la lista de vocales
        HashSet<String> diferencia = new HashSet<String>(letras);
        diferencia.removeAll(vocales);
        System.out.println(diferencia);


    }
}
