package clases.semana8.universidad;

public class Docente extends Persona{
    int idEmpleado;
    String facultad;

    public Docente(String nombre, int ID, String email, int idEmpleado, String facultad) {
        super(nombre, ID, email);// super permit invocar el constructor de la clase padre
        this.idEmpleado = idEmpleado;
        this.facultad = facultad;
    }
}
