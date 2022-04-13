package pl.codegym.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Dziesięć kotów
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Kot> mapa = utworzMap();
        Set<Kot> set = konwertujMapDoSet(mapa);
        printSetKotow(set);
    }

    public static Map<String, Kot> utworzMap()
    {
        //tutaj wpisz swój kod

        HashMap<String,Kot> map = new HashMap<String,Kot>();
        map.put("kot1",new Kot("kot1"));
        map.put("kot2",new Kot("kot2"));
        map.put("kot3",new Kot("kot3"));
        map.put("kot4",new Kot("kot4"));
        map.put("kot5",new Kot("kot5"));
        map.put("kot6",new Kot("kot6"));
        map.put("kot7",new Kot("kot7"));
        map.put("kot8",new Kot("kot8"));
        map.put("kot9",new Kot("kot9"));
        map.put("kot10",new Kot("kot10"));

        return map;
    }

    public static Set<Kot> konwertujMapDoSet(Map<String, Kot> mapa) {
        //tutaj wpisz swój kod
        HashSet<Kot> set = new HashSet<Kot>(mapa.values());

        return set;
    }

    public static void printSetKotow(Set<Kot> set) {
        for (Kot kot : set) {
            System.out.println(kot);
        }
    }

    public static class Kot {
        private String imie;

        public Kot(String imie) {
            this.imie = imie;
        }

        public String toString() {
            return "Kot " + this.imie;
        }
    }


}
