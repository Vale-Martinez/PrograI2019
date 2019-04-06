/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.usuario;

import estructura.DoublyLinkedList;

/**
 *
 * @author Dell
 */
public class gestorUsuarios {

    private DoublyLinkedList<Usuario> listaUsuarios=new DoublyLinkedList<>();

    public DoublyLinkedList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(DoublyLinkedList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public void crear(Usuario usuario) {
        listaUsuarios.create(usuario);
    }

    public void eliminar(Usuario usuario) {
        listaUsuarios.Delete(usuario);
    }

    public String consultar(Usuario usuario) {
    return listaUsuarios.consult(usuario).toString();
    }
}
