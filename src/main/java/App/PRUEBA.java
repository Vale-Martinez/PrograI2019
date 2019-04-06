/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import estructura.*;
import java.util.Date;
import logica.gestores.*;
import logica.sorteos.*;

/**
 *
 * @author valem
 */
public class PRUEBA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stack s = new Stack();
        // DoublyLinkedList d = new DoublyLinkedList();
        LinkedList l = new LinkedList();
        PriorityQueue p = new PriorityQueue();
        Date d = new Date();
        Loteria Loteria = new Loteria("Hola", "extra", 011, 100, d);
        Loteria Loteria2 = new Loteria("kk", "ord", 011, 100, d);
        GestorSorteosLoteria gl = new GestorSorteosLoteria();
        gl.crear(Loteria);
        gl.crear(Loteria2);
        System.out.println(gl.getListaSorteosLoteria().toString()+"588");
        System.out.println(gl.consultar(Loteria));
        gl.eliminar(Loteria);
        System.out.println(gl.getListaSorteosLoteria().toString());
        
    }

}
