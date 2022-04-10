package pl.codegym.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;


/* 
W kolejności malejącej
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] tablica = new int[20];
        for (int i = 0; i < 5; i++) {
            tablica[i] = Integer.parseInt(reader.readLine());
        }

        sortuj(tablica);

        for (int x : tablica) {
            System.out.println(x);
        }
    }

    public static void sortuj(int[] tablica) {
        //tutaj wpisz swój kod
        Arrays.sort(tablica);
        int dlugosc = tablica.length;
        //odwrócenie tablicy

        for (int i = 0; i < dlugosc/2; i++) {
            swap(tablica, tablica[i], tablica[dlugosc-i-1]);
        }



    }
    public static void swap(int[] tablica, int a, int b)
    {


        //zamiana miejscami

        int temp = a;
        a= b;
        b = temp;


    }
}
