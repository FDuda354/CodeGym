package pl.codegym.task.task08.task0827;

import java.util.Date;

/* 
Praca z datami
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDataNieparzysta("FEBRUARY 8 20222"));
    }

    public static boolean isDataNieparzysta(String date) {

        Date pocz = new Date(date);
        Date teraz = new Date(date);

        pocz.setMonth(0);
        pocz.setDate(1);

        long czas = teraz.getTime()- pocz.getTime();
        czas = czas/1000/60/60/24;
        System.out.println(czas);
        if (czas%2==0)
            return true;
        else
            return false;

        //czas = czas/1000/60/60/24/30;

        //System.out.println(czas);
        //return true;
    }
}