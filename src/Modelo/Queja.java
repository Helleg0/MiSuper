package Modelo;

public abstract class Queja {
   
    private String cod;
    private String descripcion;
    private String fecha;
    protected Queja nextHandler;
    public String ocurrencia;

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Queja getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(Queja nextHandler) {
        this.nextHandler = nextHandler;
    }

    public String getOcurrencia() {
        return ocurrencia;
    }

    public void setOcurrencia(String ocurrencia) {
        this.ocurrencia = ocurrencia;
    }
    
     public abstract void evaluarOcurrencia(String ocurrencia);

}
