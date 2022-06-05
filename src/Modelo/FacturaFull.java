package Modelo;

public class FacturaFull extends Factura{
    @Override
    public int getPuntosFactura(Cliente cliente){
        return cliente.getPuntos()*0;
    }
    
}
