package clases.semana10.ExcepcionesPersonalizadas;

public class InvalidCredentialsException extends Exception{
    public InvalidCredentialsException(String message) {
        super(message);
    }
}
