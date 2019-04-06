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
public class GestorTiquetesLoteria implements GestorTiquetes{
    
    private DoublyLinkedList<Tiquetes> listaTiquetesLoteria;

    public DoublyLinkedList<Tiquetes> getListaTiquetesLoteria() {
        return listaTiquetesLoteria;
    }

    public void setListaTiquetesLoteria(DoublyLinkedList<Tiquetes> listaTiquetesLoteria) {
        this.listaTiquetesLoteria = listaTiquetesLoteria;
    }

    public GestorTiquetesLoteria(DoublyLinkedList<Tiquetes> listaTiquetesLoteria) {
        this.listaTiquetesLoteria = listaTiquetesLoteria;
    }
    
    public GestorTiquetesLoteria(){
        this.listaTiquetesLoteria = new DoublyLinkedList<>();
    }

    @Override
    public void crear(Tiquetes Tiquetes) {
        listaTiquetesLoteria.create(Tiquetes);
        System.out.println("Se ha creado el tiquete Correctamente");
    }

    @Override
    public void eliminar(Tiquetes Tiquetes) {
        listaTiquetesLoteria.Delete(Tiquetes);
        System.out.println("Se ha eliminado el tiquete Correctamente");
    }

    @Override
    public String consultar(Tiquetes Tiquetes) {
        return listaTiquetesLoteria.consult(Tiquetes).toString();
    }

    @Override
    public void modificar(Tiquetes Tiquetes, Tiquetes TiqueteNuevo) {
        listaTiquetesLoteria.update(Tiquetes, TiqueteNuevo);
    }

    @Override
    public String toString() {
        return listaTiquetesLoteria.toString() +"\n";
    }
    
}
