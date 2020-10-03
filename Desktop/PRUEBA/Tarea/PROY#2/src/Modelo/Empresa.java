
package Modelo;

import Modelo.Cliente;

public class Empresa extends Cliente{
    
    private String contacto;
    private int descuento;
    
    public Empresa(String nombre, String apellido, String telefono, String direccion, String contacto, int descuento){
        super(nombre, apellido, telefono, direccion);
        this.contacto = contacto;
        this.descuento = descuento;
    }
    
    public String getContacto(){
        return contacto;
    }
    
    public void setContacto(String contacto){
        this.contacto = contacto;
    }
    
    public int getDescuento(){
        return descuento;
    }
    
    public void setDescuento(int descuento){
        this.descuento = descuento;
    }
    
    @Override
    public String toString(){
        return
                "[Empresa] " +super.toString()+
                " ,Contacto= " +contacto+
                " ,Descuento= " +descuento;
    }
}