package clases.circulo;

public class Main {
    public static void main(String[] args) {
        // Con constructor 1
//        Circulo c1 = new Circulo();
//        System.out.println("El circulo tiene una area de " + c1.calcularArea());

        // Con constructor 2
//        Circulo c2 = new Circulo(3.0);
//        System.out.println("El circulo tiene una area de " + c2.calcularArea());

        // Con constructor 3
        Circulo c3 = new Circulo(3.0, "Rojo");
        // System.out.println("El circulo tiene una area de " + c3.calcularArea() + " y su color es " + c3.color); // nos dara error
    }
}
