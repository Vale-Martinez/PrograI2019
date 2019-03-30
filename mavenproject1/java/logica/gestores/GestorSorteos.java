package logica.gestores;

import java.util.Date;
import logica.sorteos.Sorteos;

/**
 *
 * @author valem
 */
public interface GestorSorteos {
    public void crear(Sorteos Sorteo);
    public void eliminar (Sorteos Sorteo);
    public String consultar (Sorteos Sorteo);
    public String Buscar(String nombre,String tipo, Date Fecha_Sorteo,int Precio);
}

}
