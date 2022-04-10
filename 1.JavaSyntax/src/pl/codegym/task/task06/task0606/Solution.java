package pl.codegym.task.task06.task0606;

import java.io.*;

/* 
Cyfry parzyste i nieparzyste
*/

public class Solution {

    public static int parzyste=0;
    public static int nieparzyste=0;

    public static void main(String[] args) throws IOException {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());

        while (a!=0)
        {
            if ((a%10)%2==0)
                parzyste++;
            else
                nieparzyste++;
            a/=10;
        }
        System.out.println("Parzyste: " +parzyste+ " Nieparzyste: " + nieparzyste);

    }
}
