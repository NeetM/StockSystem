
package com.mycompany.ok;

import javax.swing.JOptionPane;


public class Producto {
    
    String nombreProducto;
    int stock;
    double precioVenta;
    
    public Producto(String nombre, int stock, double precio){
        this.nombreProducto = nombre;
        this.stock = stock;
        this.precioVenta = precio;
    }
    
    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
    
    public void mostrar(){
        JOptionPane.showMessageDialog(null,
                "Nombre: " + this.nombreProducto 
                + "\nStock: " + this.stock 
                + "\nPrecio: " + this.precioVenta);
    }
    
}
