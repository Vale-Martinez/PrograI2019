package logica.sorteos;

//import java.lang.reflect.Array;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author valem
 */
public class Sorteos implements Comparable<Sorteos> {

    private String sorteo, tipo;
    private int codigo, emisiones;
    Random random = new Random();
    private Date Fecha_Sorteo;

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

    public Date getFecha_Sorteo() {
        return Fecha_Sorteo;
    }

    public void setFecha_Sorteo(Date Fecha_Sorteo) {
        this.Fecha_Sorteo = Fecha_Sorteo;
    }

    public Sorteos(String sorteo, String tipo, int codigo, int emisiones, Date Fecha_Sorteo) {
        this.sorteo = sorteo;
        this.tipo = tipo;
        this.codigo = codigo;
        this.emisiones = emisiones;
        this.Fecha_Sorteo = Fecha_Sorteo;
    }


    @Override
    public int compareTo(Sorteos t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



}
