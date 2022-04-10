package pl.codegym.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Samotne tablice oddziałują na siebie
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] s = new String[10];

        int[] a =  {0,1,2,3,4,5,6,7,8,9};

        for(int i = 0; i < 9; i++)
        {
            s[a[i]]= reader.readLine();
            System.out.println(s[a[i]]);
        }



    }
}
