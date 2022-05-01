package pl.codegym.task.task18.task1822;

/* 
Wyszukiwanie danych wewnątrz pliku
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String file = reader.readLine();

        BufferedReader readerf1 = new BufferedReader(new FileReader(file));

        int id = Integer.parseInt(args[0]);


        while (readerf1.ready())
        {
            String[] data = readerf1.readLine().split(" ");
            if(Integer.parseInt(data[0])==id)
            {
                System.out.println(data[0]+" "+data[1]+" "+data[2]+" "+data[03]);
                break;
            }
        }

        reader.close();
        readerf1.close();



    }
}
