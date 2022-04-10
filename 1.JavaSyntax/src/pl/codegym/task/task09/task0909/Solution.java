package pl.codegym.task.task09.task0909;

/* 
Wyjątek podczas pracy z tablicami
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod


        int[] m = new int[2];

        try
        {
            m[8] = 5;
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }


        //tutaj wpisz swój kod
    }
}
