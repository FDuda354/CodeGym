package pl.codegym.task.task05.task0520;

/* 
Utwórz klasę Prostokat
*/

public class Prostokat {
    //tutaj wpisz swój kod
    int gora, lewy, szerokosc ,wysokosc;

    public Prostokat(int gora, int lewy, int szerokosc, int wysokosc)
    {
        this.gora = gora;
        this.lewy = lewy;
        this.szerokosc = szerokosc;
        this.wysokosc = wysokosc;
    }

    public Prostokat(int lewy, int gora)
    {
        this.lewy = lewy;
        this.gora = gora;
        this.szerokosc = 0;
        this.wysokosc = 0;
    }
    public Prostokat(int lewy, int gora,int szerokosc) {
        this.lewy = lewy;
        this.gora = gora;
        this.szerokosc = szerokosc;
        this.wysokosc = szerokosc;
    }

    public Prostokat(Prostokat prostokat)
    {
        this.gora = prostokat.gora;
        this.lewy = prostokat.lewy;
        this.szerokosc = prostokat.szerokosc;
        this.wysokosc = prostokat.wysokosc;
    }
    public static void main(String[] args) {

    }
}
