package clases.ejercicio_zip;

public class Estudiante {
    private int edad;
    private String nombre;
    private String nivel;

    public Estudiante(int edad, String nombre, String nivel) {
        this.edad = edad;
        this.nombre = nombre;
        this.nivel = nivel;
    }

    public Estudiante() {
        this.edad = 13;
        this.nombre = "Desconocido";
        this.nivel = "Desconocido";
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", nivel='" + nivel + '\'' +
                '}';
    }
}
