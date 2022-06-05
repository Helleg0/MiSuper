package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
    private String driver = "org.postgresql.Driver";
    private String connectString = "jdbc:mysql://localhost:3306/misuper";
    private String user = "root";
    private String password = "1423";
    private Connection conexionDB;
    private Statement sentenciaSQL;
    private ResultSet resultadoDB;
    
    public void conectar() {
        try {
            Class.forName(driver);
            conexionDB = DriverManager.getConnection(connectString, user, password);   
            sentenciaSQL = conexionDB.createStatement();                             
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void desconectar() {
        try {
            sentenciaSQL.close();
            conexionDB.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getConnectString() {
        return connectString;
    }

    public void setConnectString(String connectString) {
        this.connectString = connectString;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Connection getConexionDB() {
        return conexionDB;
    }

    public void setConexionDB(Connection conexionDB) {
        this.conexionDB = conexionDB;
    }

    public Statement getSentenciaSQL() {
        return sentenciaSQL;
    }

    public void setSentenciaSQL(Statement sentenciaSQL) {
        this.sentenciaSQL = sentenciaSQL;
    }

    public ResultSet getResultadoDB() {
        return resultadoDB;
    }

 
    public void setResultadoDB(ResultSet resultadoDB) {
        this.resultadoDB = resultadoDB;
    }
}

