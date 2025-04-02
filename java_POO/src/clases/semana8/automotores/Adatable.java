package clases.semana8.automotores;
/* Las interfaces es para la implementacion de metodos que tendra una instancia, ademas de que aqui
* puede ir las constantes - variables final. que se aplicaran para todas las posibles instancias
*
* Por ejemplo en el caso de vehiculo porbablemente haya sido mas conveniente una herencia porque en cierta
* forma tienen relacion. Sin embargo en las calorias conviene una interfaz porque comida y bebidas son dos cosas
* muy diferentes */
public interface Adatable {
    double capacidadTanque= 0;

    void llenarTanque(double litros);

    static void darEspecificaciones(){
        System.out.println("La capacidad tanque es"+" "+ capacidadTanque);
    }
}
