package pl.codegym.task.task19.task1925;

/* 
Long words
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {



        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]));
             BufferedWriter writer = new BufferedWriter(new FileWriter(args[1])))
             {

                     String[] words;
                     ArrayList<String> list = new ArrayList<>();
                     while (reader.ready()) {

                         String line = reader.readLine();

                         words = line.split(" ");

                         for (int i = 0; i < words.length; i++)
                             if (words[i].length() > 5)
                                 list.add(words[i]);


                         writer.write(String.join(",", list));

                     }

                     // String s = String.join(",",list);

                     //  System.out.print(s);

             }catch (Exception e)
        {

        }
}
}
