/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.gestores;

import estructura.LinkedList;
import logica.sorteos.Lotto;
import logica.sorteos.Sorteos;

/**
 *
 * @author valem
 */
public class GestorSorteosLotto {
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

    public void crear(Lotto LottoP) {
        listaSorteosLotto.create(LottoP);
        System.out.println("Se ha creado el Sorteo Correctamente");
    }

    public void eliminar(Lotto LottoP) {
        listaSorteosLotto.Delete(LottoP);
        System.out.println("Se ha eliminado el Sorteo Correctamente");
    }

    public String consultar(Lotto LottoP) {
        return listaSorteosLotto.consult(LottoP).toString();
        
    }
}
