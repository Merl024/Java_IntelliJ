package ejercicios.clasesAbstractas;

public class Circulo extends Figura {
    private double radio;

    public Circulo(double x, double y, double radio) {
        super(x, y);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        double resultado = Math.PI * Math.pow(radio, 2) ;
        return resultado;
    }
}
