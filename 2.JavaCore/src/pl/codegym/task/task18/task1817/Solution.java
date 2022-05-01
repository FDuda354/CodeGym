package pl.codegym.task.task18.task1817;

/* 
Spacje
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {

    private static float n1 = 0f;
    private static float n2 = 0f;

    public static void main(String[] args) throws IOException {

        FileInputStream inputStream = new FileInputStream(args[0]);

        while (inputStream.available()>0)
        {
            if(inputStream.read()==32)
                n2++;

                n1++;


        }

        float st = n2 / n1 * 100;
        st = (float) Math.round(st * 100) / 100;
        inputStream.close();
        System.out.println(st);

    }
}
