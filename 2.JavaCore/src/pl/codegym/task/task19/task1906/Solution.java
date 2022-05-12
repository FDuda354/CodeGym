package pl.codegym.task.task19.task1906;

/* 
Znaki parzyste
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileReader fileReader = new FileReader(reader.readLine());
        FileWriter fileWriter = new FileWriter(reader.readLine());

        int counter = 1;

        while (fileReader.ready())
        {
            int data = fileReader.read();

            if((counter++)%2 == 0)
                fileWriter.write(data);

        }

        fileReader.close();
        fileWriter.close();
        reader.close();
    }
}
