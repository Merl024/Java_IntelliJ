package clases.semana7.estatico;
import static java.lang.Math.PI;
import static java.lang.Math.pow;


public class Circulo {
    double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }


    //    public  static double calcularArea(double radio){
//        return Math.pow(radio,2)*Math.PI;
//    }

//    static  double pi= PI;
    public  static double calcularArea(double radio){
        //double pi= Math.PI
        return pow(radio,2)* PI;
    }


    public static double calcularCircuferencia(double radio){
        return 2*PI;
    }
}
