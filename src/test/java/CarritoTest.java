import static org.junit.Assert.assertEquals;

import org.example.*;
import org.junit.Test;

public class CarritoTest {

    @Test
    public void testDescuentoFijo() {
        Carrito carrito = new Carrito();
        Producto producto1 = new Producto("Producto 1", 10, 3);
        ItemCarrito item1 = new ItemCarrito(producto1, 3);
        Producto producto2 = new Producto("Producto 2", 5, 2);
        ItemCarrito item2 = new ItemCarrito(producto2, 2);
        carrito.addItem(item1);
        carrito.addItem(item2);

        Descuento descuento = new DescuentoFijo(10);
        carrito.setDescuento(descuento);

        float precioTotal = carrito.precio();
        assertEquals(26, precioTotal, 0);
    }

    @Test
    public void testDescuentoPorcentaje() {
        Carrito carrito = new Carrito();
        Producto producto1 = new Producto("Producto 1", 10, 3);
        ItemCarrito item1 = new ItemCarrito(producto1, 3);
        Producto producto2 = new Producto("Producto 2", 5, 2);
        ItemCarrito item2 = new ItemCarrito(producto2, 2);
        carrito.addItem(item1);
        carrito.addItem(item2);

        Descuento descuento = new DescuentoPorcentaje(20);
        carrito.setDescuento(descuento);

        float precioTotal = carrito.precio();
        assertEquals(20, precioTotal, 0);
    }

    @Test
    public void testDescuentoPorcentajeConTope() {
        Carrito carrito = new Carrito();
        Producto producto1 = new Producto("Producto 1", 10, 3);
        ItemCarrito item1 = new ItemCarrito(producto1, 3);
        Producto producto2 = new Producto("Producto 2", 5, 2);
        ItemCarrito item2 = new ItemCarrito(producto2, 2);
        carrito.addItem(item1);
        carrito.addItem(item2);

        Descuento descuento = new DescuentoPorcentajeConTope(50, 10);
        carrito.setDescuento(descuento);

        float precioTotal = carrito.precio();
        assertEquals(10, precioTotal, 0);
    }
}
