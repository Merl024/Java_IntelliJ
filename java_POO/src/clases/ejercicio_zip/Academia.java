package clases.ejercicio_zip;

import java.util.ArrayList;
import java.util.List;

public class Academia {
    private String nombre;
    private ArrayList<Clase> clases;

    // Constructor
    public Academia(String nombre) {
        this.nombre = nombre;
        this.clases = new ArrayList<>();
    }

    // Método para agregar una clase
    public void agregarClase(Clase clase) {
        clases.add(clase);
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Clase> getClases() {
        return clases;
    }

    @Override
    public String toString() {
        return "Academia{" +
                "nombre='" + nombre + '\'' +
                ", clases=" + clases +
                '}';
    }
}
