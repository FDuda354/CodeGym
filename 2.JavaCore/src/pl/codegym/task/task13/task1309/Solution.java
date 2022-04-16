package pl.codegym.task.task13.task1309;

/* 
Wszystko, co się porusza
*/

public class Solution {

    interface CanMove
    {
        Double speed();
    }
    interface CanFly extends CanMove
    {
        Double speed(CanFly a);
    }
    public static void main(String[] args) {
    }
}