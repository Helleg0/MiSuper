package Modelo;

public abstract class Factura {
 
private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


 
    public abstract int getPuntosFactura(Cliente cliente);
}
