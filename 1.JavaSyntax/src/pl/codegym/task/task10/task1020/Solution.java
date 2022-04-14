package pl.codegym.task.task10.task1020;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Zadanie z algorytmami
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer[] tablica = new Integer[30];
        for (int i = 0; i < 30; i++) {
            tablica[i] = Integer.parseInt(reader.readLine());
        }

        sortuj(tablica);


       System.out.println(tablica[9]);
       System.out.println(tablica[10]);
    }

    public static void sortuj(Integer[] tablica) {
        //tutaj wpisz swój kod
       Arrays.sort(tablica);
    }
}
