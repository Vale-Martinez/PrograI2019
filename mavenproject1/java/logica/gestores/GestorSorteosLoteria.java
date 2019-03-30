package logica.gestores;

import estructura.LinkedList;
import logica.sorteos.*;

/**
 *
 * @author valem
 */
public class GestorSorteosLoteria {

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

    public void crear(Loteria LoteriaP) {
        listaSorteosLoteria.create(LoteriaP);
        System.out.println("Se ha creado el Sorteo Correctamente");
    }

    public void eliminar(Loteria LoteriaP) {
        listaSorteosLoteria.Delete(LoteriaP);
        System.out.println("Se ha eliminado el Sorteo Correctamente");
    }

    public String consultar(Loteria LoteriaP) {
        return listaSorteosLoteria.consult(LoteriaP).toString();
        
    }
}
