package pl.codegym.task.task19.task1923;

/* 
Słowa z liczbami
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        //String file1;
       // String file2;



//       try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)))
//       {
//           file1 = reader.readLine();
//           file2 = reader.readLine();
//        }

        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]));
             BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]))) {

            while (reader.ready()) {

                String line = reader.readLine();

                String[] words = line.split(" ");

                for (String word : words)
                {
                    if(!word.replaceAll("(\\D+)","").equals(""))
                    {
                        writer.write(word+" ");
                    }
                }
            }


        }catch (Exception e)
        {

        }
    }
}
