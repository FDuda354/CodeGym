package pl.codegym.task.task18.task1824;

/* 
Pliki i wyjątki
*/

import java.io.*;

public class Solution {

   private volatile String fileNem;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true)
        {
            String fileName = reader.readLine();

            try (FileInputStream fileInputStream = new FileInputStream(fileName))
            {

            }
            catch (FileNotFoundException e)
            {
                System.out.println(fileName);


                break;
            }

        }


    }

}