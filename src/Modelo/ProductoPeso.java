package Modelo;

public class ProductoPeso extends Producto implements IPrecio{
    private int peso;

    public ProductoPeso(int peso,String cod, String nombre, int precio, String categoria) {
        super(cod, nombre, precio, categoria);
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public int getCostoTotal() {
        return getPrecio() * getPeso();
    }
}
