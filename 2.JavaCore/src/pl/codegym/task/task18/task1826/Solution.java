package pl.codegym.task.task18.task1826;

/* 
Szyfrowanie
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {

        if(args[0].equals("-e"))
        {
            FileInputStream inputStream = new FileInputStream(args[1]);
            FileOutputStream outputStream = new FileOutputStream(args[2]);

            while (inputStream.available()>0)
            {
                outputStream.write(inputStream.read()+23);
            }
            inputStream.close();
            outputStream.close();
        }
        else if(args[0].equals("-d"))
        {
            FileInputStream inputStream = new FileInputStream(args[1]);
            FileOutputStream outputStream = new FileOutputStream(args[2]);

            while (inputStream.available()>0)
            {
                outputStream.write(inputStream.read()-23);
            }
            inputStream.close();
            outputStream.close();
        }

    }

}
