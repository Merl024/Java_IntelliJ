package clases.ejercicio_zip;
public class Clase {
    private String nombreClase;
    private Instructor instructor;
    private String horario;

    // Constructor
    public Clase(String nombreClase, Instructor instructor, String horario) {
        this.nombreClase = nombreClase;
        this.instructor = instructor;
        this.horario = horario;
    }

    // Getters y Setters
    public String getNombreClase() {
        return nombreClase;
    }

    public void setNombreClase(String nombreClase) {
        this.nombreClase = nombreClase;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Clase{" +
                "nombreClase='" + nombreClase + '\'' +
                ", instructor=" + instructor +
                ", horario='" + horario + '\'' +
                '}';
    }
}
