/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.gestores;

import estructura.LinkedList;
import java.util.Date;
import logica.sorteos.Bingo;
import logica.sorteos.Sorteos;

/**
 *
 * @author valem
 */
public class GestorSorteosBingo implements GestorSorteos{
    private LinkedList<Sorteos> listaSorteosBingo;

    public LinkedList<Sorteos> getListaSorteosBingo() {
        return listaSorteosBingo;
    }

    public void setListaSorteosBingo(LinkedList<Sorteos> listaSorteosBingo) {
        this.listaSorteosBingo = listaSorteosBingo;
    }

    public GestorSorteosBingo(LinkedList<Sorteos> listaSorteosBingo) {
        this.listaSorteosBingo = listaSorteosBingo;
    }

    public GestorSorteosBingo() {
        this.listaSorteosBingo = new LinkedList<>();
    }
    
    @Override
    public void crear(Sorteos Sorteo) {
        listaSorteosBingo.create(Sorteo);
        System.out.println("Se ha creado el Sorteo Correctamente");
    }

    @Override
    public void eliminar(Sorteos Sorteo) {
        listaSorteosBingo.Delete(Sorteo);
        System.out.println("Se ha eliminado el Sorteo Correctamente");    }

    @Override
    public String consultar(Sorteos Sorteo) {
        return listaSorteosBingo.consult(Sorteo).toString();
    }

    @Override
    public String Buscar(String nombre, String tipo, Date Fecha_Sorteo, int Precio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
