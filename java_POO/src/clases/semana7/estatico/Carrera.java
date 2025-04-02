package clases.semana7.estatico;

public enum Carrera {
    ISND ("Ingenieria en Software y Negocios Digitales", 2023),
    LEN ("Licenciatura en Economia", 1994),
    IDN ("Ingenieria en Negocios", 2009),
    LCJ("Licenciatura en Ciencias Juridicas", 2003);

    // Si no se pone algo antes de final, asume que es protected, por lo que no se podria acceder
    /* Se pone final porque no quiero que se pueda modificar, y cabe en el contexto del codigo,
    * y cabe dentro del contexto del codigo porque los nombres de las carreras y los años no se puede
    * cambiar bajo ninguna circunstancia */
    public final String nombre; // No se asigna un valor porque el constructo garantiza
                                // que los final siempre se instancien
    public final int anio;

    Carrera(String nombre, int anio) {
        this.nombre = nombre;
        this.anio = anio;
    }
}
