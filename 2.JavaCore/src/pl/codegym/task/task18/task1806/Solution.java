package pl.codegym.task.task18.task1806;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
Popraw błędy
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("c:/data.txt");
        // Utwórz strumień do zapisu bajtów do pliku
        FileOutputStream outputStream = new FileOutputStream("c:/result.txt");

        if (inputStream.available() > 0) {
            // Odczytaj cały plik na raz
            byte[] buffer = new byte[inputStream.available()];
            outputStream.write(buffer, 0, inputStream.read(buffer));
        }

        inputStream.close();
        outputStream.close();
    }
}
