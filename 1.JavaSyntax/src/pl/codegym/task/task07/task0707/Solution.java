package pl.codegym.task.task07.task0707;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Co to za rodzaj listy?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod

        ArrayList<String> s = new ArrayList<String>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i <5; i++)
        {
            s.add(reader.readLine());

            System.out.println(s.get(i));
        }
    }
}
