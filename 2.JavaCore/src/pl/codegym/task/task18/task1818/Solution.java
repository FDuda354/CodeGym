package pl.codegym.task.task18.task1818;

/* 
Dwa w jednym
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();

        BufferedWriter writer = new BufferedWriter(new FileWriter(file1));

        BufferedReader readerf2 = new BufferedReader(new FileReader(file2));
        BufferedReader readerf3 = new BufferedReader(new FileReader(file3));


        while (readerf2.ready())
        {
            writer.write(readerf2.read());
        }
        while (readerf3.ready())
        {
            writer.write(readerf3.read());
        }

        reader.close();
        readerf2.close();
        readerf3.close();
        writer.close();

    }
}
