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
public class kwadrat {
    
    public int Obwod;
    public int pole;
    public int dlg_boku;

    public kwadrat(int dlg_boku) {
        this.dlg_boku = dlg_boku;
    }
    public void Pole(){
        this.pole = this.dlg_boku*this.dlg_boku;
    }
    public void Obwod(){
        this.Obwod = this.dlg_boku*4;
    }
    public void pokazDane(){
        this.Pole();
        this.Obwod();
        System.out.println("Kwadrat");
        System.out.println("Długosć boku wynosi " + this.dlg_boku);
        System.out.println("Pole Wynosi " + this.pole );
        System.out.println("Obwód Wynosi " + this.Obwod );
    }
}