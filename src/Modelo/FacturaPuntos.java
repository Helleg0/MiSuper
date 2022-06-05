package Modelo;

public class FacturaPuntos extends Factura{
    @Override
    public int getPuntosFactura(Cliente cliente){
        return cliente.getPuntos()*100;
    }

}
