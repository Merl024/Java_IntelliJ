package clases.semana8.Biblioteca;

public class Bibloteca {
    public static void main(String[] args) {
        Documento nuevoLibro = new Documento("Los 7 maridos de Evelyn Hugo", "Jessica Perkins", 2019, "El Salvador");
        System.out.println(nuevoLibro.getTitulo());
    }
}
