package pl.codegym.task.task05.task0510;

/* 
Inicjalizowanie kotów
*/

public class Kot {
    //tutaj wpisz swój kod
    public String imie,adres,kolor;
    public int wiek;
    public int waga;

    public void inicjalizuj(String imie,int waga,int wiek)
    {
        this.imie = imie;
        this.wiek = wiek;
        this.waga = waga;
        this.kolor= "czerwony";
        //this.adres= "sdsa";
    }
    public void inicjalizuj(String imie,int wiek)
    {
        this.imie = imie;
        this.wiek = wiek;
        this.waga = 221;
        this.kolor= "czerwony";
        //this.adres= "czerwsadony";


    }
    public void inicjalizuj(int waga,String kolor)
    {
       // this.imie = "czerwsadsavvony";
        this.wiek = 231;
        this.waga = waga;
        this.kolor= kolor;
        //this.adres= "czerwsadsgbdssdavvony";


    }
    public void inicjalizuj(int waga,String kolor,String adres)
    {
       // this.imie = "czerwsadsjggggavvony";
        this.wiek = 1;
        this.waga = waga;
        this.kolor= kolor;
        this.adres= adres;

    }


    public void inicjalizuj(String imie)
    {
        this.imie = imie;
        this.wiek = 1;
        this.waga = 1;
        this.kolor= "Black";;
       // this.adres= "czerwsadsaaaaaaavvony";;


    }

    public static void main(String[] args) {

    }
}
