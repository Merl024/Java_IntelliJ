package clases.semana7.estatico;

public class Estudiante {
    private String nombre;
    private String apellido;
    private final int carnet;
    private Carrera carrera;

    // Variable que lleva la cuenta de cuantos estudiantes han sido creados
    private static int contador = 0;
    // Es privado porque no quiero que nadie tenga acceso a el,
    // pero se pone estatico para cuando se acceda a el no se tenga que instanciar

    public Estudiante(String apellido, String nombre, Carrera carrera) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.carrera = carrera;
        contador++;
        this.carnet = 20250000 + contador;
    }

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

    public int getCarnet() {
        return carnet;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "carrera='" + carrera + '\'' +
                ", carnet=" + carnet +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
