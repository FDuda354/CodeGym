package pl.codegym.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/*
Liczba liter
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String abc = "abcdefghijklmnoprstuwyz";
        char[] abcTablica = abc.toCharArray();

        HashMap<Character,Integer> map = new HashMap<Character,Integer>();





        for (int i = 0; i < 10; i++)
        {
            String s = reader.readLine();
            char[]  word = s.toLowerCase().toCharArray();


            for (int j = 0; j <s.length(); j++)
               map.put(word[j],map.getOrDefault(word[j], 0)+1);


        }

        for (Map.Entry<Character, Integer> para : map.entrySet()) {
            System.out.println(para.getKey() + " " + para.getValue());
        }


        // tutaj wpisz swój kod
    }

}
