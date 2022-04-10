package pl.codegym.task.task05.task0509;

/* 
Utwórz klasę Przyjaciel
*/

public class Przyjaciel
{
    //tutaj wpisz swój kod
    public String imie;
    public int wiek;
    public char plec;

    public void inicjalizuj(String imie,int wiek,char plec)
    {
        this.imie = imie;
        this.wiek = wiek;
        this.plec = plec;

    }
    public void inicjalizuj(String imie,int wiek)
    {
        this.imie = imie;
        this.wiek = wiek;


    }
    public void inicjalizuj(String imie)
    {
        this.imie = imie;


    }
    public static void main(String[] args)
    {

    }
}
