package pl.codegym.task.task18.task1827;

/* 
Ceny
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName = reader.readLine();

        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

        if(args[0].equals("-u"))
        {
            writer.write(""+12345678+args[1]+args[2]+args[3]);
        }
    }
}
