package pl.codegym.task.task13.task1318;

import java.io.*;


/*
Wczytywanie pliku
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        // tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName = reader.readLine();


        BufferedReader readerF = new BufferedReader(new FileReader(fileName));

        while (readerF.ready())
            System.out.println(readerF.readLine());

        reader.close();
    }

}

// nazwa pluku: PlikToTask1318.txt