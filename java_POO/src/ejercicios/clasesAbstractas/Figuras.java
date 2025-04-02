package ejercicios.clasesAbstractas;

public class Figuras {
    public static void main(String[] args) {
        Figura cuadraro1 = new Cuadrado(4.5, 6.7, 5);
        Figura circulo1 = new Circulo(4.5, 6.7, 2.3);
        System.out.println(cuadraro1.calcularArea());
        System.out.println(circulo1.calcularArea());
    }
}
