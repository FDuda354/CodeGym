package pl.codegym.task.task06.task0613;

/* 
Kot i statyczne
*/

public class Solution {
    public static void main(String[] args) {
        // Tworzy 10 kotów
        Kot k1 = new Kot();
        Kot k2 = new Kot();
        Kot k3 = new Kot();
        Kot k4 = new Kot();
        Kot k5 = new Kot();
        Kot k6 = new Kot();
        Kot k7 = new Kot();
        Kot k8 = new Kot();
        Kot k9 = new Kot();
        Kot k10 = new Kot();
        // Wyświetla wartość zmiennej licznikKotow

        System.out.println(Kot.licznikKotow);
    }

    public static class Kot {
        // Tworzy zmienną statyczną licznikKotow

        public static int licznikKotow = 0;

        public Kot()
        {
            licznikKotow++;
        }

        // Deklaruje konstruktor
    }
}
