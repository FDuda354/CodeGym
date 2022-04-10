package pl.codegym.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Aktualizacja oprogramowania
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Lista adresów
        HashMap<String,String> map = new HashMap<String,String>();
        while (true) {
            String miasto = reader.readLine();
            if (miasto.isEmpty()) {
                break;
            }
            String rodzina = reader.readLine();

            map.put(rodzina,miasto);

        }

        // Wczytuje numer domu
        String miasto2  = reader.readLine();

      for(Map.Entry<String,String> m : map.entrySet())
      {
          if(miasto2.equals(m.getValue()))
              System.out.println(m.getKey());
      }
    }
}
