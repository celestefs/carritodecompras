package org.example;

public class DescuentoPorcentajeConTope extends Descuento{
    private float porcentaje;
    private float tope;

    public DescuentoPorcentajeConTope(float porcentaje, float tope) {
        this.porcentaje = porcentaje;
        this.tope = tope;
    }
    @Override
    public float calcularDescuento(float precioTotal) {
        float descuento = precioTotal * porcentaje / 100;
        if (descuento > tope) {
            descuento = tope;
        }
        return descuento;
    }
}
