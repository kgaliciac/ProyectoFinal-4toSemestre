
package Modelo;

import Modelo.Cliente;
import java.util.Date;

public class Orden {
    
    private int idOrden;
    private Cliente cliente;
    private ItemOrden item1;
    private ItemOrden item2;
    private Date fechaOrden;
    private double precioEnvio;
    private double total;
    private String tipoEnvio;
    private String estado;
    private static int sigIdOrden = 3000;
    private int diasEnvio;
    
    public static int sigIdOrden(){
        return sigIdOrden++;
    }
    
    public int getIdOrden(){
        return idOrden;
    }
    
    public void setIdOrden(int idOrden){
        this.idOrden = idOrden;
    }
    
    public Cliente getCliente(){
        return cliente;
    }
    
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    
    public Date getFechaOrden(){
        return fechaOrden;
    }
    
    public void setFechaOrden(Date fechaOrden){
        this.fechaOrden = fechaOrden;
    }
    
    public double getPrecioEnvio(){
        return precioEnvio;
    }
    
    public void setPrecioEnvio(double precioEnvio){
        this.precioEnvio = precioEnvio;
    }
    
    public double getTotal(){
        return total;
    }
    
    public void setTotal(double total){
        this.total = total;
    }
    
    public String getTipoEnvio(){
        return tipoEnvio;
    }
    
    public String getEstado(){
        return estado;
    }
    
    public void setEstado(String estado){
        this.estado = estado;
    }
    
    public int getDiasEnvio(int diasEnvio){
        return diasEnvio;
    }
    
    public void setDiasEnvio(int diasEnvio){
        this.diasEnvio = diasEnvio;
    }
    
    public void setTipoEnvio(String tipoEnvio){
        this.tipoEnvio = tipoEnvio;
    }
    
    public Orden(){
        idOrden = Orden.sigIdOrden();
        total = 0.0;
        fechaOrden = new Date();
    }
    
    public Orden(Date fechaOrden){
        this();
        this.fechaOrden = fechaOrden;
    }
    
    public Orden(Cliente cliente, Date fechaOrden){
        this(fechaOrden);
        this.cliente = cliente;
        //item1 = DataSistema.item.get(0);
        //item2 = DataSistema.item.get(1);
    }
    
    public double getTotalOrden(){
        return item1.getTotalItem() + item2.getTotalItem();
    }
}