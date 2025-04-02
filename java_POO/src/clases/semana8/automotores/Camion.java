package clases.semana8.automotores;

public class Camion extends Vehiculo{
    double capacidadCarga;

    public Camion(String cumbustible, String fabricante, double peso, int cilindrada, double capacidadCarga) {
        super(cumbustible, fabricante, peso, cilindrada);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public void llenarCombustible(int galones) {
        System.out.println("Tanque lleno con"+ galones+
                "galones de combustible");

    }
}
