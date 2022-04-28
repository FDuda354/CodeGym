package pl.codegym.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<>();


    static {
        allPeople.add(Person.createMale("Donald Chump", new Date()));  // id=0
        allPeople.add(Person.createMale("Larry Gates", new Date()));  // id=1
    }

    public static void main(String[] args) throws ParseException {
        // Zacznij tutaj
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM dd yyyy");

        switch (args[0]) {
            case "-c":
                if (args[2].equals("m"))
                    allPeople.add(Person.createMale(args[1], simpleDateFormat.parse(args[3])));
                else if (args[2].equals("f"))
                    allPeople.add(Person.createFemale(args[1], simpleDateFormat.parse(args[3])));
                System.out.println(allPeople.size()-1);
                break;
            case "-u":
                    allPeople.get(Integer.parseInt(args[1])).setName(args[1]);
                    allPeople.get(Integer.parseInt(args[1])).setBirthDate(simpleDateFormat.parse(args[3]));
                    allPeople.get(Integer.parseInt(args[1])).setSex(args[2].equals("m") ? Sex.MALE : Sex.FEMALE);
                break;
            case "-d":
                allPeople.get(Integer.parseInt(args[1])).setName(null);
                allPeople.get(Integer.parseInt(args[1])).setBirthDate(null);
                allPeople.get(Integer.parseInt(args[1])).setSex(null);
                break;
            case "-i":

                if (allPeople.get(Integer.parseInt(args[1])) != null)
                    System.out.println(allPeople.get(Integer.parseInt(args[1])).getName() + " " + (allPeople.get(Integer.parseInt(args[1])).getSex() == Sex.MALE ? "m" : "f") + " " + new SimpleDateFormat("MMM dd yyyy").format(allPeople.get(Integer.parseInt(args[1])).getBirthDate()));

                break;
        }

    }
}
