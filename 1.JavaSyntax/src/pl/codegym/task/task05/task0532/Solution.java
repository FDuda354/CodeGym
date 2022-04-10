package pl.codegym.task.task05.task0532;

import java.io.*;

/* 
Zadanie z algorytmami
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N =Integer.parseInt(reader.readLine());
        if(N<1)
            return;

        int []a = new int[N];
        for(int i = 0; i<N;i++)
        {
            a[i] = Integer.parseInt(reader.readLine());
        }
        //tutaj wpisz swój kod
        int maksimum = a[0];

        for(int i = 1; i<N;i++)
        {
            if(a[i]>maksimum ) maksimum  = a[i];
        }

        System.out.println(maksimum);
    }




}
