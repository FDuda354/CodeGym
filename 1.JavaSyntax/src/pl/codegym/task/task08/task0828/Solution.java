package pl.codegym.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Numer miesiąca
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> months = new ArrayList<>();
        months.add("Styczeń");
        months.add("Luty");
        months.add("Marzec");
        months.add("Kwiecień");
        months.add("Maj");
        months.add("Czerwiec");
        months.add("Lipiec");
        months.add("Sierpień");
        months.add("Wrzesień");
        months.add("Październik");
        months.add("Listopad");
        months.add("Grudzień");

        String month = reader.readLine();
        if (months.contains(month)) {
            int monthNumber = months.indexOf(month) + 1;
            System.out.println(month + " to miesiąc nr " + monthNumber);
        } else {
            System.out.println(month + " isn't a month");
        }
    }
}
