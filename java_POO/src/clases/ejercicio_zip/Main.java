package clases.ejercicio_zip;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear estudiantes
        Estudiante estudiante1 = new Estudiante(15, "Ana", "Principiante");
        Estudiante estudiante2 = new Estudiante(17, "Luis", "Intermedio");

        // Crear instructores
        Instructor instructor1 = new Instructor("Carlos", "Ballet");
        Instructor instructor2 = new Instructor("Maria", "Salsa");

        // Crear clases
        Clase clase1 = new Clase("Ballet Inicial", instructor1, "Lunes 16:00");
        Clase clase2 = new Clase("Salsa Avanzada", instructor2, "Miércoles 18:00");

        // Crear academia y agregar clases
        Academia academia = new Academia("Academia de Danza Prima");
        academia.agregarClase(clase1);
        academia.agregarClase(clase2);

        // Mostrar información
        System.out.println(estudiante1);
        System.out.println(estudiante2);
        System.out.println(instructor1);
        System.out.println(instructor2);
        System.out.println(clase1);
        System.out.println(clase2);
        System.out.println(academia);
    }
}
