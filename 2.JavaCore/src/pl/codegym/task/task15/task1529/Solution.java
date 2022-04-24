package pl.codegym.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Praktyka z blokami statycznymi
*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        //tutaj wpisz swój kod
        try {
            reset();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static CanFly result;

    public static void reset() throws IOException {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        if(s.equals("helikopter"))
            result = new Helicopter();
        else if(s.equals("samolot"))
        {
            int a = Integer.parseInt(reader.readLine());
            result = new Plane(a);
        }
        reader.close();

    }
}
