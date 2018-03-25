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
public class prostokat {
    public int dlg_boku;
    public int dlg_boku2;
    public int pole;
    public int obwod;

    public prostokat(int dlg_boku, int dlg_boku2) {
        this.dlg_boku = dlg_boku;
        this.dlg_boku2 = dlg_boku2;
    }
    public void Pole(){
        this.pole = this.dlg_boku*this.dlg_boku2;
    }
    public void Obwod(){
        this.obwod = (this.dlg_boku*2)+(this.dlg_boku2*2);
    }
    public void pokazDane(){
        this.Pole();
        this.Obwod();
        System.out.println("Prostokąt");
        System.out.println("Długośc pierwszego boku " + this.dlg_boku);
        System.out.println("Dlugosc drugiego boku  " + this.dlg_boku2);
        System.out.println("Pole wynosi " + this.pole );
        System.out.println("Obwód wynosi " + this.obwod );
    }
}
