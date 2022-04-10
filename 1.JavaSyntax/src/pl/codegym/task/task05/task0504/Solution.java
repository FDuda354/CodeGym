package pl.codegym.task.task05.task0504;

/* 
Trzej Muszkoterowie
*/

public class Solution
{
    public static void main(String[] args)
    {
        //tutaj wpisz swój kot
        Kot kot1 = new Kot("Puszedk",2,2,2);
        Kot kot2 = new Kot("Pus2zek",2,2,2);
        Kot kot3 = new Kot("Puszesk",2,2,2);

    }

    public static class Kot
    {
        public String imie;
        protected int wiek;
        int waga;
        private int sila;

        public Kot(String imie, int wiek, int waga, int sila)
        {
            this.imie = imie;
            this.wiek = wiek;
            this.waga = waga;
            this.sila = sila;
        }
    }
}