package pl.codegym.task.task19.task1914;

/* 
Rozwiązywanie problemów
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream copy = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        System.setOut(new PrintStream(outputStream));

        testString.printSomething();

        System.setOut(copy);

        String[] result = outputStream.toString().split(" ");
        String resulted = outputStream.toString();

        int a = Integer.parseInt(result[0]);
        int b = Integer.parseInt(result[2]);


        if(result[1].equals("+"))
            System.out.println(resulted + (a+b));
        else if(result[1].equals("-"))
            System.out.println(resulted +  (a-b));
        else
            System.out.println(resulted +  (a*b));


    }

    public static class TestString {
        public void printSomething() {
            System.out.print("3 + 6 = ");
        }
    }
}

