package pl.codegym.task.task19.task1908;

/*
Wybieranie numerów
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {

        String inputFileName;
        String outputFileName;

       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            inputFileName = reader.readLine();
            outputFileName = reader.readLine();

        BufferedReader fileReader = new BufferedReader(new FileReader(inputFileName));


        StringBuilder sb = new StringBuilder();

        while (fileReader.ready())
            sb.append((char) fileReader.read());

        String[] words = sb.toString().split(" ");
        fileReader.close();

        try(BufferedWriter writter = new BufferedWriter(new FileWriter(outputFileName)))
       {

            for (String word : words) {

                try
                {
                    int num = Integer.parseInt(word);
                    writter.write(word + " ");

                } catch (NumberFormatException e) {

                }
            }
        }

reader.close();

    }
}
