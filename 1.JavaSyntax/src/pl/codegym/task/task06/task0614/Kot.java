package pl.codegym.task.task06.task0614;

import java.util.ArrayList;

/* 
Statyczne koty
*/

public class Kot {
    //tutaj wpisz swój kod

    public static ArrayList<Kot> koty  = new ArrayList<Kot>();



    public static void main(String[] args) {
        //tutaj wpisz swój kod

        for(int i = 0 ; i<10; i++)
            koty .add(new Kot());

        printKoty();
    }

    public static void printKoty() {
        //tutaj wpisz swój kod
        for ( Kot kotek : koty )
            System.out.println(kotek);
    }
}
