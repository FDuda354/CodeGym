package pl.codegym.task.task19.task1924;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* 
Zastępowanie liczb
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(12, "dwanaście");
        map.put(11, "jedenaście");
        map.put(10, "dziesięć");
        map.put(9, "dziewięć");
        map.put(8, "osiem");
        map.put(7, "siedem");
        map.put(6, "sześć");
        map.put(5, "pięć");
        map.put(4, "cztery");
        map.put(3, "trzy");
        map.put(2, "dwa");
        map.put(1, "jeden");
        map.put(0, "zero");
    }

    public static void main(String[] args) throws IOException {

        String file1;


       try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)))
       {
           file1 = reader.readLine();

       }
        try (BufferedReader reader = new BufferedReader(new FileReader(file1))) {

            while (reader.ready()) {

                String line = reader.readLine();
                for(Integer num: map.keySet())
               line = line.replaceAll("\\b"+ num +"\\b",map.get(num));
                System.out.println(line);


            }


        }

    }
}
