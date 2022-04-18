package pl.codegym.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

/* 
User, loser, coder i programmer
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;
        HashSet<String> set = new HashSet<>();
        set.add("user");
        set.add("loser");
        set.add("coder");
        set.add("programmer");
        // Pętla do wczytywania kluczy. Punkt 1
        String s;
        while (set.contains(s=reader.readLine()))
        {
            // Tworzy obiekt. Punkt 2
            switch (s) {
                case "user" -> person = new Person.User();
                case "loser" -> person = new Person.Loser();
                case "coder" -> person = new Person.Coder();
                case "programmer" -> person = new Person.Programmer();
            }
            doWork(person);

        }
    }

    public static void doWork(Person person) {
        // Punkt 3

        if(person instanceof Person.User)
            ((Person.User) person).live();
        if(person instanceof Person.Loser)
            ((Person.Loser) person).doNothing();
        if(person instanceof Person.Coder)
            ((Person.Coder) person).writeCode();
        if(person instanceof Person.Programmer)
            ((Person.Programmer) person).enjoy();
    }
}
