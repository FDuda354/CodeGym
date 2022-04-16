package pl.codegym.task.task13.task1326;

/* 
Sortowanie liczb parzystych z pliku
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args) throws IOException
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        ArrayList<Integer> list = new ArrayList<Integer>();

        BufferedWriter writter = new BufferedWriter(new FileWriter("PlikToTask1318.txt"));
        BufferedReader readerf = new BufferedReader(new FileReader("test999.txt"));

        while (readerf.ready())
        {
            list.add(Integer.parseInt(readerf.readLine()));
        }

        Collections.sort(list);

        for(Integer element : list)
        {
            if(element%2==0)
            {
                writter.write(element.toString());
                writter.newLine();
            }

        }

        BufferedReader readerd = new BufferedReader(new FileReader("PlikToTask1318.txt"));


        writter.close();


        while (readerd.ready())
        {
            //System.out.println( readerd.read());
            System.out.println(readerd.readLine());
        }


        readerf.close();
        reader.close();
        readerd.close();


    }
}
