package pl.codegym.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Wprowadzenie do properties
*/

public class Solution {

    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() throws Exception {
        // Implementuj tę metodę
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)))
        {

            String filename = reader.readLine();

            FileInputStream in = new FileInputStream(filename);

            load(in);

        }
    }

    public void save(OutputStream outputStream) throws Exception {
        Properties pro = new Properties();
        for(String key : properties.keySet()) {

            pro.put(key,properties.get(key));
        }
        pro.store(outputStream,null);

    }

    public void load(InputStream inputStream) throws Exception {

        Properties pro = new Properties();
        pro.load(inputStream);

        for(Object key : pro.keySet()) {
            properties.put(key.toString(),pro.getProperty(key.toString()).toString());
        }
    }

    public static void main(String[] args) {

    }
}
