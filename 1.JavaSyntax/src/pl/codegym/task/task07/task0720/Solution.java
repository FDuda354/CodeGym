package pl.codegym.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Przestawiono w samą porę
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> lista = new ArrayList<String>();

        int N,M;
        N=Integer.parseInt(reader.readLine());
        M=Integer.parseInt(reader.readLine());
        for(int i = 0; i<N;i++)
            lista.add(reader.readLine());
        for(int i = 0; i<M;i++)
            lista.add(lista.remove(0));
        for(String element:lista)
            System.out.println(element);


        //tutaj wpisz swój kod
    }
}
