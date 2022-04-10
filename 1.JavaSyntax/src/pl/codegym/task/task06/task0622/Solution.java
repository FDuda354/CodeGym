package pl.codegym.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* 
Liczby w kolejności rosnącej
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> a = new ArrayList<Integer>();

        for(int i = 0; i<5; i++)
        {
            a.add(Integer.parseInt(reader.readLine()));
        }

        Collections.sort(a);
        //tutaj wpisz swój kod

        for(Integer inta:a)
        {
            System.out.println(inta);
        }
    }
}
