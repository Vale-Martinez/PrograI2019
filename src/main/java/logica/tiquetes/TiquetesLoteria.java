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
public class TiquetesLoteria extends Tiquetes{
    
    private int num_elegido;
    public final int precio = 1000;

    public int getNum_elegido() {
        return num_elegido;
    }

    public void setNum_elegido(int num_elegido) {
        this.num_elegido = num_elegido;
    }
    
    
    
    public TiquetesLoteria(String emisor, String cliente, String tipo, int num_elegido) {
        super(emisor, cliente, tipo);
        this.num_elegido = num_elegido;
    }
    
}
