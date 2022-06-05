package Modelo;

public class Producto{
    private String cod;
    private String nombre;
    private int precio;
    private String categoria;

    public Producto(String cod, String nombre, int precio, String categoria) {
        this.cod = cod;
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
}
