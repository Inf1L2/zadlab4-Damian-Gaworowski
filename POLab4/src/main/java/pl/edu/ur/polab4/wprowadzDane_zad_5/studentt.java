package pl.edu.ur.polab4.wprowadzDane_zad_5;

/**
 *
 * @author student
 */
public class studentt {
    
    public static String imie;    
    public static String nazwisko;  
    public static int indeks;
    public static String spec;
    public static int rok;

    public studentt(String imie, String nazwisko, int indeks, String spec, int rok) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.indeks = indeks;
        this.spec = spec;
        this.rok = rok;
    }

    public studentt(String imie, String nazwisko, int indeks, String spec) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.indeks = indeks;
        this.spec = spec;
    }

    public studentt(String imie, String nazwisko, int indeks) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.indeks = indeks;
    }

    public studentt(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public void pokazDane(){
     System.out.println("Student");   
     System.out.println("Imie: "+this.imie);   
     System.out.println("Nazwisko: "+this.nazwisko);
     System.out.println("Indeks: "+this.indeks);
     System.out.println("Specyfikacja: "+this.spec);
     System.out.println("Rok: "+this.rok);
    }}

