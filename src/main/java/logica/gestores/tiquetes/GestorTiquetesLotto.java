/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.gestores.tiquetes;

import logica.tiquetes.*;
import estructura.DoublyLinkedList;

/**
 *
 * @author Dell
 */
public class GestorTiquetesLotto implements GestorTiquetes {

    private DoublyLinkedList<Tiquetes> listaTiquetesLotto;

    public DoublyLinkedList<Tiquetes> getListaTiquetesLotto() {
        return listaTiquetesLotto;
    }

    public void setListaTiquetesLotto(DoublyLinkedList<Tiquetes> listaTiquetesLotto) {
        this.listaTiquetesLotto = listaTiquetesLotto;
    }

    public GestorTiquetesLotto(DoublyLinkedList<Tiquetes> listaTiquetesLotto) {
        this.listaTiquetesLotto = listaTiquetesLotto;
    }

    public GestorTiquetesLotto() {
        this.listaTiquetesLotto = new DoublyLinkedList<>();
    }

    @Override
    public void crear(Tiquetes Tiquetes) {
        listaTiquetesLotto.create(Tiquetes);
        System.out.println("Se ha creado el tiquete Correctamente");
    }

    @Override
    public void eliminar(Tiquetes Tiquetes) {
        listaTiquetesLotto.Delete(Tiquetes);
        System.out.println("Se ha eliminado el tiquete Correctamente");
    }

    @Override
    public String consultar(Tiquetes Tiquetes) {
        return listaTiquetesLotto.consult(Tiquetes).toString();
    }

    @Override
    public void modificar(Tiquetes Tiquetes, Tiquetes TiqueteNuevo) {
        listaTiquetesLotto.update(Tiquetes, TiqueteNuevo);
    }

    @Override
    public String toString() {
        return  listaTiquetesLotto.toString()+"\n";
    }
    
}
