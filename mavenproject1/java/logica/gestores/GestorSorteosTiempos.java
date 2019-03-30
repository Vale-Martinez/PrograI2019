package logica.gestores;

import estructura.LinkedList;
import java.util.Date;
import logica.sorteos.Sorteos;
import logica.sorteos.Tiempos;

/**
 *
 * @author valem
 */
public class GestorSorteosTiempos implements GestorSorteos{
    private LinkedList<Sorteos> listaSorteosTiempos;

    public LinkedList<Sorteos> getListaSorteosTiempos() {
        return listaSorteosTiempos;
    }

    public void setListaSorteosTiempos(LinkedList<Sorteos> listaSorteosTiempos) {
        this.listaSorteosTiempos = listaSorteosTiempos;
    }
  public GestorSorteosTiempos(LinkedList<Sorteos> listaSorteosTiempos) {
        this.listaSorteosTiempos = listaSorteosTiempos;
    }

    public GestorSorteosTiempos() {
        this.listaSorteosTiempos = new LinkedList<>();
    }

    @Override
    public void crear(Sorteos Sorteo) {
        listaSorteosTiempos.create(Sorteo);
        System.out.println("Se ha creado el Sorteo Correctamente");
    }

    @Override
    public void eliminar(Sorteos Sorteo) {
        listaSorteosTiempos.Delete(Sorteo);
        System.out.println("Se ha eliminado el Sorteo Correctamente");    }

    @Override
    public String consultar(Sorteos Sorteo) {
        return listaSorteosTiempos.consult(Sorteo).toString();
    }

    @Override
    public String Buscar(String nombre, String tipo, Date Fecha_Sorteo, int Precio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
