package pl.codegym.task.task10.task1013;

/* 
Konstruktory klasy Ludzie
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Ludzie {

        int a,b,c;
        String aa,bb,cc;

        Ludzie()
        {
           this(0, "", 0, "", 0, "");

        }
        Ludzie(int a, int b, int c)
        {
           this(a, "", b, "", c, "");
        }
        Ludzie(String aa, String bb, String cc)
        {
            this(0, aa, 0, bb, 0, cc);
        }
        Ludzie(int a, String aa, int b, String bb, int c, String cc)
        {
            this(a, aa, b, bb, cc);
        }
        Ludzie(int a, String aa, int b, String bb, String cc)
        {
            this.a = a;
            this.aa = aa;
            this.b = b;
            this.bb = bb;
            this.cc = cc;
        }
        Ludzie(int a, String aa, String bb, String cc)
        {
            this.a = a;
            this.aa = aa;
            this.bb = bb;
            this.cc = cc;
        }
    }
}
