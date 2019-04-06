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
public class TiquetesBingo extends Tiquetes {
    
    private int Num_elegido1, Num_elegido2, Num_elegido3, Num_elegido4, Num_elegido5, Num_elegido6, Num_elegido7, Num_elegido8, Num_elegido9;
    public final int precio = 700;

    public int getNum_elegido1() {
        return Num_elegido1;
    }

    public void setNum_elegido1(int Num_elegido1) {
        this.Num_elegido1 = Num_elegido1;
    }

    public int getNum_elegido2() {
        return Num_elegido2;
    }

    public void setNum_elegido2(int Num_elegido2) {
        this.Num_elegido2 = Num_elegido2;
    }

    public int getNum_elegido3() {
        return Num_elegido3;
    }

    public void setNum_elegido3(int Num_elegido3) {
        this.Num_elegido3 = Num_elegido3;
    }

    public int getNum_elegido4() {
        return Num_elegido4;
    }

    public void setNum_elegido4(int Num_elegido4) {
        this.Num_elegido4 = Num_elegido4;
    }

    public int getNum_elegido5() {
        return Num_elegido5;
    }

    public void setNum_elegido5(int Num_elegido5) {
        this.Num_elegido5 = Num_elegido5;
    }

    public int getNum_elegido6() {
        return Num_elegido6;
    }

    public void setNum_elegido6(int Num_elegido6) {
        this.Num_elegido6 = Num_elegido6;
    }

    public int getNum_elegido7() {
        return Num_elegido7;
    }

    public void setNum_elegido7(int Num_elegido7) {
        this.Num_elegido7 = Num_elegido7;
    }

    public int getNum_elegido8() {
        return Num_elegido8;
    }

    public void setNum_elegido8(int Num_elegido8) {
        this.Num_elegido8 = Num_elegido8;
    }

    public int getNum_elegido9() {
        return Num_elegido9;
    }

    public void setNum_elegido9(int Num_elegido9) {
        this.Num_elegido9 = Num_elegido9;
    }
    
     public TiquetesBingo(String emisor, String cliente, String tipo,int Num_elegido1, int Num_elegido2, int Num_elegido3,int Num_elegido4,int Num_elegido5,int Num_elegido6,int Num_elegido7,int Num_elegido8,int Num_elegido9) {
        super(emisor, cliente, tipo);
        this.Num_elegido1 = Num_elegido1;
        this.Num_elegido2 = Num_elegido2;
        this.Num_elegido3 = Num_elegido3;
        this.Num_elegido4 = Num_elegido4;
        this.Num_elegido5 = Num_elegido5;
        this.Num_elegido6 = Num_elegido6;
        this.Num_elegido7 = Num_elegido7;
        this.Num_elegido8 = Num_elegido8;
        this.Num_elegido9 = Num_elegido9;
}
}
