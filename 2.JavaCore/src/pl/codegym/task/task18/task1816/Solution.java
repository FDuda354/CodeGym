package pl.codegym.task.task18.task1816;

/* 
ABC
*/

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;

public class Solution {

    private final static HashSet<Character> ENGLISH_CHARACTERS_ARRAY = new HashSet<Character>(Arrays.asList('A','B','C','D','E','F','G','H','I','J','K','L'
            ,'M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m'
            ,'n','o','p','q','r','s','t','u','v','w','x','y','z'));

    private static int counter = 0;
    public static void main(String[] args) throws IOException {

       FileInputStream inputStream = new FileInputStream(args[0]);

        //System.out.println(ENGLISH_CHARACTERS_ARRAY);

        while (inputStream.available() > 0) {

            if(ENGLISH_CHARACTERS_ARRAY.contains((char)inputStream.read()))
                counter++;

        }

        inputStream.close();
        System.out.println(counter);



    }
}
