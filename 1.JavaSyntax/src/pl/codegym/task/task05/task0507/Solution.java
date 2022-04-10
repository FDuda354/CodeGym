package pl.codegym.task.task05.task0507;

/* 
Średnia arytmetyczna
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        float counter =-1.0f;
         float suma =0.0f;
        int a=0;
        do
        {
            suma+=a;
            a = Integer.parseInt(reader.readLine());
            counter++;



        }while(a!=-1);

        System.out.println(suma/counter);

    }
}

