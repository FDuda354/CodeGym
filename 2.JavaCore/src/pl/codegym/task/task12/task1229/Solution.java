package pl.codegym.task.task12.task1229;

/* 
Klasa macierzysta klasy CTO
*/

public class Solution {

    public static void main(String[] args) {
        CTO cto = new CTO();
        System.out.println(cto);
    }

    public static interface Businessman {
        public void workHard();
    }
    public abstract static class CCC
    {
        public void workHard()
        {
            System.out.println("DSA");
        }
    }
    public static class CTO extends CCC implements Businessman
    {

    }
}
