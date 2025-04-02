package clases.semana8.automotores;

public class Automotores {
    public static void main(String[] args) {
        Carro miCarrito= new Carro("gasolina","toyota",1500.4,1600,5,"sedan");
        Camion miCamion= new Camion("diesel","Hyundai",2328.4,2400,80000);
        miCarrito.llenarCombustible(10);
        miCarrito.llenarTanque(25.2);
    }
}
