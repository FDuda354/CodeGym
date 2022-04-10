package pl.codegym.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Mów zwięźle
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();
        int max=0;

        for (int i = 0; i <5; i++)
        {
            strings.add(reader.readLine());
            if(i==0)
                max= strings.get(i).length();

            else if((strings.get(i).length())<max)
            {
                max= strings.get(i).length();


            }

        }
        for(String element : strings)
            if(element.length()==max)
                System.out.println(element);
    }
}
