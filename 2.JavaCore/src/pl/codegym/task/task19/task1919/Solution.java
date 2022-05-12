package pl.codegym.task.task19.task1919;

/* 
Obliczanie wynagrodzeń
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {

        String file;

        TreeMap<String ,Double> map = new TreeMap<>();


        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)))
        {
            file = reader.readLine();
        }

        try(BufferedReader reader = new BufferedReader(new FileReader(file)))
        {
           while (reader.ready())
           {
               String[] line = reader.readLine().split(" ");

               map.put(line[0], map.getOrDefault(line[0],0D)+Double.parseDouble(line[1]));
           }
        }

       map.entrySet().stream()
               .map(Map.Entry::getKey)
               .forEach(System.out::println);


    }
}
