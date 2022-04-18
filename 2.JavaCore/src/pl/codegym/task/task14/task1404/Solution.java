package pl.codegym.task.task14.task1404;

/* 
Koty
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;

        LinkedList<String> list = new LinkedList<String>();
        while (true)
        {
            s = reader.readLine();
            if(s.equals(""))
                break;
            list.add(CatFactory.getCatByKey(s).toString());

        }

        for(String el:list)
            System.out.println(el);
    }

    static class CatFactory {
        static Cat getCatByKey(String key) {
            Cat cat = switch (key) {
                case "dziki" -> new MeanCat("Pazur");
                case "mańka" -> new NiceCat("Mania");
                case "kafel" -> new NiceCat("Kafelek");
                default -> new Cat(key);
            };
            return cat;
        }
    }

    static class Cat {
        private String name;

        protected Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public String toString() {
            return "Jestem " + getName() + ", podwórkowy kocur";
        }
    }

    static class MeanCat extends Cat {
        MeanCat(String name) {
            super(name);
        }

        public String toString() {
            return "Jestem " + getName() + ", zaraz wydrapię Ci oczy";
        }
    }

    static class NiceCat extends Cat {
        NiceCat(String name) {
            super(name);
        }

        public String toString() {
            return "Jestem miłą kotką o imieniu " + getName();
        }
    }
}
