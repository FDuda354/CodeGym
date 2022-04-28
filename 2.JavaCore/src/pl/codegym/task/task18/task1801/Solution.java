package pl.codegym.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

/* 
Maksymalna liczba bajtów
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        int max =0;
        FileInputStream fileInputStream = new FileInputStream(fileName);

        if(fileInputStream.available()>0)
         max = fileInputStream.read();
        int bait = 0;
        while(fileInputStream.available()>0)
        {
            bait = fileInputStream.read();
            if(bait>max)
                max=bait;
        }
        System.out.println(max);

        fileInputStream.close();
        reader.close();
    }
}
