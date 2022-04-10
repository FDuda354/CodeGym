package pl.codegym.task.task07.task0716;

import java.util.ArrayList;

/* 
R czy L
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("rosa"); // 0
        lista.add("luz"); // 1
        lista.add("lira"); // 2
        lista = napraw(lista);

        for (String s : lista) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> napraw(ArrayList<String> lista) {
        // tutaj wpisz swój kod
       // ArrayList<String> result = new ArrayList<>();
        int  d = lista.size();
        for(int i = 0; i<d;i++)
        {
            //System.out.println(i);
            if((lista.get(i).contains("r"))&&(lista.get(i).contains("l")))
            {
                //System.out.println("rl");
                continue;
            }

           else if(lista.get(i).contains("r"))
            {
                --d;
                lista.remove(i);
                i--;
                //System.out.println("r");
            }

           else if(lista.get(i).contains("l"))
            {
               // System.out.println("l");
                ++d;
                lista.add(0,lista.get(i));



                i++;
            }
           //else
               // System.out.println("nic");



        }


        return lista;
    }
}
//public class Solution {
//
//    public static void main(String[] args) {
//        String m1 = "rosa";
//        String m2 = "lira";
//        String m3 = "luz";
//
//        ArrayList<String> lista = new ArrayList<>();
//        lista.add(m1); //0
//        lista.add(m2); //1
//        lista.add(m3); //2
//        lista = napraw(lista);
//
//        for (String s : lista) {
//            System.out.println(s);
//        }
//    }
//
//    public static ArrayList<String> napraw(ArrayList<String> lista) {
//        String m4 = "r";
//        String m5 = "l";
//
//        ArrayList<String> result = new ArrayList<>();
//        for (String s : lista) {
//            boolean r = s.contains(m4);
//            boolean l = s.contains(m5);
//
//            if (r && !l) {
//                continue; //skip s
//            }
//
//            if (!r && l) {
//                result.add(s);
//            }
//
//            result.add(s);
//        }
//        return lista;
//    }
//}