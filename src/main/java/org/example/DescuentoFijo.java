package org.example;

public class DescuentoFijo extends Descuento {
    private float monto;

    public DescuentoFijo(float monto) {
        this.monto = monto;
    }

    public float calcularDescuento(float precioTotal) {
        return monto;
    }
}
