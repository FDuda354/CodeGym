package pl.codegym.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Koniec
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> lista = new ArrayList<String >();

       while(true)
       {
           String s = reader.readLine();
           if(s.equals("koniec"))
               break;

           lista.add(s);
       }

       for(String el:lista)
           System.out.println(el);
        //tutaj wpisz swój kod
    }
}