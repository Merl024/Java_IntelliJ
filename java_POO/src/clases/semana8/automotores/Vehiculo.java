package clases.semana8.automotores;

public abstract class Vehiculo {
    String cumbustible;
    String Fabricante;
    double peso;
    int cilindrada;

    public Vehiculo(String cumbustible, String fabricante, double peso, int cilindrada) {
        this.cumbustible = cumbustible;
        Fabricante = fabricante;
        this.peso = peso;
        this.cilindrada = cilindrada;
    }

    public abstract void llenarCombustible(int galones);

    public void estacionar(){
        System.out.println("El vehiculo se ha estacionado");
    }
    String string1= "Hola mundo";
    String string2= "Java rocks!";
//    double iguales= string1.equals(string2);
}
