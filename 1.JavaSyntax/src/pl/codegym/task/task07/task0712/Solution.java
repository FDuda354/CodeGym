package pl.codegym.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Najkrótszy czy najdłuższy
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> s = new ArrayList<>();
        s.add(reader.readLine());
        int max= s.get(0).length(),min=s.get(0).length();
        int imax=0,imin=0;
        for (int i =1; i<10;i++)
        {
            s.add(reader.readLine());
            if(s.get(i).length()>max)
            {
                max=s.get(i).length();
                imax = i;
            }

            else if(s.get(i).length()<min)
            {
                min=s.get(i).length();
                imin = i;
            }


        }
        if(imin>imax)
            System.out.println(s.get(imax));
        else
            System.out.println(s.get(imin));




    }
}
