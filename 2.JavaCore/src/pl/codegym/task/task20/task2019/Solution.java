package pl.codegym.task.task20.task2019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Popraw błąd. Serializacja
*/

public class Solution implements Serializable {

    public static void main(String args[]) throws Exception {

        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("your.file.name"));

        Solution solution = new Solution();

        outputStream.writeObject(solution);

        outputStream.close();

        // Ładowanie

        ObjectInputStream objectStream = new ObjectInputStream(new FileInputStream("your.file.name"));

        Solution loadedObject = (Solution) objectStream.readObject();

        objectStream.close();

        // Uwaga!!
        System.out.println(loadedObject.size());
    }

    private Map<String, String> m = new HashMap<>();

    public Map<String, String> getMap() {
        return m;
    }

    public  Solution() {
        m.put("Mickey", "Mouse");
        m.put("Mickey", "Mantle");
    }

    public int size() {
        return this.m.size();
    }
}
