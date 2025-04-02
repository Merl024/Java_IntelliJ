package ejercicios.clasesAbstractas;

public abstract class Figura {
    private double x;
    private  double y;

    // El constructor del abstract lo va a acceder solo sus hijas
    public Figura(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Clase abstracta, porque cada figura calcula su area de diferente area, pero ambas tienen que calcularlo
    // Sin decirle como lo va a calcular, solo que lo tiene que hacer
    public abstract double calcularArea();

}
