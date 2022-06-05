package Modelo;

public class Carrito extends ProductoCompuesto{
    private Cliente cliente;

    public Carrito() {
        super();
        
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    @Override
    public void agregarProducto(IPrecio p){
        super.agregarProducto(p);
    }
    
    @Override
    public void eliminarProducto(IPrecio p){
        super.eliminarProducto(p);
    }
    
    public void establecerCantidad(IPrecio p, int cantidad){
        if (p instanceof ProductoUnitario){
            ((ProductoUnitario)super.getProductos().get(super.getProductos().indexOf(p))).setCantidad(cantidad);
        }
    }
    
    public void establecerPeso(IPrecio p, int peso){
        if (p instanceof ProductoPeso){
            ((ProductoPeso)super.getProductos().get(super.getProductos().indexOf(p))).setPeso(peso);
        }
    }
    
}
