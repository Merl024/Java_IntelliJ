package ejercicios.Universidad;

import java.util.Date;

public class Empleado extends Persona{
    private int idEmpleado;
    private Date fechaIngreso;
    private double salario;

    public Empleado(String nombre, int id, String email, int idEmpleado, Date fechaIngreso, double salario) {
        super(nombre, email);
        this.idEmpleado = idEmpleado;
        this.fechaIngreso = fechaIngreso;
        this.salario = salario;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "idEmpleado=" + idEmpleado +
                ", fechaIngreso=" + fechaIngreso +
                ", salario=" + salario +
                '}';
    }
}
