package pl.codegym.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Więcej Ala ma kota
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        ArrayList<String> s = new ArrayList<String>();

        s.add("Ala");
        s.add("ma");
        s.add("kota");
        int d =s.size()*2;
        for(int i = 1; i<d ; i+=2)
            s.add(i,"As");
        for(String ss:s)
            System.out.println(ss);
    }
}
