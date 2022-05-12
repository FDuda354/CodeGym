package pl.codegym.task.task19.task1920;

/* 
Najbogatszy
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class Solution
{
    public static void main(String[] args) throws IOException
    {

        String file= args[0];

        TreeMap<String, Double> map = new TreeMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while (reader.ready()) {
                String[] line = reader.readLine().split(" ");

                map.put(line[0], map.getOrDefault(line[0], 0D) + Double.parseDouble(line[1]));
            }
        }

       Double s = map.entrySet().stream()
                .max(Map.Entry.comparingByValue()).get().getValue();

        map.entrySet().stream()
                .filter(e -> Objects.equals(e.getValue(), s))
                .forEach(e -> System.out.println(e.getKey()));

    }
}
