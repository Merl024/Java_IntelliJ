package clases.semana8.calorias;

public class Main {
    public static void main(String[] args) {
        Calculable bebida1 = new Gaseosa(45, 0.3, "dulce", "Coca-Cola");
        System.out.println(bebida1.calcularCalorias());
    }

}
