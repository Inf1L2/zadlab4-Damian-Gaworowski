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
public class szescian {
    public int dlg_boku;
    public double powierzchnia;
    public double V;

    public szescian(int dlg_boku) {
        this.dlg_boku = dlg_boku;
    }
    public void powierzchnia(){
        this.powierzchnia = Math.pow(dlg_boku,2)*6;
    }
    public void V(){
        this.V = Math.pow(dlg_boku,3);
    }
    public void pokazDane(){
        this.powierzchnia();
        this.V();
        System.out.println(" Sześcian");
        System.out.println("dlg_boku " + this.dlg_boku);
        System.out.println("Powierzchnia wynosi " + this.powierzchnia );
        System.out.println("Objętość wynosi " + this.V );
    }
}