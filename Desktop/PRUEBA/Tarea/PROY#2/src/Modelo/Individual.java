
package Modelo;

import Modelo.Cliente;

public class Individual extends Cliente{
    
    private String dpi;
    
    public Individual(String nombre, String apellido, String telefono, String direccion, String dpi){
        super(nombre, apellido, telefono, direccion);
        this.dpi = dpi;
    }
    
    public String getDpi(){
        return dpi;
    }
    
    public void setDpi(String dpi){
        this.dpi = dpi;
    }
    
    @Override
    public String toString(){
        return 
                "[Individual] " + super.toString()+
                " ,DPI= " +dpi;
    }
}