package pl.codegym.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Ulice i domy
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[15];

        int sumap = 0 , suman=0;

        for (int i = 0; i < 15; i++) {
            a[i] = Integer.parseInt(reader.readLine());

            if(i%2==0)
                sumap += a[i];
            else
                suman+= a[i];
        }
        if(sumap>suman)
            System.out.println("Więcej ludzi mieszka w domach o parzystych numerach.");
        else if (sumap<suman)
            System.out.println("Więcej ludzi mieszka w domach o nieparzystych numerach.");
    }

    public void Dijkstry()
    {

    }
}
