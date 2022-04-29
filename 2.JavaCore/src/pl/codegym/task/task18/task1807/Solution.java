package pl.codegym.task.task18.task1807;

/* 
Liczenie przecinków
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(fileName);
        int counter = 0;

        while (fileInputStream.available()>0)
        {
            if(fileInputStream.read()==44)
                counter++;
        }
        System.out.println(counter);

        fileInputStream.close();
        reader.close();
    }
}
