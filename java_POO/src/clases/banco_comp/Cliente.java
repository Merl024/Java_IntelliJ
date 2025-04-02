package clases.banco_comp;

public class Cliente {

    private int id;
    private String nombre;

    public Cliente(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }

    public int getId(){ return id; }

    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    @Override
    public String toString() {
        return "Id: "+id+"\nNombre: "+nombre;
    }
}
