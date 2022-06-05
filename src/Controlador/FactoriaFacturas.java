package Controlador;

import Modelo.Factura;
import Modelo.FacturaFull;
import Modelo.FacturaPuntos;

public class FactoriaFacturas {
      public Factura getFactura(String eleccion) {
 
        if (eleccion.equals("Puntos")) {
            System.out.println("puntos");
        return new FacturaPuntos();
        }
        else if (eleccion.equals("Full")){
            System.out.println("full");
        return new FacturaFull();
        }
        
        return null;
    }
}
