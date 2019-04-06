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
public class GestorSorteosTiempos implements GestorSorteos {

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
        System.out.println("Se ha eliminado el Sorteo Correctamente");
    }

    @Override
    public String consultar(Sorteos Sorteo) {
        return listaSorteosTiempos.consult(Sorteo).toString();
    }

    @Override
    public String Buscar(String nombre, String tipo, Date Fecha_Sorteo) {
        StructureNode<Sorteos> temp = listaSorteosTiempos.getHead();
        String resultado = "";
        for (int i = 1; i <= listaSorteosTiempos.getSize(); i++) {
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
        return listaSorteosTiempos.toString() + "\n";
    }
    
}
