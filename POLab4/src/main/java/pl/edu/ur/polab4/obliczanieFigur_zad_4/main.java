/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.obliczanieFigur_zad_4;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class main {
    
   
    
    public static void main(String[] args) {
        int wybor;
        int bokkwadratu,bokprostokąta1,bokprostokąta2,promieńkoła,promieńkuli,promieństożka,hstożka,bokszescianu;
        
    Scanner odczyt = new Scanner(System.in);
    System.out.println("-------Podaj nr figury-------");
    System.out.println("1-kwadrat");
    System.out.println("2-prostokat");
    System.out.println("3-kolo");
    System.out.println("4-kula");
    System.out.println("5-stożek");
    System.out.println("6-Szescian");
    wybor = odczyt.nextInt();
    
    switch(wybor){
            case 1:
            System.out.println("Podaj bok kwadratu");
            bokkwadratu = odczyt.nextInt();  
            kwadrat kwadrat1 = new kwadrat(bokkwadratu);
            kwadrat1.pokazDane();
            break;
            
            case 2:
                System.out.println("Podaj bok prostokąta");
                bokprostokąta1=odczyt.nextInt();
                System.out.println("Podaj 2 bok prostokąta");
                bokprostokąta2=odczyt.nextInt();
                prostokat prostokat = new prostokat( bokprostokąta1,bokprostokąta2);
                prostokat.pokazDane();
                break;
                
            case 3:
                System.out.println("Podaj promień koła(r)");
                promieńkoła=odczyt.nextInt();
                kolo kolo1 = new kolo(promieńkoła);
                kolo1.pokazDane();
                break;
            case 4:
                System.out.println("Podaj promień kuli(r)");
                promieńkuli=odczyt.nextInt();
                Kula Kula1 = new Kula(promieńkuli);
                Kula1.pokazDane();
                break;
                
            case 5:
                System.out.println("Podaj promień podstawy stożka)");
                promieństożka=odczyt.nextInt();
                System.out.println("Podaj promień podstawy stożka)");
                hstożka=odczyt.nextInt();
                Stożek Stozek1 = new Stożek(promieństożka,hstożka);
                Stozek1.pokazDane();
                break;
                
            case 6:
                System.out.println("Podaj bok szesciany)");
                bokszescianu=odczyt.nextInt();
                szescian szescian1 = new szescian(bokszescianu);
                szescian1.pokazDane();
                break;
    
        
        
        
       
        
       
        
       
        
}}}