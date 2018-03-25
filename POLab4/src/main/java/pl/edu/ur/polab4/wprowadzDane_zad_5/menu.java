/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.wprowadzDane_zad_5;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class menu {
    public static void menu() {
        int wybór;
        
         tabstud studenci = new tabstud();
         studenci.add();

        Scanner odczyt = new Scanner(System.in);
        System.out.println("1. Dodaj Studenta, 2.Edytuj studenta, 3.Usun studenta, 4.Wyswietl studenta, 5.Wyswietl wszystkich studentow, " +
                    "6.Wyswietl zakres studentow");
            wybór = odczyt.nextInt();
            switch (wybór)
            {
                case 1:
                    studenci.stObiekty();
                    break;
                case 2:
                    studenci.zamianaDanych();
                    break;
                case 3:
                    studenci.delDane();
                    break;
                case 4:
                    studenci.zakrestab();
                    break;
                case 5:
                    studenci.pokazall();
                    break;
                case 6:
                    studenci.pokazzakres();
                    break;
                

    }
    
}}
