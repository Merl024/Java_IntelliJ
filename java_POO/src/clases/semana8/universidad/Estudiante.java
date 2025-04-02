package clases.semana8.universidad;

public class Estudiante extends Persona{
    int carner;
    String carrera;

    public Estudiante(String nombre, int ID, String email, String carrera, String isnd, int carner) {
        super(nombre, ID, email);
        this.carrera = carrera;
        this.carner = carner;
    }
}
