package pl.codegym.task.task19.task1904;

import java.io.IOException;
import java.util.Scanner;

/* 
Jeszcze jeden adapter
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner
    {
        private Scanner scanner;

        public PersonScannerAdapter(Scanner scanner) {
            this.scanner = scanner;
        }

        @Override
        public Person read() throws IOException {
            return null;
        }

        @Override
        public void close() throws IOException {

        }
    }
}
