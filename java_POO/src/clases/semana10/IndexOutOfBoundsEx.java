package clases.semana10;

public class IndexOutOfBoundsEx {
    public static void main(String[] args) {
//        int[] numeros = { 1, 2, 3,};
//        System.out.println(numeros[3]);
//        System.out.println("Esto no saldra por un error de indice de arriba");

        try {
            int[] numeros = { 1, 2, 3,};
            System.out.println(numeros[5]);
        } catch (ArrayIndexOutOfBoundsException e){
            // En el exception, al momento de imprimir un mensaje, es buena practica el especificar que esta fallando
            System.out.println("El indice no es valido");

        }

        System.out.println("Esto si se imprime porque se maneja el error");
    }
}
