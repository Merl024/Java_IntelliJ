package clases.semana8.Biblioteca;

public class Revista extends Documento {
    int volumen;
    int numero;

    public Revista(String titulo, String autor, int fecha, String editorial, int volumen, int numero) {
        super(titulo, autor, fecha, editorial);
        this.volumen = volumen;
        this.numero = numero;
    }
}

