package logica.gestores;

import estructura.LinkedList;
import estructura.StructureNode;
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

    public GestorSorteosLoteria() {
        this.listaSorteosLoteria = new LinkedList<>();
    }

    @Override
    public void crear(Sorteos Sorteo) {
        listaSorteosLoteria.create(Sorteo);
        System.out.println("Se ha creado el Sorteo Correctamente");
    }

    @Override
    public void eliminar(Sorteos Sorteo) {
        listaSorteosLoteria.Delete(Sorteo);
        System.out.println("Se ha eliminado el Sorteo Correctamente");
    }

    @Override
    public String consultar(Sorteos Sorteo) {
        return listaSorteosLoteria.consult(Sorteo).toString();
    }

    @Override
    public String Buscar(String nombre, String tipo, Date Fecha_Sorteo) {
        StructureNode<Sorteos> temp = listaSorteosLoteria.getHead();
        String resultado = "";
        for (int i = 1; i <= listaSorteosLoteria.getSize(); i++) {
            if (nombre != "" && nombre.equals(temp.getElement().getSorteo())) {
                resultado += temp.getElement().toString();
            }
            if (tipo != "" && tipo.equals(temp.getElement().getTipo())) {
                resultado += temp.getElement().toString();
            }
            if (Fecha_Sorteo != null && Fecha_Sorteo.equals(temp.getElement().getFecha_Sorteo())) {
                resultado += temp.getElement().toString();
            }
            temp = temp.getNextNode();
        }

        Historial.create(resultado);
        return resultado;
    }

    @Override
    public String toString() {
        return  listaSorteosLoteria.toString() + "\n";
    }
    
}
