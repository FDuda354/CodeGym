package pl.codegym.task.task09.task0926;

import java.util.ArrayList;

/* 
Lista tablic z liczbami
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> lista = utworzLista();
        printLista(lista);
    }

    public static ArrayList<int[]> utworzLista()
    {
        //tutaj wpisz swój kod
        ArrayList<int[]> list = new ArrayList<int[]>();

//        int[] a5 = new int[0];
//        int[] a2 = new int[2];
//        int[] a3 = new int[4];
//        int[] a1 = new int[5];
//        int[] a4 = new int[7];

        int N = 0;
        for ( int i = 0; i<5 ; i++)
        {

            if (i == 0)
                 N = 5;
            else if (i == 1)
                 N = 2;
            else if (i == 2)
                 N = 4;
            else  if (i == 3)
                 N = 7;
            else  if (i == 4)
                 N = 0;

            int[] a1 = new int[N];
            for ( int j = 0; j<N ; j++)
            {
                a1[j] = (int) (Math.random() * 100);
            }
            list.add(a1);
        }

        return list;
    }

    public static void printLista(ArrayList<int[]> lista) {
        for (int[] tablica : lista) {
            for (int x : tablica) {
                System.out.println(x);
            }
        }
    }
}
