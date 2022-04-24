
package pl.codegym.task.task16.task1623;

/*
Rekurencyjne tworzenie wątków
*/

public class Solution {
    static int count = 15;
    static volatile int createdThreadCount;

    public static void main(String[] args) {

        System.out.println(new GenerateThread());
    }

    public static class GenerateThread extends Thread
    {
        @Override
        public void run() {
            if (createdThreadCount<count)
                System.out.println(new GenerateThread());

        }

        public GenerateThread()
        {
            super(String.valueOf(++createdThreadCount));
            start();
        }

        @Override
        public String toString() {
            return ""+createdThreadCount+" utworzony";
        }
    }
}
