package pl.codegym.task.task08.task0820;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Zwierzęcy secik
*/

public class Solution {
    public static void main(String[] args) {
        Set<Kot> koty = utworzKoty();
        Set<Pies> psy = utworzPsy();

        Set<Object> zwierzeta = dolacz(koty, psy);
        printZwierzeta(zwierzeta);

        usunKoty(zwierzeta, koty);
        printZwierzeta(zwierzeta);
    }

    public static Set<Kot> utworzKoty() {
        HashSet<Kot> wynik = new HashSet<Kot>();

        //tutaj wpisz swój kod
        wynik.add(new Kot());
        wynik.add(new Kot());
        wynik.add(new Kot());
        wynik.add(new Kot());

        return wynik;
    }

    public static Set<Pies> utworzPsy() {
        //tutaj wpisz swój kod
        HashSet<Pies> set = new HashSet<Pies>();
        set.add(new Pies());
        set.add(new Pies());
        set.add(new Pies());

        return set;
    }

    public static Set<Object> dolacz(Set<Kot> koty, Set<Pies> psy) {
        //tutaj wpisz swój kod

        HashSet<Object> set = new HashSet<Object>();
        set.addAll(koty);
        set.addAll(psy);

        return set;
    }

    public static void usunKoty(Set<Object> zwierzeta, Set<Kot> koty) {

        zwierzeta.removeAll(koty);
        //tutaj wpisz swój kod
    }

    public static void printZwierzeta(Set<Object> zwierzeta) {

        Iterator<Object> iterator = zwierzeta.iterator();

        while (iterator.hasNext())
            System.out.println(iterator.next());
        //tutaj wpisz swój kod
    }

    //tutaj wpisz swój kod
    public static class Kot
    {

    }
    public static class Pies
    {

    }
}
