package clases.semana7.estatico;

import static java.lang.Math.sqrt;
import static java.lang.Math.PI;

// El enum tiene metodos, en cambio el diccionario tiene diferentes metodos que podamos necesitar

public class Main {
    public static void main(String[] args) {
        Estudiante melisa = new Estudiante("Rivas", "Melisa", Carrera.ISND);
        System.out.println("El carnet de Melisa es: " + melisa.getCarnet() );
        System.out.println("La carrera de Melisa es " + melisa.getCarrera().nombre + " cuyas iniciales son " + melisa.getCarrera());

        Estudiante rocio = new Estudiante("Calderon","Rocio", Carrera.LCJ);
//        System.out.println("El carnet de Rocio es: " + rocio.getCarnet()    );

        Carrera carreraMelisa = melisa.getCarrera();
        switch (carreraMelisa){
            case ISND -> {
                System.out.println("Inscriba Base de Datos I");
            }
            case LEN -> {
                System.out.println("Inscriba Algebra Lineal");
            }
        }

        System.out.println("");
        for (Carrera c : Carrera.values()){
            System.out.println("La carrera de " + c.nombre + " fue fundada " + c.anio);
        }

        System.out.println("\n###### Ejercicio 2 ######");
        double raizDeCinco= sqrt(5);

        // Ejemplos sin instanciar las clases circulo y cuadrado
        System.out.println(raizDeCinco);System.out.println(PI);
        System.out.println("El area de un circulo con radio de 3 es:" + Circulo.calcularArea(3));
        System.out.println("El area de un cuadrado es: " + Cuadrado.calcularArea(5.6));

        // Se accede directamente a la clase y se ocupa sus metodos

    }
}
