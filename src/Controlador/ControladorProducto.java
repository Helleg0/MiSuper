package Controlador;

import Modelo.Conexion;
import Modelo.ProductoPeso;
import Modelo.ProductoUnitario;
import Vista.VistaLogin;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class ControladorProducto {

    VistaLogin login;
    Conexion conexion = new Conexion();

    public ControladorProducto(VistaLogin login) {
        this.login = login;
    }

    public DefaultTableModel listarBebidas() {
        DefaultTableModel temporal;
        String nombreColumnas[] = {"Codigo", "Nombre", "PrecioxUnidad", "Stock"};
        temporal = new DefaultTableModel(
                new Object[][]{}, nombreColumnas);
        conexion.conectar();
        try {
            conexion.setResultadoDB(conexion.getSentenciaSQL().
                    executeQuery("select codProducto, nomProducto,precio,cantidad, stock from productoUnitario where categoria = 'Bebidas'"));//consulta        
            while (conexion.getResultadoDB().next()) {
                temporal.addRow(new Object[]{
                    conexion.getResultadoDB().getString("codProducto"),
                    conexion.getResultadoDB().getString("nomProducto"),
                    conexion.getResultadoDB().getString("precio"),
                    conexion.getResultadoDB().getString("stock")});
            }
            conexion.desconectar();//se desconecta de la base de datos                
        } catch (SQLException ex) {
            Logger.getLogger(ControladorProducto.class.getName()).
                    log(Level.SEVERE, null, ex);
            conexion.desconectar();//se desconecta de la base de datos
        }
        return temporal;
    }

    public DefaultTableModel listarCarnes() {
        DefaultTableModel temporal;
        String nombreColumnas[] = {"Codigo", "Nombre", "Preciox600Gramos"};
        temporal = new DefaultTableModel(
                new Object[][]{}, nombreColumnas);
        conexion.conectar();
        try {
            conexion.setResultadoDB(conexion.getSentenciaSQL().
                    executeQuery("select codProducto, nomProducto,precio from productoPeso where categoria = 'Carne'"));//consulta        
            while (conexion.getResultadoDB().next()) {
                temporal.addRow(new Object[]{
                    conexion.getResultadoDB().getString("codProducto"),
                    conexion.getResultadoDB().getString("nomProducto"),
                    conexion.getResultadoDB().getString("precio")});
            }
            conexion.desconectar();//se desconecta de la base de datos                
        } catch (SQLException ex) {
            Logger.getLogger(ControladorProducto.class.getName()).
                    log(Level.SEVERE, null, ex);
            conexion.desconectar();//se desconecta de la base de datos
        }
        return temporal;
    }

    public DefaultTableModel listarDespensa() {
        DefaultTableModel temporal;
        String nombreColumnas[] = {"Codigo", "Nombre", "PrecioxUnidad", "Stock"};
        temporal = new DefaultTableModel(
                new Object[][]{}, nombreColumnas);
        conexion.conectar();
        try {
            conexion.setResultadoDB(conexion.getSentenciaSQL().
                    executeQuery("select codProducto, nomProducto,precio,cantidad,stock from productoUnitario where categoria = 'Despensa'"));//consulta        
            while (conexion.getResultadoDB().next()) {
                temporal.addRow(new Object[]{
                    conexion.getResultadoDB().getString("codProducto"),
                    conexion.getResultadoDB().getString("nomProducto"),
                    conexion.getResultadoDB().getString("precio"),
                    conexion.getResultadoDB().getString("stock")});
            }
            conexion.desconectar();//se desconecta de la base de datos                
        } catch (SQLException ex) {
            Logger.getLogger(ControladorProducto.class.getName()).
                    log(Level.SEVERE, null, ex);
            conexion.desconectar();//se desconecta de la base de datos
        }
        return temporal;
    }

    public DefaultTableModel listarFV() {
        DefaultTableModel temporal;
        String nombreColumnas[] = {"Codigo", "Nombre", "Preciox200Gramos"};
        temporal = new DefaultTableModel(
                new Object[][]{}, nombreColumnas);
        conexion.conectar();
        try {
            conexion.setResultadoDB(conexion.getSentenciaSQL().
                    executeQuery("select codProducto, nomProducto,precio from productoPeso where categoria = 'Fruta/Verdura'"));//consulta        
            while (conexion.getResultadoDB().next()) {
                temporal.addRow(new Object[]{
                    conexion.getResultadoDB().getString("codProducto"),
                    conexion.getResultadoDB().getString("nomProducto"),
                    conexion.getResultadoDB().getString("precio")});
            }
            conexion.desconectar();//se desconecta de la base de datos                
        } catch (SQLException ex) {
            Logger.getLogger(ControladorProducto.class.getName()).
                    log(Level.SEVERE, null, ex);
            conexion.desconectar();//se desconecta de la base de datos
        }
        return temporal;
    }

    public DefaultTableModel listarLacteos() {
        DefaultTableModel temporal;
        String nombreColumnas[] = {"Codigo", "Nombre", "PrecioxUnidad", "Stock"};
        temporal = new DefaultTableModel(
                new Object[][]{}, nombreColumnas);
        conexion.conectar();
        try {
            conexion.setResultadoDB(conexion.getSentenciaSQL().
                    executeQuery("select codProducto, nomProducto,precio,cantidad, stock from productoUnitario where categoria = 'Lácteos'"));//consulta        
            while (conexion.getResultadoDB().next()) {
                temporal.addRow(new Object[]{
                    conexion.getResultadoDB().getString("codProducto"),
                    conexion.getResultadoDB().getString("nomProducto"),
                    conexion.getResultadoDB().getString("precio"),
                    conexion.getResultadoDB().getString("stock")});
            }
            conexion.desconectar();//se desconecta de la base de datos                
        } catch (SQLException ex) {
            Logger.getLogger(ControladorProducto.class.getName()).
                    log(Level.SEVERE, null, ex);
            conexion.desconectar();//se desconecta de la base de datos
        }
        return temporal;
    }

    public DefaultTableModel listarLimpieza() {
        DefaultTableModel temporal;
        String nombreColumnas[] = {"Codigo", "Nombre", "PrecioxUnidad", "Stock"};
        temporal = new DefaultTableModel(
                new Object[][]{}, nombreColumnas);
        conexion.conectar();
        try {
            conexion.setResultadoDB(conexion.getSentenciaSQL().
                    executeQuery("select codProducto, nomProducto,precio,cantidad, stock from productoUnitario where categoria = 'Limpieza'"));//consulta        
            while (conexion.getResultadoDB().next()) {
                temporal.addRow(new Object[]{
                    conexion.getResultadoDB().getString("codProducto"),
                    conexion.getResultadoDB().getString("nomProducto"),
                    conexion.getResultadoDB().getString("precio"),
                    conexion.getResultadoDB().getString("stock")});
            }
            conexion.desconectar();//se desconecta de la base de datos                
        } catch (SQLException ex) {
            Logger.getLogger(ControladorProducto.class.getName()).
                    log(Level.SEVERE, null, ex);
            conexion.desconectar();//se desconecta de la base de datos
        }
        return temporal;
    }

    public ProductoUnitario buscarProductoU(String cod) {
        ProductoUnitario producto = null;

        conexion.conectar();
        try {
            conexion.setResultadoDB(conexion.getSentenciaSQL().
                    executeQuery("select * from productoUnitario where "
                            + "codProducto='" + cod + "'"));

            if (conexion.getResultadoDB().next()) {
                producto = new ProductoUnitario(Integer.parseInt(conexion.getResultadoDB().getString("cantidad")),
                          Integer.parseInt(conexion.getResultadoDB().getString("stock")),
                        conexion.getResultadoDB().getString("codProducto"),
                        conexion.getResultadoDB().getString("nomProducto"),
                        Integer.parseInt(conexion.getResultadoDB().getString("precio")),
                        conexion.getResultadoDB().getString("categoria"));
            }
            conexion.desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(ProductoUnitario.class.getName())
                    .log(Level.SEVERE, null, ex);
            conexion.desconectar();
        }
        return producto;
    }

    public ProductoPeso buscarProductoP(String cod) {
        ProductoPeso producto = null;

        conexion.conectar();
        try {
            conexion.setResultadoDB(conexion.getSentenciaSQL().
                    executeQuery("select * from productoPeso where "
                            + "codProducto='" + cod + "'"));

            if (conexion.getResultadoDB().next()) {
                producto = new ProductoPeso(Integer.parseInt(conexion.getResultadoDB().getString("peso")),
                        conexion.getResultadoDB().getString("codProducto"),
                        conexion.getResultadoDB().getString("nomProducto"),
                        Integer.parseInt(conexion.getResultadoDB().getString("precio")),
                        conexion.getResultadoDB().getString("categoria"));
            }
            conexion.desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(ProductoPeso.class.getName())
                    .log(Level.SEVERE, null, ex);
            conexion.desconectar();
        }
        return producto;
    }

        public boolean modificar(String cod, int cantidad) {
        ProductoUnitario producto = null;
        conexion.conectar();
        try {
            conexion.getSentenciaSQL().execute
        ("update productoUnitario set stock=" + cantidad + 
               " where codProducto='" + cod +"'");//consulta
            conexion.desconectar();//se desconecta de la base de datos          
            return true;
        } catch (SQLException ex) {
            conexion.desconectar();//se desconecta de la base de datos          
            return false;
        }
    }
    
}
