package pl.codegym.task.task05.task0513;

/* 
Stwórzmy sobie prostokąt
*/

public class Prostokat {
    public int lewy;
    public int gora;
    public int szerokosc;
    public int wysokosc;

    public void inicjalizuj(int lewy, int gora, int szerokosc, int wysokosc) {
        this.lewy = lewy;
        this.gora = gora;
        this.szerokosc = szerokosc;
        this.wysokosc = wysokosc;
    }

    public void inicjalizuj(int lewy, int gora) {
        this.lewy = lewy;
        this.gora = gora;
        this.szerokosc = 0;
        this.wysokosc = 0;
    }

    public void inicjalizuj(int lewy, int gora, int szerokosc) {
        this.lewy = lewy;
        this.gora = gora;
        this.szerokosc = szerokosc;
        this.wysokosc = szerokosc;
    }

    public void inicjalizuj(Prostokat a) {
        this.lewy = a.lewy;
        this.gora = a.gora;
        this.szerokosc = a.szerokosc;
        this.wysokosc = a.wysokosc;
    }

    public static void main(String[] args) {

    }
}
