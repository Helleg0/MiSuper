package Modelo;

import javax.swing.JOptionPane;

public class OficinaProveedor extends Queja {

    @Override
    public void evaluarOcurrencia(String ocurrencia) {
        if (ocurrencia.equals("Producto en mal estado") || ocurrencia.equals("Inconvenientes con empaquetado")) {
             JOptionPane.showMessageDialog(null, "Se envio su queja a la oficina del proveedor");
        } else {
            this.nextHandler.evaluarOcurrencia(ocurrencia);
        }
    }
}
