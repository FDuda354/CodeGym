package pl.codegym.task.task18.task1810;

/* 
DownloadException
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true)
        {
            String file1 = reader.readLine();

            FileInputStream inputStream = new FileInputStream(file1);

            if(inputStream.available()<1000)
            {
                inputStream.close();
                reader.close();

                throw new DownloadException();

            }

        }

    }

    public static class DownloadException extends Exception {


    }
}
