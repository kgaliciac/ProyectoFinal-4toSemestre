
package Modelo;

public class Cliente {
    
    private int idCliente;
    private static int sigIdCliente = 1;
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;
    
    public static int sigIdCliente(){
        return sigIdCliente++;
    }
    
    public Cliente(){
        idCliente = Cliente.sigIdCliente();
    }
    
    public Cliente(String nombre, String apellido, String telefono, String direccion){
        this();
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    
    public int getIdCliente(){
        return idCliente;
    }
    
    public void setIdCliente(int idCliente){
        this.idCliente = idCliente;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public String getTelefono(){
        return telefono;
    }
    
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    
    public String getDireccion(){
        return direccion;
    }
    
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    
    @Override
    public String toString(){
        return
                "[Cliente] " +
                "Id= " +idCliente+
                " ,Nombre= " +nombre+
                " ,Apellido= " +apellido+
                " ,Telefono= " +telefono+
                " ,Direccion= " +direccion;
    }
}