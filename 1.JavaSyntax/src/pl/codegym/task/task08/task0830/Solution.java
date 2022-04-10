package pl.codegym.task.task08.task0830;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

/* 
Zadanie z algorytmami
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] tablica = new String[20];
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = reader.readLine();
        }

        sortuj(tablica);

        for (String x : tablica) {
            System.out.println(x);
        }
    }

    public static void sortuj(String[] tablica) {
    //tutaj wpisz swój kod

        //sortowanie przez wstawianie
        for (int i = 1; i < tablica.length; i++) {
            String tmp = tablica[i];
            int j = i - 1;
            while (j >= 0 && isWiekszeOd(tmp, tablica[j])) {
                tablica[j + 1] = tablica[j];
                j--;
            }
            tablica[j + 1] = tmp;
        }


    }

    // Metoda porównywania ciągów: 'a' jest większe niż 'b'dsfsdfsd
    public static boolean isWiekszeOd(String a, String b) {
        return a.compareTo(b) > 0;
    }
    }
