
package Modelo;

import Modelo.Individual;
import Modelo.Cliente;
import Modelo.SeccionProducto;
import Modelo.Producto;
import java.util.ArrayList;

public class DataSistema {    
    
    public static ArrayList<Cliente> clientes = new ArrayList<Cliente>(8){
        {
            add(new Individual("Walter", "Sanchez", "8763-9843", "Boca del Monte", "3454737430101"));
            add(new Individual("Sucelii", "Alcantara", "8430-8473", "Villa Canales", "9623737430101"));
            add(new Individual("Kathy", "Galicia", "0829-2454", "Villa Nueva", "0864737430101"));
            add(new Individual("Gabriel", "Hernandez", "9872-0482", "El Porvenir", "8309737430101"));
            
            add(new Empresa("Hermanos Coper", "C.A.", "9842-4325", "El Zapoye", "Jorge Castillo", 15));
            add(new Empresa("GoAuto", "S.A.", "9862-2353", "San Cristobal Verapaz", "Henry Cavill", 32));
            add(new Empresa("Autotec", "S.A.", "4325-2598", "Guatemala", "Ramon Valdez", 4));
            add(new Empresa("El Esfuerzo", "S.A.", "6342-5323", "Boulevard Los Próceres", "Santo Tomas", 12));
        }
    };
    
    public static ArrayList<Producto> productos = new ArrayList<Producto>(8){
        {
            add(new Producto(SeccionProducto.Bombillas,"Bombilla h7", 49.99));
            add(new Producto(SeccionProducto.Accesorios_Baterias,"Prueba de circuito", 60));
            add(new Producto(SeccionProducto.Plumillas,"Plumilla 18 Flat Blades", 75));
            add(new Producto(SeccionProducto.Fusibles,"Fisul AGC", 20));
            add(new Producto(SeccionProducto.Bujias,"Bujia Bosch u5ac", 15));
            add(new Producto(SeccionProducto.Tapones_Auto,"Tapón De Radiador", 59.99));
            add(new Producto(SeccionProducto.Alarmas,"Alarma Vehiculo", 380));
            add(new Producto(SeccionProducto.Lamparas,"Luz de tablero", 180));
        }
    };
    
    public static ArrayList<ItemOrden> item  = new ArrayList<ItemOrden>(8){
        {
            add(new ItemOrden(1, 2, DataSistema.productos.get(0)));
            add(new ItemOrden(1, 4, DataSistema.productos.get(1)));
            add(new ItemOrden(1, 1, DataSistema.productos.get(2)));
            add(new ItemOrden(1, 7, DataSistema.productos.get(3)));
            add(new ItemOrden(1, 8, DataSistema.productos.get(4)));
            add(new ItemOrden(1, 4, DataSistema.productos.get(5)));
            add(new ItemOrden(1, 6, DataSistema.productos.get(6)));
            add(new ItemOrden(1, 3, DataSistema.productos.get(4)));
        }
    };
}