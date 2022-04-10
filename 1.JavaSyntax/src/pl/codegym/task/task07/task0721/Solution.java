package pl.codegym.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Minimum i maksimum w tablicach
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maksimum;
        int minimum;

        int[] a = new int [20];
        a[0]= Integer.parseInt(reader.readLine());
        maksimum = a[0];
        minimum = a[0];

        for(int i = 1; i<20;i++)
        {
            a[i]= Integer.parseInt(reader.readLine());
            if(a[i]>maksimum)
                maksimum=a[i];
            else if(a[i]<minimum)
                minimum=a[i];
        }

        //tutaj wpisz swój kod

        System.out.print(maksimum + " " + minimum);
    }
}
