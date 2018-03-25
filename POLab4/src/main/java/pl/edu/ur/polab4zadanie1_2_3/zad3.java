/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4zadanie1_2_3;
import java.util.Scanner;
/**
 *
 * @author student
 */
public class zad3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Student stud = new Student("Damian","Gaworowski", 104989, "prog", 1);
        Student stud1 = new Student("Damian","Gaworowski", 104989, "prog");
        Student stud2 = new Student("Damian","Gaworowski", 104989);
        Student stud3 = new Student("Damian","Gaworowski");
        
      
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Podaj imie studenta: ");
        Student.imie=sc.next();
        System.out.println("Podaj nazwisko studenta: ");
        Student.nazwisko=sc.next();
        System.out.println("Podaj indeks studenta: ");
        Student.indeks=sc.nextInt();
        System.out.println("Podaj specyfikacje studenta: ");
        Student.spec=sc.next();
        System.out.println("Podaj rok studiow studenta: ");
        Student.rok=sc.nextInt();
        
        stud.pokazDane();
        
    }
    
}