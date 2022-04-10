package pl.codegym.task.task09.task0906;

/* 
Logowanie śladów stosu
*/

public class Solution {
    public static void main(String[] args) {
        log("W metodzie main");
    }

    public static void log(String s) {
        //tutaj wpisz swój kod
        System.out.print(Thread.currentThread().getStackTrace()[2].getClassName());
        System.out.print(": "+Thread.currentThread().getStackTrace()[2].getMethodName());
        System.out.print(": "+s);
    }
}
