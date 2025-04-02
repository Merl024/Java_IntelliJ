package clases.semana8.universidad;

public class Persona {
    private String nombre;
    private int ID;
    private String email;

    public Persona(String nombre, int ID, String email) {
        this.nombre = nombre;
        this.ID = ID;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public int getID() {
        return ID;
    }

    public String getEmail() {
        return email;
    }
}

