package clases.semana7.sobrecarga;

public class Multiplicación {
    public static double multiplicar(double a, double b){
        return a*b;
    }

    // agregué una sobrecarga para un int y un string
    public static String multiplicar(String s, int m){
        return s.repeat(m);
    }

    // Varargs
    public static String multiplicar(int veces, String ... palabras){
        String respuesta = "";
        for(int i=0; i<veces; i++){
            for(String palabra: palabras){
                respuesta += palabra;
            }
        }
        return respuesta;
    }


    public static void main(String[] args){
        System.out.println(multiplicar(6.5, 3));
        System.out.println(multiplicar("Hola", 10));
        System.out.println(multiplicar(3, "Hola", "pelón,", "quétal? "));
    }
}
