package pl.codegym.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Samogłoski i spółgłoski
*/

public class Solution {
    public static char[] samogloski = new char[]{'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args) throws Exception {
        // tutaj wpisz swój kod

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char[] slowo = s.toCharArray();
        for (int i = 0; i<s.length();i++)
        {
            if(isSamogloska(slowo[i]))
                System.out.print(slowo[i]+" ");
        }
        System.out.println("");
        for (int i = 0; i<s.length();i++)
        {
            if(!isSamogloska(slowo[i]) && slowo[i]!=' ')
                System.out.print(slowo[i]+" ");
        }


    }

    // Ta metoda sprawdza, czy litera jest samogłoską
    public static boolean isSamogloska(char c) {
        c = Character.toLowerCase(c);  // Konwertuje na małe litery

        for (char d : samogloski)   // Szuka samogłosek w tablicy
        {
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}