/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.obliczanieFigur_zad_4;

/**
 *
 * @author HP
 */
    public class Kula {
    public float V;
    public float powierzchnia;
    public int r;

    public Kula(int r) {
        this.r = r;
    }    
    public void V(){
        this.V = (float) ((4/3)*(3.14*Math.pow(this.r,3)));
    }
    public void powierzchnia(){
        this.powierzchnia = (float) (4*3.14*Math.pow(this.r,2));
    }
    public void pokazDane(){
        this.V();
        this.powierzchnia();
        System.out.println("Kula");
        System.out.println("Promień wynosi " + this.r);
        System.out.println("Powierzchnia wynosi " + this.powierzchnia );
        System.out.println("Objętość wynosi " + this.V );
    }
}
    

