package clases.semana8.Biblioteca;

/* El extends quiere decir que se depende de Documento, y que utilizara los atrbutos de esta clase ademas
* de los de la clase propia.
* Documento es la clase padre, mientras que Libro es la hija
* ESTO ES UNA HERENCIA
*
* Si se quisiera como composicion seria
* public class Libro {
    private List<Pagina> paginas; // Relación de composición

    public Libro() {
        this.paginas = new ArrayList<>(); // Se crean las páginas dentro del libro
    }
}
*/
public class Libro extends Documento{
    String edicion;

    public Libro(String titulo, String autor, int fecha, String editorial, String edicion) {
        super(titulo, autor, fecha, editorial); // Esto ayuda a indicar que esos atributos se mantienen
        this.edicion = edicion;
    }
}
