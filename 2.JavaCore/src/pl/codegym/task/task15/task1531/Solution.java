package pl.codegym.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

/* 
Silnia
*/

public class Solution {
    public static void main(String[] args) throws IOException {



        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            int input = Integer.parseInt(reader.readLine());
            reader.close();

            System.out.println(factorial(input));


    }

    public static String  factorial(int n) {
        //tutaj wpisz swój kod

        if(n>=0)
            return ""+sil(BigInteger.valueOf(n));
        else
            return "0";

    }
    public static BigInteger sil(BigInteger n)
    {
        if(Objects.equals(n, BigInteger.valueOf(0)))
            return BigInteger.valueOf(1) ;
        else
            return sil(n.subtract(BigInteger.valueOf(1))).multiply(n);
    }
}
