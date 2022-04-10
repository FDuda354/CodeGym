package pl.codegym.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Relacje między kotami
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String imieDziadka = reader.readLine();
        Kot dziadek = new Kot(imieDziadka);

        String imieBabci = reader.readLine();
        Kot babcia = new Kot(imieBabci);

        String imieOjca = reader.readLine();
        Kot ojciec = new Kot(imieOjca ,null,dziadek);

        String imieMatki = reader.readLine();
        Kot matka = new Kot(imieMatki,babcia,null);

        String imieSyna = reader.readLine();
        Kot syn = new Kot(imieSyna,matka,ojciec);

        String imieCorki = reader.readLine();
        Kot corka = new Kot(imieCorki,matka,ojciec);




        System.out.println(dziadek);
       System.out.println(babcia);
        System.out.println(ojciec);
        System.out.println(matka);
        System.out.println(syn);
        System.out.println(corka);
    }

    public static class Kot
    {
        private String imie;
        private Kot matka;
        private Kot ojciec;

        Kot(String imie) {

            this.imie = imie;
            this.ojciec = null;
            this.matka = null;
        }


        Kot(String imie,Kot matka, Kot ojciec)
        {
            this.imie = imie;
            this.ojciec = ojciec;
            this.matka = matka;
        }

        @Override
        public String toString()
        {
            if (matka == null&&ojciec==null) {
                return "Imię kota to " + imie + ", brak matki"+ ", brak ojca ";
            }
            else if(ojciec==null)
            {
                return "Imię kota to " + imie + ", " + matka.imie + " to matka"+ ", brak ojca ";
            }
            else if(matka==null)
            {

                return "Imię kota to " + imie + ", brak matki, " + ojciec.imie + " to ojciec";
            }
            else
                return "Imię kota to " + imie + ", " + matka.imie + " to matka, "+ ojciec.imie + " to ojciec";
        }
    }
}
