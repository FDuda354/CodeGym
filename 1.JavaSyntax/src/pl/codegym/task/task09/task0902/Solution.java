package pl.codegym.task.task09.task0902;

/* 
Ślad stosu wita ponownie
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static String method1() {
        method2();

        //tutaj wpisz swój kod
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method2() {
        method3();
        //tutaj wpisz swój kod
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method3() {

        System.out.println(Thread.currentThread().getStackTrace()[2].getMethodName());
        method4();
        //tutaj wpisz swój kod

        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method4() {
        method5();

        return Thread.currentThread().getStackTrace()[2].getMethodName();
        //tutaj wpisz swój kod
    }

    public static String method5() {
        //tutaj wpisz swój kod


        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}
