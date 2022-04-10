package pl.codegym.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Duplikowanie słów
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Czyta ciągi z konsoli i deklaruje tutaj ArrayList
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> lista = new ArrayList<String>();
        for(int i = 0; i<10;i++)
            lista.add(reader.readLine());


        lista = doubleValues(lista);

        // Wyświetla wynik
        for(String li:lista)
            System.out.println(li);
    }

    public static ArrayList<String> doubleValues(ArrayList<String> lista) {
        //tutaj wpisz swój kod
        int d = lista.size();
        for(int i = 0; i<d;i++)
        {
            lista.add(i+1, lista.get(i));
            d++;
            i++;
        }

        return lista;
    }
}
