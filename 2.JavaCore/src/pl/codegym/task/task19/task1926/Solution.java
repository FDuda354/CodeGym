package pl.codegym.task.task19.task1926;

/* 
Lustrzane odbicie
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        String file;
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)))
        {
             //file = reader.readLine();
        }
        try(BufferedReader reader = new BufferedReader(new FileReader("Plik111.txt")))
        {
            StringBuilder sb = new StringBuilder();
            ArrayList<Character> list = new ArrayList<>();
            while (reader.ready())
            {
                list.add((char)reader.read());

            }
            for(int i = list.size()-1; i>=0;i--)
            {
                System.out.print(list.get(i));
            }
        }
    }
}
