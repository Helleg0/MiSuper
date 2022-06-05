package Modelo;

import java.util.ArrayList;
import java.util.Iterator;

public class ProductoCompuesto implements IPrecio{
     public ArrayList<IPrecio> productos;

    public ProductoCompuesto() {
        productos = new ArrayList<IPrecio>();
    }

    public void agregarProducto(IPrecio p) {
        productos.add(p);
    }

    public void eliminarProducto(IPrecio p) {
        productos.remove(p);
    }

    public ArrayList<IPrecio> getProductos() {
        return productos;
    }

    @Override
    public int getCostoTotal() {
        int total = 0;
        for (Iterator<IPrecio> it = productos.iterator(); it.hasNext();) {
            IPrecio precio = it.next();
            total += precio.getCostoTotal();
        }
        return total;
    }
    
    public int totalFactura (){
    ArrayList<Producto> listCast = new ArrayList<Producto>();
    
        for (int i = 0; i < productos.size(); i++) {
            IPrecio p = productos.get(i);
            listCast.add((Producto)p);
        }
        
        int totalFactura = 0;
        for (int i = 0; i < listCast.size(); i++) {
            totalFactura += listCast.get(i).getPrecio();
        }
        return totalFactura;
    }
}

