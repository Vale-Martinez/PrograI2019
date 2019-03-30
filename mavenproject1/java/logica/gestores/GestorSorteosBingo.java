/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.gestores;

import estructura.LinkedList;
import logica.sorteos.Bingo;
import logica.sorteos.Sorteos;

/**
 *
 * @author valem
 */
public class GestorSorteosBingo {
    private LinkedList<Sorteos> listaSorteosBingo;

    public LinkedList<Sorteos> getListaSorteosBingo() {
        return listaSorteosBingo;
    }

    public void setListaSorteosBingo(LinkedList<Sorteos> listaSorteosBingo) {
        this.listaSorteosBingo = listaSorteosBingo;
    }

    public GestorSorteosBingo(LinkedList<Sorteos> listaSorteosLoteria) {
        this.listaSorteosBingo = listaSorteosLoteria;
    }

    public void crear(Bingo BingoP) {
        listaSorteosBingo.create(BingoP);
        System.out.println("Se ha creado el Sorteo Correctamente");
    }

    public void eliminar(Bingo BingoP) {
        listaSorteosBingo.Delete(BingoP);
        System.out.println("Se ha eliminado el Sorteo Correctamente");
    }

    public String consultar(Bingo BingoP) {
        return listaSorteosBingo.consult(BingoP).toString();
        
    }
}
