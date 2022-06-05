package Modelo;

import javax.swing.JOptionPane;

public class OficinaSoporteTecnico extends Queja {

    @Override
    public void evaluarOcurrencia(String ocurrencia) {
        if (ocurrencia.equals("Fallo aplicación") || ocurrencia.equals("Sugerir mejoras en la aplicación")) {
            JOptionPane.showMessageDialog(null, "Se envio su queja a la oficina de soporte tecnico");
        } else {
            this.nextHandler.evaluarOcurrencia(ocurrencia);
        }
    }
}
