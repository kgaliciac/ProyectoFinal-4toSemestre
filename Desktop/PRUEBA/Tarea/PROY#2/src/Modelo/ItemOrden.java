
package Modelo;

import Modelo.Producto;

public class ItemOrden {
    
    private int noLinea;
    private int cantidad;
    private Producto producto;
    
    public ItemOrden(int noLinea, int cantidad, Producto producto){
        this.noLinea = noLinea;
        this.cantidad = cantidad;
        this.producto = producto;
    }
    
    public double getTotalItem(){
        return producto.getPrecio() * cantidad;
    }
    
    public int getCantidad(){
        return cantidad;
    }
    
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    
    public Producto getProducto(){
        return producto;
    }
    
    public void setProducto(Producto producto){
        this.producto = producto;
    }
    
    @Override
    public String toString(){
        return
                "[ItemOrden]" +
                " No.Linea= " +noLinea+
                " ,Cantidad= " +cantidad+
                " ,Producto= " +producto;
    }
}