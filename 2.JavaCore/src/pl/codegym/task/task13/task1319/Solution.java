package pl.codegym.task.task13.task1319;

import java.io.*;



/* 
Zapisywanie do pliku z konsoli
*/

public class Solution {
    public static void main(String[] args) throws IOException
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName = reader.readLine();

        BufferedWriter writter = new BufferedWriter(new FileWriter(fileName)); // tworzymy writera i mowimy mu ze bedzie pisal w tym pliku

        String s;


while (!(s = reader.readLine()).equals("exit"))
        {
            writter.write(s);
            writter.newLine();
        }

       writter.close();

    }
}
