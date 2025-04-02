package clases.banco;

public class Cliente1 {
    private String nombre;
    private String apellido;
    private String DUI;

    // Creacion del constructor
    public Cliente1(String nombre, String apellido, String DUI) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DUI = DUI;
    }

    // Creacion de los setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDUI() {
        return DUI;
    }

    public void setDUI(String DUI) {
        this.DUI = DUI;
    }

    @Override
    public String toString() {
        return "Cliente1{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", DUI='" + DUI + '\'' +
                '}';
    }

}
