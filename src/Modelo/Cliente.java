package Modelo;

public class Cliente {
    private String idCliente;
    private String nombreCompleto;
    private String email;
    private String password;
    private int puntos;

    public Cliente(String idCliente, String nombreCompleto, String email, String password, int puntos) {
        this.idCliente = idCliente;
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.password = password;
        this.puntos = puntos;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
    
}
