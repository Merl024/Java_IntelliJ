package ejercicios.pedidos;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear cliente
        Cliente cliente = new Cliente("12345678-9", "Juan Pérez", "Calle Falsa 123");

        // Crear productos
        Producto p1 = new Producto("Laptop");
        p1.setCodigo("LP001");
        p1.setPrecio(1200.0);

        Producto p2 = new Producto("Mouse");
        p2.setCodigo("MS002");
        p2.setPrecio(25.0);

        // Crear orden de pedido
        OrdenPedido orden = new OrdenPedido("Pedido de equipos de oficina");
        orden.setCliente(cliente);
        orden.setFecha(new Date());

        // Agregar productos
        orden.agregarProducto(p1);
        orden.agregarProducto(p2);

        // Calcular y mostrar total
        System.out.println("Total de la orden: $" + orden.calcularTotal());
    }
}
