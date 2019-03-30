package logica.gestores;

import estructura.LinkedList;
import java.util.Date;
import logica.sorteos.*;

/**
 *
 * @author valem
 */
public class GestorSorteosLoteria implements GestorSorteos {

    private LinkedList<Sorteos> listaSorteosLoteria;

    public LinkedList<Sorteos> getListaSorteosLoteria() {
        return listaSorteosLoteria;
    }

    public void setListaSorteosLoteria(LinkedList<Sorteos> listaSorteosLoteria) {
        this.listaSorteosLoteria = listaSorteosLoteria;
    }

    public GestorSorteosLoteria(LinkedList<Sorteos> listaSorteosLoteria) {
        this.listaSorteosLoteria = listaSorteosLoteria;
    }

    @Override
    public void crear(Sorteos Sorteo) {
        listaSorteosLoteria.create(Sorteo);
        System.out.println("Se ha creado el Sorteo Correctamente");
    }

    @Override
    public void eliminar(Sorteos Sorteo) {
        listaSorteosLoteria.Delete(Sorteo);
        System.out.println("Se ha eliminado el Sorteo Correctamente");    }

    @Override
    public String consultar(Sorteos Sorteo) {
        return listaSorteosLoteria.consult(Sorteo).toString();
    }

    @Override
    public String Buscar(String nombre, String tipo, Date Fecha_Sorteo, int Precio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
