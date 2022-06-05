package Controlador;

import Modelo.OficinaAdministrador;
import Modelo.OficinaGerente;
import Modelo.OficinaProveedor;
import Modelo.OficinaSoporteTecnico;

public class ControladorQueja {
    OficinaSoporteTecnico soporteTecnico;
    OficinaProveedor proveedor;
    OficinaGerente gerente;
    OficinaAdministrador admin;
    String ocurrencia = "";
   
    public ControladorQueja() {
        soporteTecnico = new OficinaSoporteTecnico();
        proveedor = new OficinaProveedor();
        soporteTecnico.setNextHandler(proveedor);
        gerente = new OficinaGerente();
        proveedor.setNextHandler(gerente);
        admin = new OficinaAdministrador();        
        gerente.setNextHandler(admin);
    }
    
    public void responderQueja(int opcion, String queja){
        switch (opcion) {
                case 1:
                    ocurrencia = queja;
                    System.out.println("Aqui entré");
                    break;
                case 2:
                    ocurrencia = queja;
                    break;
                case 3:
                    ocurrencia = queja;
                    break;
                case 4:
                    ocurrencia = queja;
                    break;
                case 5:
                    ocurrencia = queja;
                    break;
                case 6:
                    ocurrencia = queja;
                    break;
                case 7:
                    ocurrencia = queja;
                    break;
                case 8:
                    ocurrencia = queja;
                    break;
        }
        if (ocurrencia.equals(queja)) {
            soporteTecnico.evaluarOcurrencia(ocurrencia);
        }
    }    
}
