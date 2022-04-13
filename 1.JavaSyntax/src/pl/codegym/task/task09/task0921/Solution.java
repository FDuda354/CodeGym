package pl.codegym.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Metoda w try-catch
*/

public class Solution {
    public static void main(String[] args)
    {
        czytajDane();
    }

    public static void czytajDane()
    {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> lista = new ArrayList<Integer>();
        try
        {
            while (true)
            {
                lista.add(Integer.parseInt(reader.readLine()));
            }

        }
        catch (IOException | NumberFormatException ignore)
        {
            for(int numer :lista)
                System.out.println(numer);
        }


    }
}
