package pl.codegym.task.task10.task1015;

import java.util.ArrayList;

/* 
Tablica z listami ciągów
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] tablicaCiagowList = utworzList();
        printList(tablicaCiagowList);
    }

    public static ArrayList<String>[] utworzList() {
        //tutaj wpisz swój kod
        ArrayList<String>[] tablist = (ArrayList<String>[]) new ArrayList[3];
        tablist[0] = new ArrayList<>();
        tablist[1] = new ArrayList<>();
        tablist[2] = new ArrayList<>();
        tablist[2].add("dsad");
        tablist[1].add("dsad");
        tablist[0].add("dasdsaddsaddsad");

        return tablist;
    }

    public static void printList(ArrayList<String>[] tablicaCiagowList) {
        for (ArrayList<String> lista : tablicaCiagowList) {
            for (String s : lista) {
                System.out.println(s);
            }
        }
    }
}