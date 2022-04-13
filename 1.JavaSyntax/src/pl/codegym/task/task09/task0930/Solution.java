package pl.codegym.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Zadanie z algorytmami
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> lista = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            lista.add(s);
        }

        String[] array = lista.toArray(new String[lista.size()]);
        sortuj(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sortuj(String[] array) {

        for(int i = 0; i< array.length; i++)
        {
            if(isLiczba(array[i]))
            {

                for(int j = 1; j< array.length; j++)
                {
                    if(isLiczba(array[j]))
                    {
                       if (Integer.parseInt(array[i])>Integer.parseInt(array[j]))
                        {
                            String temp = array[i];
                            array[i] = array[j];
                            array[j] = temp;
                        }
                    }

                }
            }
           else if(!isLiczba(array[i]))
            {

                for(int j = i+1; j< array.length; j++)
                {
                    if(!isLiczba(array[j]))
                    {
                        if (isWiekszeOd(array[i],array[j]))
                        {
                            String temp = array[i];
                            array[i] = array[j];
                            array[j] = temp;
                        }
                    }

                }
            }


        }

    }

    // String comparison method: 'a' is greater than 'b'
    public static boolean isWiekszeOd(String a, String b) {
        return a.compareTo(b) > 0;
    }

    // Is the passed string a number?
    public static boolean isLiczba(String s) {
        if (s.length() == 0) {
            return false;
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (i != 0 && c == '-') { // the string contains a hyphen
                return false;
            }
            if (!Character.isDigit(c) && c != '-') { // not a number and doesn't start with a hyphen
                return false;
            }
            if (i == 0 && c == '-' && chars.length == 1) { // not a hyphen
                return false;
            }
        }
        return true;
    }

}
