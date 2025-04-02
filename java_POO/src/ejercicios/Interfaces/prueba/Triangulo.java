package ejercicios.Interfaces.prueba;

public class Triangulo implements FigurasGeometricas{
    private double altura;
    private double base;

    public Triangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double calcularArea() {
        return (altura * base)/2;
    }

    @Override
    public double calcularPerimetro() {
        return altura + base;
    }
}
