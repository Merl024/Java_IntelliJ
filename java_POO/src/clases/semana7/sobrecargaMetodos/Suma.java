package clases.semana7.sobrecargaMetodos;

public class Suma {
    // Este metodo se puede hacer para los doubles,
    // pero el tener dos metodos que realizan la misma funcion, no es buena practica
    public static int sumar (int a, int b){
        return a+b;
    }

    public static double sumar (double a, double b){
        return a+b;
    }

//    public static double sumarDoubles (double a, double b){
//        return a+b;
//    } // Mala pracctica

    public static int suma (String a, String b){
        return Integer.parseInt(a) + Integer.parseInt(b);
    }

    public static void main(String[] args) {
        System.out.println(sumar(3,7));
        System.out.println(sumar(3.5,7.84));
        System.out.println(suma("10", "4"));

        System.out.println(Multiplicacion.multiplicar(7, "Hola"));
    }
}
