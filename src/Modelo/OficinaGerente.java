package Modelo;

import javax.swing.JOptionPane;

public class OficinaGerente extends Queja{
    @Override
    public void evaluarOcurrencia(String ocurrencia) {
        if (ocurrencia.equals("Comportamiento irrespetuoso por parte del personal") || ocurrencia.equals("Mala Atención")){
            JOptionPane.showMessageDialog(null, "Se envio su queja a la oficina del gerente.");
        } else {
            this.nextHandler.evaluarOcurrencia(ocurrencia);
        }
    }
}
