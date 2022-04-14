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
