package pl.codegym.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Najdłuższa sekwencja
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //tutaj wpisz swój kod
        ArrayList<Integer> list = new ArrayList<Integer>() ;

        int c =1;
        int max=1;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));

            if(i>0)
            {
                if(list.get(i).equals(list.get(i-1)))
                {
                    max++;
                }
                if(max>c)
                    c=max;
                else
                    max=1;


            }
        }

        if(max>c)
        System.out.println(max);
        else
            System.out.println(c);
    }
}
