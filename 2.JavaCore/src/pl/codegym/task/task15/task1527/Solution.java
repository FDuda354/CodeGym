package pl.codegym.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Parser żądań
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        String url = s;
        String ss = url.substring(url.lastIndexOf("?") + 1);
        String[] splitParams = ss.split("&");


        s = s.substring(s.indexOf('?')+1,s.length()-1);

        char[] chars = s.toCharArray();

        int coutner=0;

        for (int i = 0; i<s.length();i++)
        {
            if(chars[i]=='&')
                coutner++;
        }


        if(!s.contains("obj"))
        {

            ArrayList<String> list = new ArrayList<>();

            for (int i = 0; i<coutner;i++)
            {
                String temp =s.substring(0,s.indexOf('&'));
                s=s.substring(temp.length()+1,s.length());
                if(temp.contains("="))
                    temp=temp.substring(0,temp.indexOf('='));



                list.add(temp);

            }

            if(s.contains("="))
                s=s.substring(0,s.indexOf('='));
            list.add(s);

            System.out.println(list);



        }
        else
        {

        }
    }



    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
