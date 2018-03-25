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
public class Stożek {
    public float powierzchnia;
    public float powierzchniax;
    public float powierzchniay;
    public float x;
    public float V;
    public int r;
    public int h;    

    public Stożek(int r, int h) {
        this.r = r;
        this.h = h;
    }
    
    public void V(){
        this.V = (float)((3.14*(this.r*this.r)*this.h)/3);
    }
    public void powierzchnia(){
        this.x = (float) Math.sqrt((this.r*this.r)+(this.h*this.h));
        this.powierzchniax = (float) (Math.PI*this.r*this.x);
        this.powierzchniay = (float) (Math.PI*this.r*this.r);
        this.powierzchnia = (float) (this.powierzchniax+this.powierzchniay);
    }
    public void pokazDane(){
        this.V();
        this.powierzchnia();
        System.out.println("Stożek");
        System.out.println("Proien wynosi " + this.r);
        System.out.println("Wysokość wynosi " + this.h );
        System.out.println("Tworząca wynosi " + this.x);
        System.out.println("Objętość wynosi " + this.V);
        System.out.println("Powierzchnia wynosi " + this.powierzchnia);
    }
}