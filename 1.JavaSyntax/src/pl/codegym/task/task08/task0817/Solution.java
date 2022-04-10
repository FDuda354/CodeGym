package pl.codegym.task.task08.task0817;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* 
Powtórzenia nie są potrzebne
*/

public class Solution {
    public static HashMap<String, String> utworzMap() {
        //tutaj wpisz swój kod
        HashMap<String, String> mapa = new HashMap<>();
        mapa.put("Stallone", "Sylvester");
        mapa.put("Stallone2", "Bruce");
        mapa.put("Stallone3", "Arnold");
        mapa.put("Schwarzenegger", "Sylvester");
        mapa.put("Schwarzenegger2", "Bruce");
        mapa.put("Schwarzenegger3", "Arnold");
        mapa.put("Willis", "Sylvester");
        mapa.put("Willis2", "Bruce");
        mapa.put("Willis3", "Arnold");
        mapa.put("Stallone4", "Sylvester4");
        return mapa;
    }

    public static void usunPowtorzoneImiona(Map<String, String> mapa) {
        //tutaj wpisz swój kod

        HashSet<String> set = new HashSet<String>();

       Iterator<Map.Entry<String,String>> iterator = mapa.entrySet().iterator();

       while (iterator.hasNext())
       {
           String s =iterator.next().getValue();
           if(set.contains(s))
           {
               iterator.remove();
           }
           else
               set.add(s);
       }


    }



    public static void main(String[] args) {

        HashMap<String, String> mapa = utworzMap();
        usunPowtorzoneImiona(mapa);

        System.out.println(mapa.toString());

    }
}
