package clases.semana8.calorias;

public class Gaseosa extends Bebida{
    String sabor;
    String marca;

    public Gaseosa(int gramosAzucar, double volumenLitro, String sabor, String marca) {
        super(gramosAzucar, volumenLitro);
        this.sabor = sabor;
        this.marca = marca;
    }

    @Override
    public double calcularCalorias() {// heredado de bebida y obligado a implemtarla
        return this.GramosAzucar*4.5;
    }
}
