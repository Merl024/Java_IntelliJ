package ejercicios.Universidad;

public class Estudiante extends Persona{
    private int carnet;
    private Carrera carrera;

    public Estudiante(String nombre, String email, int carnet, Carrera carrera) {
        super(nombre, email);
        this.carnet = carnet;
        this.carrera = carrera;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "carnet=" + carnet +
                ", carrera=" + carrera +
                '}';
    }
}
