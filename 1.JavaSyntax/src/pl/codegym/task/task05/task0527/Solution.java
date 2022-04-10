package pl.codegym.task.task05.task0527;

/* 
Tom i Jerry
*/

public class Solution {
    public static void main(String[] args) {
        Mysz jerryMysz = new Mysz("Jerry", 12, 5);
        Kot TomKot = new Kot("Tom",1,2);
        Pies p1 = new Pies("huj",2,2);

        //tutaj wpisz swój kod
    }
    public static class Pies
    {
        String imie;
        int wzrost;
        int ogon;

        public Pies(String imie,int wzrost,int ogon)
        {
            this.imie = imie;
            this.wzrost = wzrost;
            this.ogon = ogon;
        }
    }
    public static class Kot
    {
        String imie;
        int wzrost;
        int ogon;

        public Kot(String imie,int wzrost,int ogon)
        {
            this.imie = imie;
            this.wzrost = wzrost;
            this.ogon = ogon;
        }
    }
    public static class Mysz {

        String imie;
        int wzrost;
        int ogon;

        public Mysz(String imie, int wzrost, int ogon) {
            this.imie = imie;
            this.wzrost = wzrost;
            this.ogon = ogon;
        }
    }

    //tutaj wpisz swój kod
}
