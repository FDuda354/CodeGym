package pl.codegym.task.task05.task0502;

/* 
Zaimplementuj metodę walka
*/

public class Kot {

    public int wiek;
    public int waga;
    public int sila;

    public Kot() {
    }

    public boolean walka(Kot innyKot) {
        //tutaj wpisz swój kod
        int w1=0,w2=0;
        if(this.wiek>innyKot.wiek)
            w2++;
        else if(this.wiek<innyKot.wiek)
            w1++;
        if(this.waga>innyKot.waga)
            w1++;
        else if(this.waga<innyKot.waga)
            w2++;
        if(this.sila>innyKot.sila)
            w1++;
        else if(this.sila<innyKot.sila)
            w2++;

        if(w1>w2)
            return true;
        else
            return false;


    }

    public static void main(String[] args) {

    }
}
