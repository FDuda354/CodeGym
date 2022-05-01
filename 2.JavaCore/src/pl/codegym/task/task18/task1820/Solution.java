package pl.codegym.task.task18.task1820;

/* 
Zaokrąglanie liczb
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String file1 = reader.readLine();
        String file2 = reader.readLine();

        BufferedReader readerf1 = new BufferedReader(new FileReader(file1));
        BufferedWriter writerf1 = new BufferedWriter(new FileWriter(file2));


            String[] values = readerf1.readLine().split(" ");

            for(String element: values)
            {
                double value = Double.parseDouble(element);
                long valuelong = Math.round(value);
                writerf1.write(""+valuelong+" " );
            }


    }
}
