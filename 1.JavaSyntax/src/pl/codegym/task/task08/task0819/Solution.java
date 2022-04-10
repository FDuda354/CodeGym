package pl.codegym.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Koci Set
*/

public class Solution {

    public static class Kot
    {

    }
    public static void main(String[] args) {
        Set<Kot> koty = utworzKoty();

        //tutaj wpisz swój kod. krok 3
        Iterator<Kot> iterator = koty.iterator();

        koty.remove(iterator.next());

        printKoty(koty);
    }

    public static Set<Kot> utworzKoty() {
        //tutaj wpisz swój kod. krok 2
        HashSet<Kot> set = new HashSet<Kot>() ;

        set.add(new Kot());
        set.add(new Kot());
        set.add(new Kot());

        return set;
    }

    public static void printKoty(Set<Kot> koty) {

        Iterator<Kot> iterator = koty.iterator();

        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        // krok 4
    }

    // krok 1
}
