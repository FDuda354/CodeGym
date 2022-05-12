package pl.codegym.task.task19.task1909;

/* 
Zmiana znaków interpunkcyjnych
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        String inputFileName;
        String outputFileName;

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)))
        {
             inputFileName = reader.readLine();
             outputFileName = reader.readLine();
        }




       try(BufferedWriter writter = new BufferedWriter(new FileWriter(outputFileName));
           BufferedReader reader = new BufferedReader(new FileReader(inputFileName)))
       {
           while (reader.ready())
           {
               writter.write(reader.readLine().replaceAll("\\.","!"));
               writter.newLine();


           }
       }




    }
}
