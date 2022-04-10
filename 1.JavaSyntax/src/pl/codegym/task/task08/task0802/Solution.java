package pl.codegym.task.task08.task0802;

/* 
HashMap z 10 par
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod

        HashMap<String,String> map = new HashMap<String,String>();

        map.put("arbuz", "melon");
        map.put("banan", "owoc");
        map.put("wiśnia", "owoc");
        map.put("gruszka", "owoc");
        map.put("kantalupa", "melon");
        map.put("jeżyna", "owoc");
        map.put("żeńszeń", "korzeń");
        map.put("truskawka", "owoc");
        map.put("irys", "kwiat");
        map.put("ziemniak", "bulwa");

        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();



        while (iterator.hasNext())
        {
            Map.Entry<String,String> slowo = iterator.next();
            System.out.println(slowo.getKey()+" - "+ slowo.getValue());
        }

    }
}
