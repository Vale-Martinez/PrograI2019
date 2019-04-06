/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.tiquetes;

/**
 *
 * @author Dell
 */
public class TiquetesTiempos extends Tiquetes{
    
    private int NumElegido_Principal, NumElegido_Jugada;
    public final int precio = 200;

    public int getNumElegido_Principal() {
        return NumElegido_Principal;
    }

    public void setNumElegido_Principal(int NumElegido_Principal) {
        this.NumElegido_Principal = NumElegido_Principal;
    }

    public int getNumElegido_Jugada() {
        return NumElegido_Jugada;
    }

    public void setNumElegido_Jugada(int NumElegido_Jugada) {
        this.NumElegido_Jugada = NumElegido_Jugada;
    }
    
    
    
    public TiquetesTiempos(String emisor, String cliente, String tipo, int NumElegido_Principal, int NumElegido_Jugada) {
        super(emisor, cliente, tipo);
        this.NumElegido_Principal = NumElegido_Principal;
        this.NumElegido_Jugada = NumElegido_Jugada;
    }
    
    
}
