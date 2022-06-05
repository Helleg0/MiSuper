package Modelo;

public class ProductoUnitario extends Producto implements IPrecio {

    private int cantidad;
    private int stock;

    public ProductoUnitario(int cantidad, int stock, String cod, String nombre, int precio, String categoria) {
        super(cod, nombre, precio, categoria);
        this.cantidad = cantidad;
        this.stock = stock;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public int getCostoTotal() {
        return getCantidad() * getPrecio();
    }

}
