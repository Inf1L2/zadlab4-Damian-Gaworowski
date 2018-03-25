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
public class kolo {
    
    public float Obwod;
    public float pole;
    public int r;

    public kolo(int r) {
        this.r = r;
    }      
    public void Obwod(){
        this.Obwod = (float) (2*3.14*this.r);
    }
    public void Pole(){
        this.pole = (float) (3.14*(this.r*this.r));
    }
    public void pokazDane(){
        this.Pole();
        this.Obwod();
        System.out.println("Koło");
        System.out.println("Pole wynosi" + this.pole );
        System.out.println("Obwód wynosi " + this.Obwod );
    }
}