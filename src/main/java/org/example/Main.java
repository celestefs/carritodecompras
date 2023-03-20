package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("C:/Users/Celes/Desktop/items.txt"));
        Carrito carrito = new Carrito();

        String line;
        while ((line = reader.readLine()) != null) {
            String[] values = line.split("\\t");
            int cantidad = Integer.parseInt(values[0]);
            float precioUnitario = Float.parseFloat(values[1]);
            String nombreProducto = values[2];
            Producto producto = new Producto(nombreProducto, precioUnitario, cantidad);
            ItemCarrito item = new ItemCarrito(producto, cantidad);
            carrito.addItem(item);
        }

        Descuento descuento = new DescuentoFijo(126);
        carrito.setDescuento(descuento);


        System.out.println("Precio total: " + carrito.precio());
    }
}
