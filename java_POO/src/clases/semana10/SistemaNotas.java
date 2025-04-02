package clases.semana10;

public class SistemaNotas {

    /* La diferencia entre excepciones y errores */
    /* Es que las excepciones son situaciones que el programa puede controlar o manejara
    * mientras que los errores es cuando no se sabe que tipo de error tiene u no se deberia intentar manejar
    *
    *       "Si es un error que podría ocurrir incluso con código correcto, usa checked.
    *        Si es un error por código mal escrito, usa unchecked."
    *
    * */
    
    public static boolean validar(double nota){
        try{
            if(nota < 0 || nota > 10){
                throw new IllegalArgumentException("Valor no valido");
            }
            return true;
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static void main(String[] args) {
        validar(-2);
        double notaJose = 12 ;
        if(validar(notaJose)){
            System.out.println(notaJose);
        }
    }
}
