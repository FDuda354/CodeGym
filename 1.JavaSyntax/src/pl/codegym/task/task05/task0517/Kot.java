package pl.codegym.task.task05.task0517;

/* 
Tworzenie kotów
*/

public class Kot
{


    String imie,adres,kolor;
    int wiek,waga;


//    String
//    String ,int ,int
//    String ,int
//    int ,String ,String
//    int ,String
   public Kot (String imie)
    {
        this.imie=imie;
        this.kolor="kolor";
        this.wiek=2;
        this.waga=2;

    }
    public  Kot (String imie,int waga,int wiek)
    {
        this.imie=imie;

        this.kolor="kolor";
        this.wiek=wiek;
        this.waga=waga;

    }
    public  Kot (String imie,int wiek)
    {
        this.imie=imie;

        this.kolor="kolor";
        this.wiek=wiek;
        this.waga=2;

    }
    public   Kot (int waga,String kolor,String adres)
    {

        this.adres=adres;
        this.kolor=kolor;
        this.wiek=2;
        this.waga=waga;

    }
    public  Kot (int waga,String kolor)
    {

        this.kolor=kolor;
        this.wiek=2;
        this.waga=waga;

    }
    public static void main(String[] args)
    {

    }
}
