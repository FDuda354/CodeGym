package pl.codegym.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/* 
Sortowanie bajtów
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(fileName);
        HashSet<Integer> set = new HashSet<>();

        while(fileInputStream.available()>0)
        {
           set.add(fileInputStream.read());
        }
        ArrayList<Integer> list = new ArrayList<>(set);

        Collections.sort(list);

        for(Integer element : list)
            System.out.print(element+" ");

        fileInputStream.close();
        reader.close();
    }
}
