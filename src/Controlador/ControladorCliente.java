package Controlador;

import Modelo.Cliente;
import Modelo.Conexion;
import Vista.VistaLogin;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ControladorCliente {

    VistaLogin login;
    Conexion conexion = new Conexion();

    public ControladorCliente(VistaLogin login) {
        this.login = login;
    }

    public boolean registrarCliente(String idCliente, String nombreCompleto, String email, String password, int puntos) {

        List<String> clienteV = (ArrayList<String>) buscarRegistro(email, idCliente);
        if (!clienteV.isEmpty()) {
            JOptionPane.showMessageDialog(login, "La cedula o el correo ya se encuentra en uso");
        } else {
            Cliente cliente = new Cliente(idCliente, nombreCompleto, email, password, puntos);
            conexion.conectar();
            try {
                conexion.getSentenciaSQL().execute("insert into cliente(idCliente,nombrecompleto,email,pass,puntos) "
                        + "values('" + cliente.getIdCliente() + "','" + cliente.getNombreCompleto() + "','"
                        + cliente.getEmail() + "','" + cliente.getPassword() + "'," + cliente.getPuntos() + ")");
                conexion.desconectar();
                return true;
            } catch (SQLException ex) {
                conexion.desconectar();
                return false;
            }

        }

        return false;
    }

    public List<String> buscarRegistro(String correo, String cedula) {
        List<String> clientes = new ArrayList<String>();
        conexion.conectar();
        try {
            conexion.setResultadoDB(conexion.getSentenciaSQL().
                    executeQuery("select idCliente,nombreCompleto,email,pass,puntos from cliente where "
                            + "email='" + correo + "' or idcliente = '" + cedula + "'"));

            if (conexion.getResultadoDB().next()) {
                clientes.add(conexion.getResultadoDB().getString("idCliente"));
                clientes.add(conexion.getResultadoDB().getString("nombreCompleto"));
                clientes.add(conexion.getResultadoDB().getString("email"));
                clientes.add(conexion.getResultadoDB().getString("pass"));
                clientes.add(conexion.getResultadoDB().getInt("puntos") + "");
            }
            conexion.desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName())
                    .log(Level.SEVERE, null, ex);
            conexion.desconectar();
        }
        return clientes;
    }

    public boolean validarLogin(String email, String pass) {

        conexion.conectar();

        try {
            conexion.setResultadoDB(conexion.getSentenciaSQL().
                    executeQuery("select email,pass from cliente where "
                            + "email='" + email + "' and pass='" + pass + "'"));//consulta        

            if (conexion.getResultadoDB().next()) {
                return true;
            }
            conexion.desconectar();//se desconecta de la base de datos      
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(ControladorCliente.class.getName())
                    .log(Level.SEVERE, null, ex);
            conexion.desconectar();//se desconecta de la base de datos
            return false;
        }

    }

    public Cliente buscarCliente(String correo) {
        Cliente cliente = null;
        conexion.conectar();
        try {
            conexion.setResultadoDB(conexion.getSentenciaSQL().
                    executeQuery("select idCliente,nombreCompleto,email,pass,puntos from cliente where "
                            + "email='" + correo + "'"));

            if (conexion.getResultadoDB().next()) {
                cliente = new Cliente(conexion.getResultadoDB().getString("idCliente"),
                        conexion.getResultadoDB().getString("nombreCompleto"),
                        conexion.getResultadoDB().getString("email"),
                        conexion.getResultadoDB().getString("pass"),
                        conexion.getResultadoDB().getInt("puntos"));
            }
            conexion.desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName())
                    .log(Level.SEVERE, null, ex);
            conexion.desconectar();
        }
        return cliente;
    }

    public boolean actualizarPuntos(String idCliente, String nombreCompleto, String email, String password, int puntos) {
        Cliente cliente = new Cliente(idCliente, nombreCompleto, email, password, puntos);
        conexion.conectar();
        try {
            conexion.getSentenciaSQL().execute("update cliente set puntos='" + cliente.getPuntos()
                    + "' where idCliente='" + cliente.getIdCliente() + "'");//consulta
            conexion.desconectar();//se desconecta de la base de datos          
            return true;
        } catch (SQLException ex) {
            conexion.desconectar();//se desconecta de la base de datos
            System.out.println(ex);
            return false;
        }
    }
}
