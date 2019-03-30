/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.gestores;

import estructura.LinkedList;
import logica.sorteos.Sorteos;
import logica.sorteos.Tiempos;

/**
 *
 * @author valem
 */
public class GestorSorteosTiempos {
    private LinkedList<Sorteos> listaSorteosTiempos;

    public LinkedList<Sorteos> getListaSorteosTiempos() {
        return listaSorteosTiempos;
    }

    public void setListaSorteosTiempos(LinkedList<Sorteos> listaSorteosTiempos) {
        this.listaSorteosTiempos = listaSorteosTiempos;
    }

    public GestorSorteosTiempos(LinkedList<Sorteos> listaSorteosLoteria) {
        this.listaSorteosTiempos = listaSorteosLoteria;
    }

    public void crear(Tiempos TiemposP) {
        listaSorteosTiempos.create(TiemposP);
        System.out.println("Se ha creado el Sorteo Correctamente");
    }

    public void eliminar(Tiempos TiemposP) {
        listaSorteosTiempos.Delete(TiemposP);
        System.out.println("Se ha eliminado el Sorteo Correctamente");
    }

    public String consultar(Tiempos TiemposP) {
        return listaSorteosTiempos.consult(TiemposP).toString();
        
    }
}
