package logica.gestores;

import estructura.LinkedList;
import java.util.Date;
import logica.sorteos.Lotto;
import logica.sorteos.Sorteos;

/**
 *
 * @author valem
 */
public class GestorSorteosLotto implements GestorSorteos{
    private LinkedList<Sorteos> listaSorteosLotto;

    public LinkedList<Sorteos> getListaSorteosLotto() {
        return listaSorteosLotto;
    }

    public void setListaSorteosLotto(LinkedList<Sorteos> listaSorteosLotto) {
        this.listaSorteosLotto = listaSorteosLotto;
    }

    public GestorSorteosLotto(LinkedList<Sorteos> listaSorteosLoteria) {
        this.listaSorteosLotto = listaSorteosLoteria;
    }

    @Override
    public void crear(Sorteos Sorteo) {
        listaSorteosLotto.create(Sorteo);
        System.out.println("Se ha creado el Sorteo Correctamente");
    }

    @Override
    public void eliminar(Sorteos Sorteo) {
        listaSorteosLotto.Delete(Sorteo);
        System.out.println("Se ha eliminado el Sorteo Correctamente");    }

    @Override
    public String consultar(Sorteos Sorteo) {
        return listaSorteosLotto.consult(Sorteo).toString();
    }

    @Override
    public String Buscar(String nombre, String tipo, Date Fecha_Sorteo, int Precio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
