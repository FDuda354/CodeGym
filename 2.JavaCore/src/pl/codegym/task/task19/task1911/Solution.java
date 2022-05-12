package pl.codegym.task.task19.task1911;

/* 
Reader wrapper
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {

    public static TestString testString = new TestString();

    public static void main(String[] args) {

        PrintStream backStream = System.out;

        ByteArrayOutputStream byteArray= new ByteArrayOutputStream();

        System.setOut(new PrintStream(byteArray));

        testString.printSomething();

        System.setOut(backStream);

        String result = byteArray.toString().toUpperCase();

        System.out.println(result);


    }

    public static class TestString {
        public void printSomething() {
            System.out.println("To jest tekst na potrzeby testów");
        }
    }
}
