package pl.codegym.task.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Wyświetl liczby w odwrotnej kolejności
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> lista = new ArrayList<Integer>();

        for(int i = 0; i<10;i++)
            lista.add(Integer.parseInt(reader.readLine()));

        Collections.reverse(lista);

        for(Integer liczba:lista)
            System.out.println(liczba);


        //tutaj wpisz swój kod
    }
}
