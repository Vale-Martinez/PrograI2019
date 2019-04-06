/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.tiquetes;

//import estructura.DoublyLinkedList;
/**
 *
 * @author Dell
 */
public class Tiquetes implements Comparable<Tiquetes>{
    
    private String emisor, cliente, tipo;
   
    
    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
 
    public Tiquetes(String emisor, String cliente, String tipo) {
        this.emisor = emisor;
        this.cliente = cliente;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Tiquetes{" + "emisor=" + emisor + ", cliente=" + cliente + ", tipo=" + tipo + '}';
    }
    

    @Override
    public int compareTo(Tiquetes t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
