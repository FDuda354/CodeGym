package pl.codegym.task.task04.task0404;

/* 
Rejestr kota
*/

public class Kot {
    private static int licznikKotow = 0;

    Kot()
    {
        dodajNowegoKota();
    }
    public static void dodajNowegoKota() {
        //tutaj wpisz swój kod
        licznikKotow ++;
    }

    public static void main(String[] args)
    {


       Kot kot1 = new Kot();
        Kot kot12= new Kot();
        Kot kot13 = new Kot();

        System.out.println(Kot.licznikKotow);
    }
}
