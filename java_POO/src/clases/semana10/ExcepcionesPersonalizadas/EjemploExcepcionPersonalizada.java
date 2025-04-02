package clases.semana10.ExcepcionesPersonalizadas;

public class EjemploExcepcionPersonalizada {
    public static void validarEdad(int edad) throws ExcepcionRango {
        if (edad < 0 || edad > 100) {
            throw new ExcepcionRango("Edad invalida: " + edad);
        }
    }
    public static void main(String[] args) {
        try{
            validarEdad(150);
            validarEdad(19);
        }catch (ExcepcionRango e){
            System.out.println(e.getMessage());
        }
    }
}
