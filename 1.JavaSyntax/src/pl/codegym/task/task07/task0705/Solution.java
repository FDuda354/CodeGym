package pl.codegym.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Jedna wielka tablica i dwie małe
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[20];
        int[] b = new int[10];
        int[] c = new int[10];

        for (int i = 0; i < 20; i++) {
            a[i] = Integer.parseInt(reader.readLine());

        }
        int d =10;
        for (int i = 0; i <d ;i++)
        {

            b[i]= a[i];
            c[i] = a[i+10];
        }

        for (int i = 0; i < d; i++) {


            System.out.println(c[i]);
        }



    }
}
