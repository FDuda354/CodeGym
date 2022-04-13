package pl.codegym.task.task09.task0919;

/* 
Dzielenie przez zero
*/

public class Solution {

    public static void main(String[] args)
    {

        try
        {
            dzielimyPrzezZero();
        }
        catch (ArithmeticException e)
        {

            e.printStackTrace();
        }
    }
    public static void dzielimyPrzezZero() throws ArithmeticException
    {
            System.out.println(4/0);
    }
}
