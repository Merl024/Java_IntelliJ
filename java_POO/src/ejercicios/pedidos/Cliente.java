package ejercicios.pedidos;

public class Cliente {
    private String rut;
    private String nombre;
    private String direccion;

    public Cliente(String rut, String nombre, String direccion) {
        this.rut = rut;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    // Getters
    public String getRut() { return rut; }
    public String getNombre() { return nombre; }
    public String getDireccion() { return direccion; }
}