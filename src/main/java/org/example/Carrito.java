package org.example;

import java.util.ArrayList;

public class Carrito {
    private ArrayList<ItemCarrito> items;
    private Descuento descuento;

    public Carrito() {
        items = new ArrayList<ItemCarrito>();
        descuento = null;
    }

    public void addItem(ItemCarrito item) {
        items.add(item);
    }

    public void setDescuento(Descuento descuento) {
        this.descuento = descuento;
    }

    public float precio() {
        float precioTotal = 0;
        for (ItemCarrito item : items) {
            precioTotal += item.getProducto().getPrecio() * item.getCantidad();
        }
        if (descuento != null) {
            precioTotal -= descuento.calcularDescuento(precioTotal);
        }
        return precioTotal;
    }
}
