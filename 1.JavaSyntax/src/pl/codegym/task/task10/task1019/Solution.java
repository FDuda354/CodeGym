package pl.codegym.task.task10.task1019;

import java.io.*;
import java.util.*;

/* 
Funkcjonalność to nie wszystko!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        Integer id;
        HashMap<String,Integer> map = new HashMap<>();



        while (true)
        {
            id  = Integer.parseInt(reader.readLine());

            s = reader.readLine();

            map.put(s.isEmpty()?"":s,id);

            if(s.isEmpty())
                break;
        }

      Iterator<Map.Entry<String,Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            Map.Entry<String,Integer> par = iterator.next();

            System.out.println(par.getValue()+ " "+ par.getKey());

        }





    }
}
