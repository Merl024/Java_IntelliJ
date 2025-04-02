package ejercicios.Interfaces.prueba;

public class Main {
    public static void main(String[] args) {
        FigurasGeometricas triangulo = new Triangulo(15, 10);
        System.out.println(triangulo.calcularArea());
    }
}
