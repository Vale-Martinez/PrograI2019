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
public class Bingo extends Sorteos {

    //se crea una variable de tipo random para cada posible numero ganador
    private int Num_Ganador1 = random.nextInt(100);
    private int Num_Ganador2 = random.nextInt(100);
    private int Num_Ganador3 = random.nextInt(100);
    private int Num_Ganador4 = random.nextInt(100);
    private int Num_Ganador5 = random.nextInt(100);
    private int Num_Ganador6 = random.nextInt(100);
    private int Num_Ganador7 = random.nextInt(100);
    private int Num_Ganador8 = random.nextInt(100);
    private int Num_Ganador9 = random.nextInt(100);
   public final int precio = 700;    

    //getters and setters de cada atributo
    public int getNum_Ganador1() {
        return Num_Ganador1;
    }

    public void setNum_Ganador1(int Num_Ganador1) {
        this.Num_Ganador1 = Num_Ganador1;
    }

    public int getNum_Ganador2() {
        return Num_Ganador2;
    }

    public void setNum_Ganador2(int Num_Ganador2) {
        this.Num_Ganador2 = Num_Ganador2;
    }

    public int getNum_Ganador3() {
        return Num_Ganador3;
    }

    public void setNum_Ganador3(int Num_Ganador3) {
        this.Num_Ganador3 = Num_Ganador3;
    }

    public int getNum_Ganador4() {
        return Num_Ganador4;
    }

    public void setNum_Ganador4(int Num_Ganador4) {
        this.Num_Ganador4 = Num_Ganador4;
    }

    public int getNum_Ganador5() {
        return Num_Ganador5;
    }

    public void setNum_Ganador5(int Num_Ganador5) {
        this.Num_Ganador5 = Num_Ganador5;
    }

    public int getNum_Ganador6() {
        return Num_Ganador6;
    }

    public void setNum_Ganador6(int Num_Ganador6) {
        this.Num_Ganador6 = Num_Ganador6;
    }

    public int getNum_Ganador7() {
        return Num_Ganador7;
    }

    public void setNum_Ganador7(int Num_Ganador7) {
        this.Num_Ganador7 = Num_Ganador7;
    }

    public int getNum_Ganador8() {
        return Num_Ganador8;
    }

    public void setNum_Ganador8(int Num_Ganador8) {
        this.Num_Ganador8 = Num_Ganador8;
    }

    public int getNum_Ganador9() {
        return Num_Ganador9;
    }

    public void setNum_Ganador9(int Num_Ganador9) {
        this.Num_Ganador9 = Num_Ganador9;
    }

    //se crea elconstrcutor, con los atributos que hereda de la clase sorteo, junto con los atributos propios
    public Bingo(String sorteo, String tipo, int codigo, int emisiones, Date Fecha_Sorteo, int Num_Ganador1, int Num_Ganador2, int Num_Ganador3, int Num_Ganador4, int Num_Ganador5, int Num_Ganador6, int Num_Ganador7, int Num_Ganador8, int Num_Ganador9) {
        super(sorteo, tipo, codigo, emisiones, Fecha_Sorteo);
        this.Num_Ganador1 = Num_Ganador1;
        this.Num_Ganador2 = Num_Ganador2;
        this.Num_Ganador3 = Num_Ganador3;
        this.Num_Ganador4 = Num_Ganador4;
        this.Num_Ganador5 = Num_Ganador5;
        this.Num_Ganador6 = Num_Ganador6;
        this.Num_Ganador7 = Num_Ganador7;
        this.Num_Ganador8 = Num_Ganador8;
        this.Num_Ganador9 = Num_Ganador9;

    }

}
