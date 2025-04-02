package clases.semana8.calorias;

public abstract class Bebida implements Calculable {
int GramosAzucar;
double VolumenLitro;

    public Bebida(int gramosAzucar, double volumenLitro) {
        GramosAzucar = gramosAzucar;
        VolumenLitro = volumenLitro;
    }
}
