package pl.codegym.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Bank-świnka na bazie konsoli
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
         int sum =0;
         String a;

         a = buffer.readLine();
         int l;

        while(!a.equals("sumuj"))
        {
            l = Integer.parseInt(a);

            sum+=l;
            a = buffer.readLine();
        }
        System.out.println(sum);
    }
}
