package pl.codegym.task.task05.task0522;

/* 
Maksimum konstruktorów
*/

public class Kolo {

    public double x;
    public double y;
    public double promien;

    //tutaj wpisz swój kod
    public Kolo()
    {
        this.x = 0;
        this.y = 0;
        this.promien = 0;
    }
    public Kolo(double x)
    {
        this.x = x;
    }
    public Kolo(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    public Kolo(double x, double y, double promien) {
        this.x = x;
        this.y = y;
        this.promien = promien;
    }



    public static void main(String[] args) {

    }
}