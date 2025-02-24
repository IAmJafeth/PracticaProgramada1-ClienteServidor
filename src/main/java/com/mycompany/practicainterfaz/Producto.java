package com.mycompany.practicainterfaz;

public class Producto {
 
    private int codigo;
    private String nombre;
    private double precio;
    private boolean disponibilidad;
    private int cantidadInv;
    private Categoria categoria; 
 
    public Producto(int codigo, String nombre, double precio, boolean disponibilidad, int cantidadInv, Categoria categoria) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.disponibilidad = disponibilidad;
        this.cantidadInv = cantidadInv;
        this.categoria = categoria;
    }
 
    public int getCodigo() {
        return codigo;
    }
 
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
 
    public String getNombre() {
        return nombre;
    }
 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    public double getPrecio() {
        return precio;
    }
 
    public void setPrecio(double precio) {
        this.precio = precio;
    }
 
    public boolean isDisponibilidad() {
        return disponibilidad;
    }
 
    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
 
    public int getCantidadInv() {
        return cantidadInv;
    }
 
    public void setCantidadInv(int cantidadInv) {
        this.cantidadInv = cantidadInv;
    }
    
    public Categoria getCategoria() {
        return categoria;
    }
 
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
 
}
