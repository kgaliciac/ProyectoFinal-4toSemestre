 
package Modelo;

import Modelo.SeccionProducto;

public class Producto {
    
    private int idProducto;
    private static int sigIdProducto = 2000;
    private SeccionProducto seccionProducto;
    private String producto;
    private double precio;
    
    public static int sigIdProducto(){
        return sigIdProducto++;
    }
    
    public SeccionProducto getSeccionProducto(){
        return seccionProducto;
    }
    
    public void setSeccionProducto(SeccionProducto seccionProducto){
        this.seccionProducto = seccionProducto;
    }
    
    public Producto(){
        idProducto = Producto.sigIdProducto();
    }
    
    public Producto(SeccionProducto seccionProducto, String producto, double precio){
        this();
        this.seccionProducto = seccionProducto;
        this.producto = producto;
        this.precio = precio;
    }
    
    public int getIdProducto(){
        return idProducto;
    }
    
    public void setIdProducto(int idProducto){
        this.idProducto = idProducto;
    }
    
    public String getProducto(){
        return producto;
    }
    
    public void setProducto(String producto){
        this.producto = producto;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public void setPrecio(double precio){
        this.precio = precio;
    }
    
    @Override
    public String toString(){
        return
                "[Producto] " +
                "Id= " +idProducto+
                " ,Seccion= " +seccionProducto+
                " ,Producto= " +producto+
                " ,Precio= " +precio;
    }
    
    
}