package clases.semana8.automotores;

public class Carro extends Vehiculo implements Adatable{
    int pasajeros;
    String tipo;

    public Carro(String cumbustible, String fabricante, double peso, int cilindrada, int pasajeros, String tipo) {
        super(cumbustible, fabricante, peso, cilindrada);
        this.pasajeros = pasajeros;
        this.tipo = tipo;
    }

    @Override
    public void llenarCombustible(int galones) {
        System.out.println("Se han agregado" +" "+ galones +" "+ "galones");
    }

    @Override
    public void llenarTanque(double litros) {
        System.out.println("Se agregaron"+" "+ litros+" "+ "de gas al tanque");
    }
}
