package pl.codegym.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Maksimum w tablicy
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] tablica = inicjalizujTablice();
        int max = max(tablica);
        System.out.println(max);
    }

    public static int[] inicjalizujTablice() throws IOException {
        // Tworzy i zapełnia tablicę
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int[] a = new int[20];
        
        for(int i = 0; i<20; i++)
        {
            a[i]= Integer.parseInt(reader.readLine());
            
        }
        return a;
    }

    public static int max(int[] tablica) {
        // Znajduje maksimum

        int ma = tablica[0];

        int d = tablica.length;

        for(int i = 1;i<d;i++)
            if(tablica[i]>ma)
                ma=tablica[i];

        return ma;
    }
}
