package pl.codegym.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Poprawianie funkcjonalności
*/

public class Solution {

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int []a = new int[5];
        for(int i = 0; i<5;i++)
        {
             a[i] = Integer.parseInt(reader.readLine());
        }



        int minimum = min(a);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a[])
    {
        int min = a[0];
        for(int i = 1; i<5;i++)
        {
            if(a[i]<min) min = a[i];
        }
        return min;
    }
}
