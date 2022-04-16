package pl.codegym.task.task13.task1315;

/* 
Tom, Jerry i Spike
*/

public class Solution {

    public static void main(String[] args) {

    }

    // Potrafi się poruszać
    public interface CanMove {
        void move();
    }

    // Może zostać zjedzony
    public interface Edible {
        void beEaten();
    }

    // Potrafi jeść
    public interface CanEat {
        void eat();
    }
    public class Dog implements CanMove,CanEat
    {

        @Override
        public void move() {

        }

        @Override
        public void eat() {

        }
    }
    public class Cat implements CanMove,CanEat,Edible
    {

        @Override
        public void move() {

        }

        @Override
        public void beEaten() {

        }

        @Override
        public void eat() {

        }
    }
    public class Mouse implements CanMove,Edible
    {

        @Override
        public void move() {

        }

        @Override
        public void beEaten() {

        }
    }
}