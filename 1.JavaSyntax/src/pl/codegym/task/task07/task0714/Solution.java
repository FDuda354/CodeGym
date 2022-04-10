package pl.codegym.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Słowa na odwrót
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        ArrayList<String> s = new ArrayList<>();
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++)
          s.add(reader.readLine());


        s.remove(2);

        Collections.reverse(s);

        for( String wyraz:s)
            System.out.println(wyraz);




    }
}


