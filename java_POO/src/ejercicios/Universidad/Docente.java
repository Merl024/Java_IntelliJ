package ejercicios.Universidad;

import java.util.Date;

public class Docente extends Empleado{
    private String facultad;
    private String especialidad;

    public Docente(String nombre, int id, String email, int idEmpleado, Date fechaIngreso, double salario, String facultad, String especialidad) {
        super(nombre, id, email, idEmpleado, fechaIngreso, salario);
        this.facultad = facultad;
        this.especialidad = especialidad;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
