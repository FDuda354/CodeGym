package pl.codegym.task.task05.task0528;

/* 
Wyświetl dzisiejszą datę
*/


import java.text.SimpleDateFormat;
import java.util.Date;


public class Solution {
    public static void main(String[] args) {
        //tutaj wpisz swój kod
        SimpleDateFormat data = new SimpleDateFormat("MMMM dd yyyy");
        System.out.println(data.format(new Date()));
    }
}
