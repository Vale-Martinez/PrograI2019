package logica.gestores;

//import java.lang.reflect.Array;

/**
 *
 * @author valem
 */

public abstract class Sorteos {

    private String sorteo,tipo;
    private int codigo,emisiones;


    //get and set de los atributos
    public String getSorteo() {
        return sorteo;
    }

    public void setSorteo(String sorteo) {
        this.sorteo = sorteo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getEmisiones() {
        return emisiones;
    }

    public void setEmisiones(int emisiones) {
        this.emisiones = emisiones;
    }

    public Sorteos(String sorteo, String tipo, int codigo, int emisiones) {
        this.sorteo = sorteo;
        this.tipo = tipo;
        this.codigo = codigo;
        this.emisiones = emisiones;
    }

   
    
    public abstract void sortear();
    public abstract void crear();
    public abstract void eliminar();
    public abstract Object consultar();

}
