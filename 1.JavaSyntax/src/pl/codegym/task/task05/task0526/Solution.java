package pl.codegym.task.task05.task0526;

/* 
Mężczyzna i kobieta
*/

public class Solution {
    public static void main(String[] args) {
        //tutaj wpisz swój kod
        Mezczyzna m1 = new Mezczyzna("Mike", 23, "Luna");
        Mezczyzna m2 = new Mezczyzna("Sophia", 15, "Earth");
        Kobieta k1 = new Kobieta("Diana", 35, "Mars");
        Kobieta k2 = new Kobieta("John", 23, "Luna");

        System.out.println(k1);
        System.out.println(k2);
        System.out.println(m1);
        System.out.println(m2);
    }
    //tutaj wpisz swój kod
    public static class Kobieta
    {
        String imie,adres;
        int wiek;

        public Kobieta()
        {
            this("Ania");
        }
        public Kobieta(String imie)
        {
            this(imie,22);
        }
        public Kobieta(String imie, int wiek)
        {
            this(imie,wiek,"adres");
        }
        public Kobieta(String imie, int wiek, String adres)
        {
            this.imie = imie;
            this.wiek = wiek;
            this.adres = adres;
        }
        public String toString()
        {
            return (imie + " " + wiek + " " + adres);
        }
    }
    public static class Mezczyzna
    {
        String imie,adres;
        int wiek;

        public Mezczyzna()
        {
            this("Filip");
        }
        public Mezczyzna(String imie)
        {
            this(imie,20);
        }
        public Mezczyzna(String imie,int wiek)
        {
            this(imie,wiek,"adres2");
        }
        public Mezczyzna(String imie,int wiek,String adres)
        {
            this.imie = imie;
            this.wiek = wiek;
            this.adres = adres;
        }
        public String toString()
        {
            return (imie + " " + wiek + " " + adres);
        }
    }

}
