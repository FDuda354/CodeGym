package pl.codegym.task.task18.task1808;

/* 
Dzielenie pliku
*/

import java.io.*;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();

        FileInputStream inputStream = new FileInputStream(file1);
        FileOutputStream outputStream1 = new FileOutputStream(file2);
        FileOutputStream outputStream2 = new FileOutputStream(file3);

        if (inputStream.available() > 0) {

            byte[] buffer = new byte[inputStream.available()];

            if(inputStream.read(buffer)%2==0)
            {
                outputStream1.write(buffer, 0, inputStream.read(buffer)/2);
                outputStream2.write(buffer, inputStream.read(buffer)/2, inputStream.read(buffer));
            }
            else
            {
                outputStream1.write(buffer, 0, inputStream.read(buffer)/2+1);
                outputStream2.write(buffer, inputStream.read(buffer)/2+1, inputStream.read(buffer));
            }

        }

        reader.close();
        inputStream.close();
        outputStream1.close();
        outputStream2.close();

    }
}
