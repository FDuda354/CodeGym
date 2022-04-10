package pl.codegym.task.task07.task0724;

/* 
Spis członków rodziny
*/

public class Solution {
    public static void main(String[] args) {
        // tutaj wpisz swój kod
        Ludzie dziadek1 = new Ludzie("kazikO",true,73);
        Ludzie dziadek2 = new Ludzie("StachuM",true,94);
        Ludzie babcia1 = new Ludzie("BasiaO",false,63);
        Ludzie babcia2 = new Ludzie("AsiaM",false,55);
        Ludzie ojciec = new Ludzie("Artur",true,50,dziadek1,babcia1);
        Ludzie matka = new Ludzie("Goska",false,44,dziadek2,babcia2);
        Ludzie dziecko1 = new Ludzie("Filip",true,23,ojciec,matka);
        Ludzie dziecko2 = new Ludzie("Mati",true,17,ojciec,matka);
        Ludzie dziecko3 = new Ludzie("Klaudia",false,22,ojciec,matka);

        System.out.println(dziecko1);
        System.out.println(dziecko2);
        System.out.println(dziecko3);
        System.out.println(matka);
        System.out.println(ojciec);
        System.out.println(dziadek1);
        System.out.println(dziadek2);
        System.out.println(babcia1);
        System.out.println(babcia2);

    }

    public static class Ludzie {
        // tutaj wpisz swój kod
        String imie;
        boolean plec;
        int wiek;
        Ludzie ojciec;
        Ludzie matka;

        public Ludzie(String imie, boolean plec, int wiek, Ludzie ojciec, Ludzie matka)
        {
            this.imie = imie;
            this.plec = plec;
            this.wiek = wiek;
            this.ojciec = ojciec;
            this.matka = matka;
        }
        public Ludzie(String imie, boolean plec, int wiek)
        {
            this(imie,plec,wiek,null,null);
        }

        public String toString() {
            String tekst = "";
            tekst += "Imię: " + this.imie;
            tekst += ", płeć: " + (this.plec ? "mężczyzna" : "kobieta");
            tekst += ", wiek: " + this.wiek;

            if (this.ojciec != null) {
                tekst += ", ojciec: " + this.ojciec.imie;
            }

            if (this.matka != null) {
                tekst += ", matka: " + this.matka.imie;
            }

            return tekst;
        }
    }
}