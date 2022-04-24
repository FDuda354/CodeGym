package pl.codegym.task.task16.task1610;

/* 
Przyporządkowywanie wywołań do join()
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Cat cat1 = new Cat("Misia");
        Cat cat2 = new Cat("Coco");
    }

    private static void investigateWorld() {

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static class Cat extends Thread {
        protected Kitten kitten1;
        protected Kitten kitten2;

        public Cat(String name) {
            super(name);
            kitten1 = new Kitten("Kociak 1 (matka - " + getName() + ")");
            kitten2 = new Kitten("Kociak 2 (matka - " + getName() + ")");
            start();
        }

        public void run() {
            System.out.println(getName() + " urodziła 2 kocięta");
            try {
                initAllKittens();
            } catch (InterruptedException e) {
            }
            try {
                kitten1.join();
                kitten2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(getName() + ": Wszystkie kocięta są w koszyku. " + getName() + " przyniosła je z powrotem");
        }

        private void initAllKittens() throws InterruptedException {

            int i = (int) (Math.random() * 1);
            if(i==0)
            {
                kitten1.start();
                kitten2.start();
            }
            if(i==1)
            {
                kitten2.start();
                kitten1.start();
            }

        }
    }

    public static class Kitten extends Thread {
        public Kitten(String name) {
            super(name);
        }

        public void run() {
            System.out.println(getName() + " wyszedł z koszyka");
            investigateWorld();
        }
    }
}
