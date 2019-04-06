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
public class GestorTiquetesTiempos implements GestorTiquetes{
    
     private DoublyLinkedList<Tiquetes> listaTiquetesTiempos;

    public DoublyLinkedList<Tiquetes> getListaTiquetesTiempos() {
        return listaTiquetesTiempos;
    }

    public void setListaTiquetesTiempos(DoublyLinkedList<Tiquetes> listaTiquetesTiempos) {
        this.listaTiquetesTiempos = listaTiquetesTiempos;
    }

    public GestorTiquetesTiempos(DoublyLinkedList<Tiquetes> listaTiquetesTiempos) {
        this.listaTiquetesTiempos = listaTiquetesTiempos;
    }

    public GestorTiquetesTiempos() {
        this.listaTiquetesTiempos = new DoublyLinkedList<>();
    }
    
      @Override
    public void crear(Tiquetes Tiquetes) {
        listaTiquetesTiempos.create(Tiquetes);
        System.out.println("Se ha creado el tiquete Correctamente");
    }

    @Override
    public void eliminar(Tiquetes Tiquetes) {
        listaTiquetesTiempos.Delete(Tiquetes);
        System.out.println("Se ha eliminado el tiquete Correctamente");
    }

    @Override
    public String consultar(Tiquetes Tiquetes) {
        return listaTiquetesTiempos.consult(Tiquetes).toString();
    }

    @Override
    public void modificar(Tiquetes Tiquetes, Tiquetes TiqueteNuevo) {
        listaTiquetesTiempos.update(Tiquetes, TiqueteNuevo);
    }

    @Override
    public String toString() {
        return  listaTiquetesTiempos.toString() +"\n";
    }
    
     
}
