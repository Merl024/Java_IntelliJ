package clases.ejercicio;

/* Escriba un programa que cuente cuántas veces aparece un determinado carácter en un texto.
•Por ejemplo, en el texto “Programacion Orientada a Objetos”, contar cuantas veces aparece el carácter ‘e’, que es 2 veces.
•Desarrolle un programa que, a partir de un texto, chequee si la primera palabra está escrita con mayúscula inicial,
y si el texto acaba con un punto. Si no es así, devuelve el texto corregido.
•Desarrolle un programa que reescriba un texto usando mayúsculas y minúsculas en forma alternada.
Por ejemplo, el texto “Programacion” lo transforma a “PrOgRaMaCiOn”.
•Desarrolle un programa que convierta cada palabra del texto para que comience con mayúsculas,
por ejemplo: “Programacion orientada a objetos” lo convierte a “Programacion Orientada A Objetos”. */

public class StringProcessor {
    public static void main(String[] args) {
        String materia = "Programacion Orientada a Objetos";

        // Con base a el texto contar cuantas e contiene
        int conteoE =0;
        for(int i =0; i < materia.length(); i++){
            if(materia.charAt(i) == 'e'){
                conteoE++;
            }
        }
        System.out.println("Hay " + conteoE + " 'e' en el texto");

        // Desarrolle un programa que, a partir de un texto, chequee si la primera palabra está escrita con mayúscula inicial,
        // y si el texto acaba con un punto. Si no es así, devuelve el texto corregido.
        String texto = "hola, mundo. Como estan";
        String fraseCorregida = "";

        if (!Character.isUpperCase(texto.charAt(0)) || texto.charAt(texto.length()-1 ) != '.') {
            fraseCorregida += Character.toUpperCase(texto.charAt(0));
            fraseCorregida += texto.substring(1); // Para que la frase corregida siga imprimiendo lo que va despues de la mayuscula
            fraseCorregida += '.';

            System.out.println(fraseCorregida);
        } else {
            System.out.println(texto);
        }

//        Desarrolle un programa que reescriba un texto usando mayúsculas y minúsculas en forma alternada.
//        Por ejemplo, el texto “Programacion” lo transforma a “PrOgRaMaCiOn”.

        String palabra= "programacion";
        String nuevaPalabra = "";
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i); // Obtenemos la letra en la posición i

            // Alternamos mayúsculas y minúsculas
            if (i % 2 == 0) {
                nuevaPalabra += Character.toUpperCase(letra); // Si i es par, convertimos a mayúscula
            } else {
                nuevaPalabra += Character.toLowerCase(letra); // Si i es impar, convertimos a minúscula
            }
        }

        System.out.println("Texto alternado: " + nuevaPalabra);
    }
}
