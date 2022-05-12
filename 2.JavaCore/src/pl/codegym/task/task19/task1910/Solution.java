package pl.codegym.task.task19.task1910;

/* 
Interpunkcja
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        try(BufferedReader readerr = new BufferedReader(new InputStreamReader(System.in)))
        {
            String  inputFileName = readerr.readLine();
            String  outputFileName = readerr.readLine();

            try(BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName)))
            {
                while (reader.ready())
                    writer.write(reader.readLine().replaceAll("\\p{P}", ""));

            }

        }


    }
}
