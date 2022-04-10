package pl.codegym.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Ruszamy na cały kraj
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        String ss="";


        char[] h = s.toCharArray();

        h[0]=Character.toUpperCase(h[0]);
        ss=ss+h[0];
        for(int i = 1; i<s.length();i++)
        {
            if(h[i-1]==' ')
            {
                h[i]=Character.toUpperCase(h[i]);
            }
            ss=ss+h[i];
        }


        System.out.println(ss);
    }
}
