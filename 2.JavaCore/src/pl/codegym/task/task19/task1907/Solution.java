package pl.codegym.task.task19.task1907;

/* 
Liczenie słów
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileReader fileReader = new FileReader(reader.readLine());

        StringBuilder sb = new StringBuilder();

        while (fileReader.ready()) {
            sb.append((char) fileReader.read());

        }

        String s = sb.toString().replaceAll("\\p{P}", " ").replaceAll("\\s", " ");
        String[] words = s.split(" ");

        int count = 0;

        for (String word : words) {


            if(word.equals("świat")) {
                count++;
            }
        }
        System.out.println(count);

        reader.close();
        fileReader.close();
    }
}
