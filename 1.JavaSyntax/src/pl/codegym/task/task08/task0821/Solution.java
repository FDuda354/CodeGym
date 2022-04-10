package pl.codegym.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Współdzielone nazwiska i imiona
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> mapa = utworzMapLudzi();
        printMapLudzi(mapa);
    }

    public static Map<String, String> utworzMapLudzi() {
        //tutaj wpisz swój kod
        HashMap<String,String> mapa = new HashMap<String ,String>();
        mapa.put("Smith", "Christopher");
        mapa.put("Johnson", "Daniel");
        mapa.put("Williams", "Daniel");
        mapa.put("Jones", "Christopher");
        mapa.put("Brown", "Christopher");
        mapa.put("Johnson", "Jason");
        mapa.put("Johnson", "Jason");
        mapa.put("Williams", "Christopher");
        mapa.put("Williams", "Christopher");
        mapa.put("Williams", "Jason");



        return mapa;
    }

    public static void printMapLudzi(Map<String, String> mapa) {
        for (Map.Entry<String, String> s : mapa.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
