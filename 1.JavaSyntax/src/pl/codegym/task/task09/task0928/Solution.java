package pl.codegym.task.task09.task0928;

import java.io.*;

/* 
Kod się nie kompiluje...
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String plikZrodlowyNazwa = reader.readLine();
        String plikDocelowyNazwa = reader.readLine();

        InputStream fileInputStream = getInputStream(plikZrodlowyNazwa);
        OutputStream fileOutputStream = getOutputStream(plikDocelowyNazwa);

        int count = 0;
        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
            count++;
        }

        System.out.println("Bajty skopiowane: " + count);

        fileInputStream.close();
        fileOutputStream.close();
    }

    public static InputStream getInputStream(String nazwaPliku) throws IOException {
        return new FileInputStream(nazwaPliku);
    }

    public static OutputStream getOutputStream(String nazwaPliku) throws IOException {
        return new FileOutputStream(nazwaPliku);
    }
}
