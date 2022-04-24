package pl.codegym.task.task14.task1419;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;

/* 
Inwazja wyjątków
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   // Pierwszy wyjątek
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);


            //tutaj wpisz swój kod

        }
        exceptions.add(new RuntimeException());
        exceptions.add(new IOException());
        exceptions.add(new FileNotFoundException());
        exceptions.add(new IndexOutOfBoundsException());
        exceptions.add(new ArrayIndexOutOfBoundsException());
        exceptions.add(new NullPointerException());
        exceptions.add(new NumberFormatException());
        exceptions.add(new IllegalAccessException());
        exceptions.add(new IllegalArgumentException());

    }
}