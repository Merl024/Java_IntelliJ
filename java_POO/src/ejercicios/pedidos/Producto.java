package ejercicios.pedidos;

public class Producto {
    private String codigo;
    private String descripcion;
    private double precio;

    public Producto(String descripcion) {
        this.descripcion = descripcion;
    }

    // Getters
    public String getCodigo() { return codigo; }
    public String getDescripcion() { return descripcion; }
    public double getPrecio() { return precio; }

    // Setters
    public void setCodigo(String codigo) { this.codigo = codigo; }
    public void setPrecio(double precio) { this.precio = precio; }
}