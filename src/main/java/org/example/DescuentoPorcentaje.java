package org.example;

public class DescuentoPorcentaje extends Descuento {
    private float porcentaje;

    public DescuentoPorcentaje(float porcentaje) {
        this.porcentaje = porcentaje;
    }

    public float calcularDescuento(float precioTotal) {
        return precioTotal * porcentaje / 100;
    }
}
