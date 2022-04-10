package pl.codegym.task.task09.task0908;

/* 
Wyjątki przy pracy z ciągami
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod

        String s = null;
        try
        {
            String m = s.toLowerCase();
        }
       catch (NullPointerException e)
       {
           System.out.println(e);
       }

        //tutaj wpisz swój kod
    }
}
