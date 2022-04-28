package pl.codegym.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collectors;

/* 
Najczęściej występujące bajty
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(fileName);
        HashMap<Integer,Integer> map = new HashMap<>();

        while(fileInputStream.available()>0)
        {
            Integer bait =fileInputStream.read();
           map.put(bait, map.getOrDefault(bait,0)+1);
        }



        int max=0;

        for(Integer key: map.keySet())
        {
            if(map.get(key)>max)
                max=map.get(key);
        }


        for (Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            if(entry.getKey()==max)
                System.out.print(entry.getValue()+" ");
        }


        fileInputStream.close();
        reader.close();
    }
}
