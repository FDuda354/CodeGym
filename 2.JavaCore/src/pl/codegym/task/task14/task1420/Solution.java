package pl.codegym.task.task14.task1420;

/* 
NWD
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        System.out.println(NWD(a,b));

    }

    public static int NWD(int a, int b)
    {
        if(a < 1 || b < 1) {
            throw new IllegalArgumentException();
        }
        while (a!=b)
            if(a>b)
                a-=b;
            else
                b-=a;


        return a;
    }
}
