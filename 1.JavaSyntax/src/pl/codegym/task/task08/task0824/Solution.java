package pl.codegym.task.task08.task0824;

/* 
Załóż rodzinę
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //tutaj wpisz swój kod
         ArrayList<Ludzie> lis = new ArrayList<Ludzie>();

        Ludzie dziecko3 = new Ludzie("dziecko3",33,false);
        Ludzie dziecko2 = new Ludzie("dziecko2",22,true);
        Ludzie dziecko1 = new Ludzie("dziecko1",11,true);
        Ludzie matka = new Ludzie("matka",49,false,dziecko1,dziecko2,dziecko3);
        Ludzie ojciec = new Ludzie("ojciec",55,true,dziecko1,dziecko2,dziecko3);
        Ludzie babcia2 = new Ludzie("babcia2",57,false,matka);
        Ludzie babcia1 = new Ludzie("babcia1",77,false,ojciec);
        Ludzie dziadek1 = new Ludzie("dziadek1",77,true,ojciec);
        Ludzie dziadek2 = new Ludzie("dziadek2",87,true,matka);





        lis.add(dziecko3);
        lis.add(dziecko2);
        lis.add(dziecko1);
        lis.add(matka);
        lis.add(ojciec);
        lis.add(babcia2);
        lis.add(babcia1);
        lis.add(dziadek1);
        lis.add(dziadek2);

        for(Ludzie obj: lis)
        {
            System.out.println(obj.toString());
        }





    }

    public static class Ludzie {
        //tutaj wpisz swój kod
       public String imie;
        public  int wiek;
        public   boolean plec;
        public  ArrayList<Ludzie> dzieci = new ArrayList<Ludzie>();

        public Ludzie()
        {
            this("brak");

        }
        public Ludzie(String imie)
        {
            this(imie,0);
        }
        public Ludzie(String imie, int wiek)
        {
            this(imie,wiek,false);
        }
        public Ludzie(String imie, int wiek,boolean plec)
        {
            this.imie = imie;
            this.wiek = wiek;
            this.plec = plec;
        }
        public Ludzie(String imie, int wiek,boolean plec,Ludzie dzieci)
        {
            this.imie = imie;
            this.wiek = wiek;
            this.plec = plec;
            this.dzieci.add(dzieci);
        }
        public Ludzie(String imie, int wiek,boolean plec,Ludzie dzieci,Ludzie dzieci1)
        {
            this.imie = imie;
            this.wiek = wiek;
            this.plec = plec;
            this.dzieci.add(dzieci);
            this.dzieci.add(dzieci1);
        }
        public Ludzie(String imie, int wiek,boolean plec,Ludzie dzieci,Ludzie dzieci1,Ludzie dzieci2)
        {
            this.imie = imie;
            this.wiek = wiek;
            this.plec = plec;
            this.dzieci.add(dzieci);
            this.dzieci.add(dzieci1);
            this.dzieci.add(dzieci2);
        }




        public String toString() {
            String tekst = "";
            tekst += "Imię: " + this.imie;
            tekst += ", płeć: " + (this.plec ? "mężczyzna" : "kobieta");
            tekst += ", wiek: " + this.wiek;

            int licznikDzieci = this.dzieci.size();
            if (licznikDzieci > 0) {
                tekst += ", dzieci: " + this.dzieci.get(0).imie;

                for (int i = 1; i <licznikDzieci; i++) {
                    Ludzie dziecko = this.dzieci.get(i);
                    tekst += ", " + dziecko.imie;
                }
            }
            return tekst;
        }
    }

}
