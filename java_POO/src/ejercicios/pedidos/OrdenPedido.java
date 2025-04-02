package ejercicios.pedidos;
import java.util.Date;

public class OrdenPedido {
    private static int ultimoCorrelativo = 0;

    private final int correlativo;
    private final String descripcion;
    private Date fecha;
    private Cliente cliente;
    private final Producto[] productos;
    private int cantidadProductos;

    public OrdenPedido(String descripcion) {
        this.correlativo = ++ultimoCorrelativo;
        this.descripcion = descripcion;
        this.productos = new Producto[4];
        this.cantidadProductos = 0;
    }

    // Getters
    public int getCorrelativo() { return correlativo; }
    public String getDescripcion() { return descripcion; }
    public Date getFecha() { return fecha; }
    public Cliente getCliente() { return cliente; }
    public Producto[] getProductos() { return productos; }

    // Setters
    public void setFecha(Date fecha) { this.fecha = fecha; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    // Método para agregar productos
    public void agregarProducto(Producto producto) {
        if (cantidadProductos < 4) {
            productos[cantidadProductos++] = producto;
        } else {
            System.out.println("No se pueden agregar más productos (límite: 4)");
        }
    }

    // Método para calcular el total
    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < cantidadProductos; i++) {
            if (productos[i] != null) {
                total += productos[i].getPrecio();
            }
        }
        return total;
    }
}
