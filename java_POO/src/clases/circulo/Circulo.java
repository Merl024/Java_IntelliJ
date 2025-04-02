package clases.circulo;

public class Circulo {
    // Estos atributos no pueden ser accedidos fuera de la clase o archivo en otras palabras.
    private double radio;
    private String color;

    public double calcularArea() {
        return radio*radio*Math.PI;
    }

    // Constructor 1
//    public Circulo(){
//        radio = 5.0;
//        color = "rojo";
//    }

    //Constructor 2
//    public Circulo(double r){
//        radio = r;
//        color = "rojo";
//    }

    public Circulo(double radio, String color){
        // Hacer esto NO es buena practica
//        radio = r;
//        color = c;

        /* Si en algun caso hacemos esto:
        * radio = color;
//        color = color
            Java no entendera si se refiere al argumento o al atributo. por ello se usa el this en el atributo
* */
        this.color = color;
        this.radio = radio;
    }
}
