/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.sorteos;

import java.util.Date;

/**
 *
 * @author valem
 */
public class Tiempos extends Sorteos {
    
    //se crea una variable de tipo random para el numero ganador principal y la jugada
    
    private int NumGanador_Principal = random.nextInt(100);
    private int NumGanador_Jugada = random.nextInt(100);
       public final int precio = 200;

    //getters and setters de cada atributo
    
    public int getNumGanador_Principal() {
        return NumGanador_Principal;
    }

    public void setNumGanador_Principal(int NumGanador_Principal) {
        this.NumGanador_Principal = NumGanador_Principal;
    }

    public int getNumGanador_Jugada() {
        return NumGanador_Jugada;
    }

    public void setNumGanador_Jugada(int NumGanador_Jugada) {
        this.NumGanador_Jugada = NumGanador_Jugada;
    }

    //se crea elconstrcutor, con los atributos que hereda de la clase sorteo, junto con los atributos propios
    public Tiempos(String sorteo, String tipo, int codigo, int emisiones, Date Fecha_Sorteo, int NumGanador_Principal, int NumGanador_Jugada) {
        super(sorteo, tipo, codigo, emisiones, Fecha_Sorteo);
        this.NumGanador_Principal = NumGanador_Principal;
        this.NumGanador_Jugada = NumGanador_Jugada;
    }

}
