package pl.codegym.task.task08.task0803;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
HashMap kotów
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] koty = new String[]{"Tygrysek", "Mania", "Odlot", "Marmolada", "Oskar", "Śnieżek", "Szefu", "Kafel", "Max", "Simba"};




        HashMap<String, Kot> mapa = dodajKotyDoMap(koty);

        Iterator<Map.Entry<String,Kot>> iterator = mapa.entrySet().iterator();
        while (iterator.hasNext())
        {
            Map.Entry<String,Kot> para = iterator.next();
            System.out.println(para.getKey() + " - " + para.getValue());
        }
    }


    public static HashMap<String, Kot> dodajKotyDoMap(String[] koty)
    {
        //tutaj wpisz swój kod

        HashMap<String,Kot> map = new HashMap<String,Kot>();
        for(int i = 0 ; i< koty.length;i++)
        {
            Kot kotek = new Kot(koty[i]);


            map.put(koty[i],kotek);
        }


        return map;

    }


    public static class Kot {
        String imie;

        public Kot(String imie) {
            this.imie = imie;
        }

        @Override
        public String toString() {
            return imie != null ? imie.toUpperCase() : null;
        }
    }
}
