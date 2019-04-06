/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.gestores;

import estructura.LinkedList;
import estructura.StructureNode;
import java.util.Date;
import static logica.gestores.GestorSorteos.Historial;
import logica.sorteos.Sorteos;

/**
 *
 * @author valem
 */
public class GestorSorteosLotto implements GestorSorteos {

    private LinkedList<Sorteos> listaSorteosLotto;

    public LinkedList<Sorteos> getListaSorteosLotto() {
        return listaSorteosLotto;
    }

    public void setListaSorteosLotto(LinkedList<Sorteos> listaSorteosLotto) {
        this.listaSorteosLotto = listaSorteosLotto;
    }

    public GestorSorteosLotto(LinkedList<Sorteos> listaSorteosLotto) {
        this.listaSorteosLotto = listaSorteosLotto;
    }

    public GestorSorteosLotto() {
        this.listaSorteosLotto = new LinkedList<>();
    }

    @Override
    public void crear(Sorteos Sorteo) {
        listaSorteosLotto.create(Sorteo);
        System.out.println("Se ha creado el Sorteo Correctamente");
    }

    @Override
    public void eliminar(Sorteos Sorteo) {
        listaSorteosLotto.Delete(Sorteo);
        System.out.println("Se ha eliminado el Sorteo Correctamente");
    }

    @Override
    public String consultar(Sorteos Sorteo) {
        return listaSorteosLotto.consult(Sorteo).toString();
    }

    @Override
    public String Buscar(String nombre, String tipo, Date Fecha_Sorteo) {
        StructureNode<Sorteos> temp = listaSorteosLotto.getHead();
        String resultado = "";
        for (int i = 1; i <= listaSorteosLotto.getSize(); i++) {
            if (nombre != null && nombre.equals(temp.getElement().getSorteo())) {
                resultado += temp.getElement().toString();
            }
            if (tipo != null && tipo.equals(temp.getElement().getTipo())) {
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
        return listaSorteosLotto.toString() + "\n";
    }
    
}
