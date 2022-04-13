package pl.codegym.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Jaka dzisiaj jest data?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat format1 = new SimpleDateFormat("d MMM yyyy",new Locale("pl"));
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd");


       String s = reader.readLine();

        Date data = format2.parse(s);
        System.out.println(format1.format(data).toUpperCase());




    }
}
