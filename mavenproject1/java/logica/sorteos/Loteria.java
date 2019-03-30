package logica.sorteos;

import java.util.Date;

/**
 *
 * @author valem
 */
public class Loteria extends Sorteos {
    //se crea una variable de tipo random para el numero ganador

    private int Num_Ganador = random.nextInt(100);
    public final int precio = 1000;

    //getters and setters
    public int getNum_Ganador() {
        return Num_Ganador;
    }

    public void setNum_Ganador(int Num_Ganador) {
        this.Num_Ganador = Num_Ganador;
    }
//se crea elconstrcutor, con los atributos que hereda de la clase sorteo, junto con los atributos propios

    public Loteria(String sorteo, String tipo, int codigo, int emisiones, Date Fecha_Sorteo, int Num_Ganador) {
        super(sorteo, tipo, codigo, emisiones, Fecha_Sorteo);
        this.Num_Ganador = Num_Ganador;
    }

}
