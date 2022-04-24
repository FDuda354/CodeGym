package pl.codegym.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Praca nad wzorcem projektowym singleton
*/

public class Solution {
    public static void main(String[] args) {

    }
static
{
    try
    {
        readKeyFromConsoleAndInitPlanet();
    }
    catch (IOException e)
    {
        e.printStackTrace();
    }

}
    public static Planet thePlanet;

    // Dodaj tutaj blok statyczny

    public static void readKeyFromConsoleAndInitPlanet() throws IOException{
        // Zaimplementuj tutaj krok #5
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();

        if(s.equals(Planet.SUN))
            thePlanet=Sun.getInstance();
        if(s.equals(Planet.MOON))
            thePlanet=Moon.getInstance();
        if(s.equals(Planet.EARTH ))
            thePlanet=Earth.getInstance();
        else
            thePlanet=null;
    }
}
