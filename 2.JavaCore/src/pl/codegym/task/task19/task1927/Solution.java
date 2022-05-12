package pl.codegym.task.task19.task1927;

/* 
Reklama kontekstowa
*/

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Solution {

    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {

        PrintStream consoleStream = System.out;

        //Utwórz dynamiczną tablicę
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        //Utwórz adapter dla klasy PrintStream
        PrintStream stream = new PrintStream(outputStream);
        //Ustaw go jako bieżący System.out
        System.setOut(stream);

        //Wywołaj funkcję, która nie wie nic o naszych zmianach
        testString.printSomething();

        //Konwertuj dane zapisane w naszym ByteArray na ciąg
        String result = outputStream.toString();

        //Przywróć wszystko do poprzedniego stanu
        System.setOut(consoleStream);

        //Odwróć ciąg
        StringBuilder stringBuilder = new StringBuilder(result);
        stringBuilder.reverse();
        String reverseString = stringBuilder.toString();

        //Wypisz go do konsoli
        System.out.println(reverseString);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("pierwszy");
            System.out.println("drugi");
            System.out.println("trzeci");
            System.out.println("czwarty");
            System.out.println("piąty");
        }
    }
}
