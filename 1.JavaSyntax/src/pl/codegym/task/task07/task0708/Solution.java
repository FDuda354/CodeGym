package pl.codegym.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Najdłuższy ciąg
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<>();
        int max=0;

        for (int i = 0; i <5; i++)
        {
            strings.add(reader.readLine());
            if(i==0)
                max= strings.get(i).length();

            else if((strings.get(i).length())>max)
            {
                max= strings.get(i).length();


            }

        }
        for (int i = 0; i <5; i++)
        {

            if((strings.get(i).length())==max)
            {
                System.out.println(strings.get(i));
            }


        }






    }
}
