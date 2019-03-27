package logica.gestores;

/**
 *
 * @author valem
 */
public abstract class Tiquetes {
    private String Emisor, cliente, tiposorteo;
    private int combinscion, precio;

    public String getEmisor() {
        return Emisor;
    }

    public void setEmisor(String Emisor) {
        this.Emisor = Emisor;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getTiposorteo() {
        return tiposorteo;
    }

    public void setTiposorteo(String tiposorteo) {
        this.tiposorteo = tiposorteo;
    }

    public int getCombinscion() {
        return combinscion;
    }

    public void setCombinscion(int combinscion) {
        this.combinscion = combinscion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    abstract void crear();
    abstract void eliminar();
    abstract void modificar();
    abstract Object consultar();
    
}
