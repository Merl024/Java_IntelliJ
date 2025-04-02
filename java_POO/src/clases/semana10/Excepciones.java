package clases.semana10;
/* Manejo de excepciones
* */
public class Excepciones {
    public static void main(String[] args) {
//        Double nota = null;
//        nota = nota * 2;

        try{
            int[] numero = { 1, 2, 3};
            System.out.println(numero[10]); // NO hay ningun valor en la posicion 10
        } catch (Exception e){
            System.out.println("Ha habido un error");
        }

        System.out.println("");

        int a = 10;
        int b = 0;
        try {
            int result = a / b;
            System.out.println("Resultado: " + result);
        } catch (ArithmeticException e) {
            System.out.println("No es posible dividir por cero!");
            System.out.println("Exception message: " + e.getMessage());
            System.out.println("Exception type: " + e.getClass().getName());
        } // acá termina el bloque try-catch
        System.out.println("Continua la ejecucion del programa");

        System.out.println("");

        try {
            int[] numbers = {1, 2, 3}; // null;
            System.out.println(numbers[5]); // Produce ArrayIndexOutOfBoundsException
            String text = null;
            System.out.println(text); // Produce NullPointerException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error en el índice del arreglo: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Error de puntero nulo: " + e.getMessage());
        } finally {
            System.out.println("Este mensaje se vera independientemente del resultado");
        }

        /* La clave esta en primero correr el codigo para identificar que tipo de error produce */
    }

}
