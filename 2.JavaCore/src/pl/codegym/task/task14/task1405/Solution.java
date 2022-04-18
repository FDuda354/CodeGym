package pl.codegym.task.task14.task1405;

/* 
Jedzonko
*/

public class Solution {
    public static void main(String[] args) {
        Food food = new Food();
        Selectable selectable = new Food();
        Food newFood = (Food) selectable;

        foodMethods(food);
        selectableMethods(selectable);
    }

    public static void foodMethods(Food food) {
        //tutaj wpisz swój kod
        food.onSelect();
        food.onEat();

    }

    public static void selectableMethods(Selectable selectable) {
        //tutaj wpisz swój kod
        selectable.onSelect();
        if(selectable instanceof Food)
            ((Food) selectable).onEat();
    }

    interface Selectable {
        void onSelect();
    }

    static class Food implements Selectable{
        public void onEat() {
            System.out.println("Jedzonko zostało zjedzone");
        }

        @Override
        public void onSelect() {
            System.out.println("Jedzonko zostało wybrane");

        }
    }
}