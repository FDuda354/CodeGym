package pl.codegym.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Różne metody dla różnych typów
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //tutaj wpisz swój kod
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String v;

        while (!(v = reader.readLine()).equals("exit"))
        {
            try
            {
                if(v.contains("."))
                    print(Double.parseDouble(v));
                else if(Short.parseShort(v)>0&&Short.parseShort(v)<128)
                    print(Short.parseShort(v));
                else if(Integer.parseInt(v)<=0||Integer.parseInt(v)>=128)
                    print(Integer.parseInt(v));
                else
                    print(v);
            }
            catch (NumberFormatException ignore)
            {
                print(v);
            }




        }
    }

    public static void print(Double value) {
        System.out.println("To jest Double. Value: " + value);
    }

    public static void print(String value) {
        System.out.println("To jest String. Value: " + value);
    }

    public static void print(short value) {
        System.out.println("To jest liczba całkowita typu short. Value: " + value);
    }

    public static void print(Integer value) {
        System.out.println("To jest liczba całkowita typu Integer. Value: " + value);
    }
}
