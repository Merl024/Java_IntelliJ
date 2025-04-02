package clases.semana8.Biblioteca;

public class Documento {
    String titulo;
    String autor;
    int fecha;
    String editorial;

    // Constructo
    public Documento(String titulo, String autor, int fecha, String editorial) {
        this.titulo = titulo;
        this.autor = autor;
        this.fecha = fecha;
        this.editorial = editorial;
    }

    // setters y getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getFecha() {
        return fecha;
    }

    public String getEditorial() {
        return editorial;
    }
}
