package pl.codegym.task.task04.task0417;

/* 
Masz parę?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod

        BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(cin.readLine());
        int b = Integer.parseInt(cin.readLine());
        int c = Integer.parseInt(cin.readLine());

        if (a==b&&b==c)
            System.out.println(a+" "+b+" "+c);
        else if (a==c)
            System.out.println(a+" "+c);
        else if (a==b)
            System.out.println(a+" "+b);
        else if (c==b)
            System.out.println(c+" "+b);
        else if (c==a)
            System.out.println(c+" "+a);
    }
}