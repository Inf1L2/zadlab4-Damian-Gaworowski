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

public class tabstud {
    studentt[] studenci;
    int index =0;
    Scanner odczyt = new Scanner(System.in);
    
  
    
     public tabstud(){
        this.index = 0;
        this.studenci = new studentt[100];
}
    public void add()
    {
        for(int i=0;i<studenci.length;i++)
        {
            studenci[i]= new studentt(" "," ",i," ",0);
        }
}
    
 public void stObiekty(){
        for(int i=0; i<100; i++){
            studenci[i] = new studentt("","",0,"",0);
        }}
 

public void zamianaDanych(){
        
    System.out.println("Który index tab chcesz zamienic ? ");
        int liczba = odczyt.nextInt();
        System.out.println("Podaj imie: ");
        String imie = odczyt.next();
        System.out.println("Podaj nazwisko: ");
        String nazwisko = odczyt.next();
        System.out.println("Podaj nr_indeksu: ");
        int indeks = odczyt.nextInt();
        System.out.println("Podaj nazwe specjalnosci: ");
        String spec = odczyt.next();;
        System.out.println("Podaj rok studiow: ");
        int rok = odczyt.nextInt();
        studenci[liczba] = new studentt(imie,nazwisko,indeks,spec,rok);
        
}

public void delDane(){
        System.out.print("Który elem tab usnać ?");
        int liczba = odczyt.nextInt();
studenci[liczba] = new studentt("","",0,"",0);


}

public void zakrestab(){
        System.out.print("Który elem tab chcesz wyświetlić ? ");
        int elem = odczyt.nextInt();
        System.out.println("Elem nr"+elem);
        System.out.println("Imie "+ studenci[elem].imie);
        System.out.println("Nazwisko " +studenci[elem].nazwisko);
        System.out.println("indeks " +studenci[elem].indeks);
        System.out.println("spec "+studenci[elem].spec);
        System.out.println("Rok "+studenci[elem].rok);
}
public void pokazzakres(){
    System.out.println("Wprowadz pierwszy elem zakresu tablicy który chcesz wyświetlić");
    int first=odczyt.nextInt();
    System.out.println("Wprowadz ostatni elem tab z zakresu");
    int last=odczyt.nextInt();
    
    for(int i=first;i<last;i++){
    System.out.println("Student"+i);   
    System.out.println("Imie"+studenci[i].imie);
    System.out.println("Nazwisko"+studenci[i].nazwisko);
    System.out.println("Index"+studenci[i].indeks);
    System.out.println("specjalizacja"+studenci[i].spec);
    System.out.println("rok"+studenci[i].rok);
    }}
 public void pokazall(){
     for(int i=0;i<100;i++){
         System.out.println("Student"+i);   
    System.out.println("Imie"+studenci[i].imie);
    System.out.println("Nazwisko"+studenci[i].nazwisko);
    System.out.println("Index"+studenci[i].indeks);
    System.out.println("specjalizacja"+studenci[i].spec);
    System.out.println("rok"+studenci[i].rok);
         
         
    
        
    }
    
    
}




}
    


