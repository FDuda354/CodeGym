package pl.codegym.task.task16.task1627;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        OnlineGame onlineGame = new OnlineGame();
        onlineGame.start();
    }

    public static class OnlineGame extends Thread {
        public static volatile boolean isWinnerFound = false;

        public static ArrayList<String> actions = new ArrayList<>();

        static {
            actions.add("Rozpocznij grę");
            actions.add("Zbierz zasoby");
            actions.add("Rozwijaj gospodarkę");
            actions.add("Zabijaj wrogów");
        }

        protected Gamer gamer1 = new Gamer("Smith", 3);
        protected Gamer gamer2 = new Gamer("Jones", 1);
        protected Gamer gamer3 = new Gamer("Gates", 5);

        public void run() {
            gamer1.start();
            gamer2.start();
            gamer3.start();

            while (!isWinnerFound) {

            }
            gamer1.interrupt();
            gamer2.interrupt();
            gamer3.interrupt();
        }
    }

    public static class Gamer extends Thread {
        private int rating;

        byte counter;
        public Gamer(String name, int rating) {
            super(name);
            this.rating = rating;
        }

        @Override
        public void run() {
            //tutaj wpisz swój kod
            while (counter<4)
            {
                System.out.println(getName()+":"+OnlineGame.actions.get(counter++));
                if(counter==4)
                {
                    System.out.println(Thread.currentThread().getName()+":wygrał!");
                    OnlineGame.isWinnerFound = true;
                    break;

                }

                try {
                    Thread.sleep((long)1000/rating);
                } catch (InterruptedException e) {
                    System.out.println(getName()+":przegrał");
                    break;
                }
            }


        }
    }
}
