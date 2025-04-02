package clases.semana8.universidad;

public class Universidad {
    public static void main(String[] args) {
        Estudiante pedro = new Estudiante("Pedro",123457,"Sanchez","pedro@esen.edu.sv","ISND",2025009);
        System.out.println(pedro.getNombre());
        DocenteTiempoCompleto Juan= new DocenteTiempoCompleto("Juan",124367,"20203@ese.edu.sv",101010,"Economia y negocio", 17373.4);
        System.out.println(Juan.salario);
    }

}
