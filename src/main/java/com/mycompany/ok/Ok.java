package com.mycompany.ok;

import javax.swing.JOptionPane;

public class Ok {

    public static void main(String[] args) {
        
        Boleta arrayBoleta[] = new Boleta[3];
        
        // llenar producto

            String n[] = {"Monitores","Gabinete","Ram"};
            int s[] = {40,30,80};
            double p[] = {99000,45000,25000};
            
            Producto arrayProducto[] = new Producto[n.length];

            for (int i = 0; i < arrayProducto.length; i++) {
                arrayProducto[i] = new Producto(n[i],s[i],p[i]);
            }
        
        //Menu
        
        do {
           int opc = Integer.parseInt(JOptionPane.showInputDialog("1.Crear Venta"
                   + "\n2.Consular stock de producto"
                   + "\n3.Consultar boleta por rut"
                   + "\n4.Total dinero recaudado"
                   + "\n5.Salir")
           );
           
            switch (opc) {
                case 1:
                    
                    for (int i = 0; i < arrayBoleta.length; i++) {
                        String r = JOptionPane.showInputDialog("Ingrese rut");
                        boolean correcto = true;
                        int opcM;
                        int tot = 0;
                        int cantidad;
                        
                        do {
                            
                            opcM = Integer.parseInt(JOptionPane.showInputDialog("Compra cliente: " + (i + 1)
                                    + "\n1.Monitor"
                                    + "\n2.Gabinete"
                                    + "\n3.Ram")
                                    + "\n4.Salir"
                            );
                            
                            switch (opcM) {
                                case 1:
                                    
                                    //Monitor
                                    cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad a comprar"));
                                    
                                    if (arrayProducto[0].stock >= cantidad) {        
                                        tot += arrayProducto[0].getPrecioVenta() * cantidad;
                                        arrayProducto[0].setStock(arrayProducto[0].getStock()-cantidad);  
                                    }else{
                                        JOptionPane.showMessageDialog(null, "no existe stock");
                                    }

                                    break;
                                case 2:
                                    
                                    //Gabinete        
                                    cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad a comprar"));
                                    
                                    if (arrayProducto[1].stock >= cantidad) {
                                        tot += arrayProducto[1].getPrecioVenta() * cantidad;
                                        arrayProducto[1].setStock(arrayProducto[1].getStock()-cantidad);
                                    }else{
                                        JOptionPane.showMessageDialog(null, "no existe stock");
                                    }
                                    
                                    break;
                                case 3:
                                    
                                    //Ram
                                    cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad a comprar"));
                                    
                                    if (arrayProducto[2].stock >= cantidad) {
                                        tot += arrayProducto[2].getPrecioVenta() * cantidad;
                                        arrayProducto[2].setStock(arrayProducto[2].getStock()-cantidad);
                                        
                                    }else{
                                        JOptionPane.showMessageDialog(null, "no existe stock");
                                    }
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Opcion no valida");
                                    correcto = false;
;
                            }
                            
                            

                        } while (opcM != 5);
                        
                        arrayBoleta[i] = new Boleta(r,tot);
                        
                    }
                    
                    
                    break;
                    
                case 2:
                    boolean correcto = true;

                    do {
                        
                        correcto = true;

                        int opcM = Integer.parseInt(JOptionPane.showInputDialog("Seleccione producto"
                            + "\n1.Monitor"
                            + "\n2.Gabinete"
                            + "\n3.Ram"
                            )
                        );

                        switch (opcM) {
                            
                            case 1:
                                arrayProducto[0].mostrar();
                                
                                break;

                            case 2:
                                arrayProducto[1].mostrar();

                                break;

                            case 3:
                                arrayProducto[2].mostrar();

                                break;
                            default:
                                
                                JOptionPane.showMessageDialog(null, "Opcion no valida");
                                correcto = false;
                        }
                        
                    } while (correcto == false);
                    
                    break;
                    
                case 3:
                    
                    String rut = JOptionPane.showInputDialog(null,"Ingrese rut");
                    
                    for (int i = 0; i < 3; i++) {
                        if (rut.equals(arrayBoleta[i].getRutCliente())) {
                            arrayBoleta[i].mostrar();
                        }
                    }

                    break;
                    
                    
                case 4:
                    double total = 0;
                    for (int i = 0; i < arrayBoleta.length; i++) {
                        total += arrayBoleta[i].getTotalVenta();
                    }
                    JOptionPane.showMessageDialog(null,"Dinero recaudado: " + total );
                    
                    break;
                    
                case 5:
                    
                    JOptionPane.showMessageDialog(null, "Adios");
                    System.exit(0);
                    
                    break;
                default:
                    
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
            }
            
        } while (true);
        
    }
    
}
