package pl.codegym.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Usuń i wstaw
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> s = new ArrayList<>();
        for (int i =0; i<5;i++)
        {
            s.add(reader.readLine());
        }
        for (int i =0; i<13;i++)
        {

            s.add(0,s.remove(4));



        }
        for(String se:s)
        {
            System.out.println(se);
        }
    }
}
