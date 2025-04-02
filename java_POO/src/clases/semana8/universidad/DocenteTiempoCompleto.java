package clases.semana8.universidad;

public class DocenteTiempoCompleto extends Docente{
    double salario;

    public DocenteTiempoCompleto(String nombre, int ID, String email, int idEmpleado, String facultad, double salario) {
        super(nombre, ID, email, idEmpleado, facultad);
        this.salario = salario;
    }
}
