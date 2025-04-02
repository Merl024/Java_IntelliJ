package clases.ejercicio.automovil;

public class Main {
    public static void main(String[] args) {
        Automovil desconocido = new Automovil();
        System.out.println(desconocido);

        System.out.println();
        Automovil ferrari = new Automovil("Honda", "Civic", 2.0);
        System.out.println(ferrari);
        System.out.println("Tiene " + ferrari.calculoCaballosPotencia() + " caballos de potencia");
    }
}
