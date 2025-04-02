package clases.semana7.sobrecarga;
// overloading es para crear un método que funcione para varias opciones de entrada
// y así, no repetir código

public class Suma {
    public static int sumar(int a, int b){
        return a+b;
    }

    // vamos a sobrecargar el método sumar para que acepte doubles
    public static double sumar(double a, double b){
        return a+b;
    }

    public static int sumar(int a, int b, int c){
        return a+b+c;
    }

    public static double sumar (double ... sumandos) {
        double suma = 0;
        for (double sumando: sumandos){
            suma += sumando;
        }
        return suma;
    }

    /*public static Integer sumar(String s, String n){
        return Integer.parseInt(s) + Integer.parseInt(n); // para transformar los Strings a números
    } */

    public static Double sumar(String s, String n){
        return Double.parseDouble(s) + Double.parseDouble(n); // para transformar los Strings a números
    } // no puedo tener dos métodos que tienen los mismos requisitos

    /* public static double sumarDouble(double a, double b){
        return a+b;
    } pero esta no es la mejor práctica, hay que reducir la cantidad de código */

    public static void main(String[] args){
        System.out.println(sumar(4, 5));
        System.out.println(sumar(4.5, 2.3));
        System.out.println(sumar(4, 8, 21));
        System.out.println(sumar("5", "10"));
        System.out.println(sumar(5.4, 2.9, 3, 6, 9.10));
    }
}
