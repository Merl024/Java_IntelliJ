package clases.semana8.prueba;

public class Producto {
    private String nombre;
    private String fabricante;
    private int codigo;
    private double precio;

    public Producto(String nombre, String fabricante, int codigo, double precio) {
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.codigo = codigo;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", codigo=" + codigo +
                ", precio=" + precio +
                '}';
    }
}
