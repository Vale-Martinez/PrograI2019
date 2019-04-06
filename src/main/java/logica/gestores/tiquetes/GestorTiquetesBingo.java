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
public class GestorTiquetesBingo implements GestorTiquetes{
    
    private DoublyLinkedList<Tiquetes> listaTiquetesBingo;

    public DoublyLinkedList<Tiquetes> getListaTiquetesBingo() {
        return listaTiquetesBingo;
    }

    public void setListaTiquetesBingo(DoublyLinkedList<Tiquetes> listaTiquetesBingo) {
        this.listaTiquetesBingo = listaTiquetesBingo;
    }

    public GestorTiquetesBingo(DoublyLinkedList<Tiquetes> listaTiquetesBingo) {
        this.listaTiquetesBingo = listaTiquetesBingo;
    }

    public GestorTiquetesBingo() {
        this.listaTiquetesBingo = new DoublyLinkedList<>();   
    }
    
    @Override
    public void crear(Tiquetes Tiquetes) {
        listaTiquetesBingo.create(Tiquetes);
        System.out.println("Se ha creado el tiquete Correctamente");
    }

    @Override
    public void eliminar(Tiquetes Tiquetes) {
        listaTiquetesBingo.Delete(Tiquetes);
        System.out.println("Se ha eliminado el tiquete Correctamente");
    }

    @Override
    public String consultar(Tiquetes Tiquetes) {
        return listaTiquetesBingo.consult(Tiquetes).toString();
    }

    @Override
    public void modificar(Tiquetes Tiquetes, Tiquetes TiqueteNuevo) {
        listaTiquetesBingo.update(Tiquetes, TiqueteNuevo);
    }

    @Override
    public String toString() {
        return  listaTiquetesBingo.toString() +"\n";
    }
    
}
