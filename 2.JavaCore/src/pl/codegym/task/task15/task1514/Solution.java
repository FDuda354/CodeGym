package pl.codegym.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Modyfikatory statyczne: część 1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<>();
    static
    {
        labels.put(1.2,"a");
        labels.put(1.22,"aa");
        labels.put(1.32,"as");
        labels.put(1.52,"ad");
        labels.put(1.62,"ac");
    }
    public static void main(String[] args) {
        System.out.println(labels);
    }
}
