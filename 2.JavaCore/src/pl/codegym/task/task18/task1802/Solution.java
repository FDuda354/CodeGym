package pl.codegym.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Minimalna liczba bajtów
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        int min =0;
        FileInputStream fileInputStream = new FileInputStream(fileName);

        if(fileInputStream.available()>0)
            min = fileInputStream.read();
        int bait = 0;
        while(fileInputStream.available()>0)
        {
            bait = fileInputStream.read();
            if(bait<min)
                min=bait;
        }
        System.out.println(min);

        fileInputStream.close();
        reader.close();
    }
}
