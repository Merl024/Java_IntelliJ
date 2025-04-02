package ejercicios.clasesAbstractas;

import javax.print.attribute.standard.PresentationDirection;

public class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(double x, double y, double lado) {
        super(x, y);
        this.lado = lado;
    }

    @Override // overriding o sobreescritura
    public double calcularArea() {
        double resultado = lado * lado;
        return resultado;
    }
}
