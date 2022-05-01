package pl.codegym.task.task18.task1825;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/* 
Tworzenie pliku
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String fileName = reader.readLine();
            if(fileName.equals("end"))
                break;

            FileInputStream inputStream = new FileInputStream(fileName);

            byte[] buffer = new byte[inputStream.available()];
            while (inputStream.available() > 0)
            {

                int count = inputStream.read(buffer);

            }
        }

    }
}
