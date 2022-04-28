package pl.codegym.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Transakcyjność
*/

public class Solution {
    public static List<String> allLines = new ArrayList<>();
    public static List<String> linesForRemoval = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstFileName = reader.readLine();
        String secondFileName = reader.readLine();

        BufferedReader readerF = new BufferedReader(new FileReader(firstFileName));

        while (readerF.ready())
            allLines.add(readerF.readLine());

        BufferedReader readerSF = new BufferedReader(new FileReader(secondFileName));

        while (readerSF.ready())
            linesForRemoval.add(readerSF.readLine());


        new Solution().joinData();

        reader.close();
        readerF.close();
        readerSF.close();




    }

    public void joinData() throws CorruptedDataException {

        if(conatin(linesForRemoval))
        allLines.removeIf(line -> linesForRemoval.contains(line));
        else
        {
            allLines.clear();
            throw new CorruptedDataException();
        }

    }

    public boolean conatin( List<String> list)
    {
        for(String line: list)
        {
            if(!allLines.contains(line))
                return false;
        }
        return true;
    }
}
