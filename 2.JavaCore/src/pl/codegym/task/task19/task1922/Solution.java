package pl.codegym.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Wyszukiwanie właściwych linii
*/

public class Solution {
    public static List<String> words = new ArrayList<>();

    static {
        words.add("file");
        words.add("view");
        words.add("In");
    }

    public static void main(String[] args)throws IOException {

        String file;

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)))
        {
            file = reader.readLine();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

            while (reader.ready()) {

                String line = reader.readLine();

                String[] slowa = line.split(" ");

                int count =0;

                for (String word : slowa)
                {
                    if (words.contains(word))
                    count++;
                }

                if(count==2)
                    System.out.println(line);



            }


        }

    }
}
