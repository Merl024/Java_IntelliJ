package clases.semana10.ExcepcionesPersonalizadas;

import java.util.HashMap;
import java.util.Scanner;

/* enere una aplicación de login, donde se pida al usuario crear su login y contraseña.
• Luego, esta se valida respecto a la longitud mínima de cada elemento (6 para usuario y 8 para contraseña).
 • Si funciona bien, imprimir un mensaje afirmativo.
 • Luego pedir al usuario ingresar su usuario y contraseña para login.
 • Cree una clase de excepción InvalidCredentialsException, para manejar el caso donde el usuario no ingresa
correctamente su usuario y/o contraseña, así como para manejar usuario o contraseña sin la longitud
mínima. */

public class Login implements Validaciones{
    public static void main(String[] args) {
        HashMap<String, String> usuarios = new HashMap<>();
        Scanner s = new Scanner(System.in);

        usuarios.put("Melude", "meloo0101");
        usuarios.put("Sonali", "Alissona");
        System.out.println(usuarios);

        try {
            // Creacion de usuario
            System.out.println("Escriba su nombre de usuario (Caracteres mayores a 6)");
            String nombreUsuario = s.nextLine();
            System.out.println("Escriba su nombre de usuario (Caracteres mayores a 8)");
            String contra = s.nextLine();
            if (nombreUsuario.length() >= minUsuario || contra.length() >= minContra ){
                System.out.println("El usuario ha sido creado con exito");
                usuarios.put(nombreUsuario, contra);
            } else {

                System.out.println("El nombre de usuario o la contraseña no cumplen con la longitud deseada");
            }

            // Ingresar valores al login
            System.out.println("Ingrese su nombre de usuario");
            String inputUsuario = s.nextLine();
            System.out.println("Ingrese su contraseña");
            String inputContra = s.nextLine();

            login(usuarios, inputUsuario, inputContra);
        } catch (InvalidCredentialsException e){
            System.err.println("Error: "+ e.getMessage());
        }
    }

    public static void login(HashMap<String, String> usuarios , String usuario, String contra) throws InvalidCredentialsException{
        if(!usuarios.containsKey(usuario)){
            throw new InvalidCredentialsException("Usuario no encontrado");
        }
        if(!usuarios.get(usuario).equals(contra)){
            throw new InvalidCredentialsException("Contraseña no valida");
        }
        System.out.println("Inicio exitoso, bienvenido " + usuario);
    }

}
