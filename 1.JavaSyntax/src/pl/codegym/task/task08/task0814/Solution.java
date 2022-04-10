package pl.codegym.task.task08.task0814;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* 
Większa niż 10? Wcale do nas nie pasujesz!
*/

public class Solution {
    public static HashSet<Integer> utworzSet()
    {
        // tutaj wpisz swój kod
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(16);
        set.add(26);
        set.add(3);
        set.add(46);
        set.add(56);
        set.add(66);
        set.add(76);
        set.add(86);
        set.add(10);
        set.add(6);
        set.add(17);
        set.add(27);
        set.add(37);
        set.add(47);
        set.add(57);
        set.add(67);
        set.add(77);
        set.add(87);
        set.add(97);
        set.add(7);
        return set;

    }

    public static HashSet<Integer> usunLiczbyWiekszeNiz10(HashSet<Integer> set) {
        // tutaj wpisz swój kod

        set.removeIf(x -> x > 10);

        return set;
    }

    public static void main(String[] args)
    {


    }

}

