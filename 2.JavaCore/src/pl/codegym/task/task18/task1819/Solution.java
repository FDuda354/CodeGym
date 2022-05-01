package pl.codegym.task.task18.task1819;

/* 
Łączenie plików
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String file1 = reader.readLine();
        String file2 = reader.readLine();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

       FileInputStream inputStream1 = new FileInputStream(file1);
       FileOutputStream outputStream1 = new FileOutputStream(file1);
        FileInputStream inputStream2 = new FileInputStream(file2);

        while (inputStream2.available()>0)
        byteArrayOutputStream.write(inputStream2.read());
        while (inputStream1.available()>0)
            byteArrayOutputStream.write(inputStream1.read());

        byteArrayOutputStream.writeTo(outputStream1);

        reader.close();
        inputStream1.close();
        inputStream2.close();
        outputStream1.close();


    }
}
