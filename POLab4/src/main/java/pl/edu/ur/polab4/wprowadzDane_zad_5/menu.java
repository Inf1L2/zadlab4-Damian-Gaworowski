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
    public static void main(String[] args) {
        int wybór;
        
         tabstud studenci = new tabstud();
         studenci.add();

        Scanner odczyt = new Scanner(System.in);
        System.out.println("Wybierz działanie:");
        System.out.println("1=wprowadzanie danych studenta pod wybrany index tablicy,");
        System.out.println("2=edycję (nadpisanie danych studenta) spod wybranego indeksu,");
        System.out.println("3=usunięcie danych studenta (tj. nadpisanie elementów tablicy wartościami domyślnymi),");
        System.out.println("4=wyświetlenie obiektu o danym indeksie.");
        System.out.println("5=wyświetlenie wszystkich obiektów,");
        System.out.println("6=wyświetlenie zakresu obiektów w podanym zakresie.");
                
        
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
