package pl.codegym.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Wątki i bajty
*/

public class Solution {

    public static volatile Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true)
        {
            String s = reader.readLine();

            if(s.equals("exit"))
                break;

            new ReadThread(s).start();
        }
        reader.close();

    }

    public static class ReadThread extends Thread {
        private String fileName;
        private  int[] aSCII = new int[128];

        public ReadThread(String fileName) {
            this.fileName = fileName;
        }


        @Override
        public void run() {

            try {
                FileReader reader = new FileReader(fileName);
                while(reader.ready())
                    aSCII[reader.read()]++;
                reader.close();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            int max = aSCII[0];
            int maxBait = 0;
            for (int i = 1; i < aSCII.length; i++)
            {
                if (aSCII[i] > max)
                {
                    max=aSCII[i];
                    maxBait = i;
                }

            }
            resultMap.put(fileName,maxBait);



        }
    }
}
