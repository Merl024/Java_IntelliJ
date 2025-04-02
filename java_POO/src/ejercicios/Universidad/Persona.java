package ejercicios.Universidad;

public abstract class Persona {
    private String nombre;
    private final int id;
    private String email;
    private static int contador = 0;

    public Persona(String nombre, String email) {
        this.nombre = nombre;
        this.id = contador++;
        this.email = email;
    }

}
