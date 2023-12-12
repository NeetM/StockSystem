
package com.mycompany.ok;

import javax.swing.JOptionPane;


public class Boleta {
    
    String rutCliente;
    int totalVenta;
    
    public Boleta(String rut, int total){
        this.rutCliente = rut;
        this.totalVenta = total;
    }
    
    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public double getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(int totalVenta) {
        this.totalVenta = totalVenta;
    }
    
    public void mostrar(){
        JOptionPane.showMessageDialog(null, "Rut: " + this.rutCliente 
                + "\nTotal: " + this.totalVenta);
    }
}
