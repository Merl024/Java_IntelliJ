package clases.ejercicio.automovil;
/*
• Genere una clase Automovil con tres atributos privados: fabricante, modelo, cilindrada.
• Genere un constructor para poder instanciar dicha clase, que tome argumentos para los tres atributos
mencionados, y un constructor default, en caso de que el usario no proporcione argumentos.
• Genere métodos getter y setter para fijar y acceder a los atributos.
 Genere un método para obtener los HP (caballos de potencia) del automóvil, a partir de la fórmula conocida
Caballos de potencia = 0.08 x Nº de cilindros (cilindrada / nº de cilindros) elevado a 0.6
 Suponga que el vehículo tiene 4 cilindros.
 Genere también el método toString() para documentar la clase.

*/
public class Automovil {
    private String fabricante;
    private String modelo;
    private double cilindrada;

    // Constructor con atributos
    public Automovil(String fabricante, String modelo, double cilindrada) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
    }

    public Automovil() {
        this.fabricante = "Desconocido";
        this.modelo = "Desconocido";
        this.cilindrada = 0.0;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double calculoCaballosPotencia(){
        // Caballos de potencia = 0.08 x Nº de cilindros (cilindrada / nº de cilindros) elevado a 0.6
        return 0.08 * 4 * Math.pow((cilindrada / 4),(0.6));
    }

    public String toString(){
        return "Automovil{ " +
                "\nfabricante = " + fabricante +
                "\nmodelo = " + modelo +
                "\ncilindrada = " + cilindrada +
                "}";
    }

}
