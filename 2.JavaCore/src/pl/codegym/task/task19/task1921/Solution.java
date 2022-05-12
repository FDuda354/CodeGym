package pl.codegym.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/* 
John Johnson
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        //String file;
        String file = args[0];



//        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)))
//        {
//            file = reader.readLine();
//        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while (reader.ready()) {
                String line = reader.readLine();
                String name = line.replaceAll ("(\\d+)","");
                name = name.trim();
                String date = line.replaceAll ("[^0-9]+ ","");
                date = date.trim();


                SimpleDateFormat format2 = new SimpleDateFormat("MM dd yyyy");
               // System.out.println(date);
                PEOPLE.add(new Person(name, format2.parse(date)));
            }


        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
