package org.example;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Producto {

    private String nombre;
    private float precio;

    public Producto(String nombre, float precio, int cantidad){
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio(){
        return precio;
    }

}