package pl.codegym.task.task14.task1417;

import java.util.ArrayList;
import java.util.List;

/* 
Waluty
*/

public class Solution {

    ArrayList<Money> list = new ArrayList<>();
    public static void main(String[] args) {
        Person paul = new Person("Paul");
        for (Money money : paul.getAllMoney()) {
            System.out.println(paul.name + " ma schowane " + money.getAmount() + " " + money.getCurrencyName());
        }
    }

    static class Person {
        public String name;
        private List<Money> allMoney;

        Person(String name) {
            this.name = name;
            this.allMoney = new ArrayList<Money>();
            //tutaj wpisz swój kod
            this.allMoney.add(new USD(5000));
            this.allMoney.add(new Euro(10000));
            this.allMoney.add(new Ruble(40000));
        }



        public List<Money> getAllMoney() {
            return allMoney;
        }
    }
}
