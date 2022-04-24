package pl.codegym.task.task16.task1617;

/* 
Odliczanie na wyścigach
*/

public class Solution {
    public static volatile int numSeconds = 3;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        //tutaj wpisz swój kod
        Thread.sleep(3500);
        clock.interrupt();


    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            //tutaj wpisz swój kod
            while (numSeconds>0)
            {
                try
                {
                    System.out.print(numSeconds--+" ");
                    Thread.sleep(1000);
                    if(numSeconds==0)
                        System.out.print("Start!");
                }
                catch (InterruptedException e)
                {
                    System.out.print("Przerwane!");

                }
            }

        }
    }
}
