package Modelo;

import javax.swing.JOptionPane;

public class OficinaAdministrador extends Queja {

    @Override
    public void evaluarOcurrencia(String ocurrencia) {
        if (ocurrencia.equals("Problemas con las facturas") || ocurrencia.equals("Inconveniente domiciliario")) {
             JOptionPane.showMessageDialog(null, "Se envio su queja a la oficina del administrador");
        } else {
            this.nextHandler.evaluarOcurrencia(ocurrencia);
        }
    }
}
