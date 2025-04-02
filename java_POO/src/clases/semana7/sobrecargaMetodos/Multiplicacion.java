package clases.semana7.sobrecargaMetodos;

public class Multiplicacion {
    public static double multiplicar(double a, double b){ return a*b; }

    // agregue sobrecarga a multiplicar para un int y un string
    public static String multiplicar(int b, String ... a){ // "a" pasa a ser un arreglo de elementos
                                                    // Por lo que para aceder a ellos es necesario un for
        String respuesta = "";
        for(int i = 0; i < b; i++){
            for(String palabra : a){
                respuesta += palabra;
            }
        };
        return respuesta;
    }

    public static void main(String[] args) {
        System.out.println(multiplicar(4, 5));
        System.out.println(multiplicar(4,"Chris", "Te", "Odio"));
    }
}
