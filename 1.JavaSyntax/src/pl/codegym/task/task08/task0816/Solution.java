package pl.codegym.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Miła Emma i letnie wakacje
*/

public class Solution {
    public static HashMap<String, Date> utworzMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.forLanguageTag("pl"));
        HashMap<String, Date> mapa = new HashMap<String, Date>();
        mapa.put("Stallone", df.parse("MAY 1 2012"));
        mapa.put("Stallone2", df.parse("CZERWIEC 1 2012"));
        mapa.put("Stallone3", df.parse("LIPIEC 1 2012"));
        mapa.put("Schwarzenegger", df.parse("SIERPIEŃ 1 2012"));
        mapa.put("Schwarzenegger2", df.parse("WRZESIEŃ 1 2012"));
        mapa.put("Schwarzenegger3", df.parse("MAJ 1 2012"));
        mapa.put("Willis", df.parse("CZERWIEC 1 2012"));
        mapa.put("Willis2", df.parse("CZERWIEC 1 2012"));
        mapa.put("Willis3", df.parse("CZERWIEC 1 2012"));
        mapa.put("Stallone4", df.parse("CZERWIEC 1 2012"));
        return mapa;
    }

    public static void usunUrodzonychLatem(HashMap<String, Date> mapa) {
        //tutaj wpisz swój kod
        //HashMap<String,Date> copy = new HashMap<String,Date>(mapa);


        Date pocz = new Date();
        pocz.setMonth(6);
        pocz.setDate(1);
        Date kon = new Date();
        kon.setMonth(8);
        kon.setDate(31);

        Iterator<Map.Entry<String,Date>> iterator = mapa.entrySet().iterator();

        while (iterator.hasNext())
        {

            //System.out.println("a");
            Date czas = iterator.next().getValue();
            pocz.setYear(czas.getYear());
            kon.setYear(czas.getYear());

            if(czas.after(pocz)|| czas.before(kon))
                iterator.remove();


            //System.out.println();
        }

    }

    public static void main(String[] args) throws ParseException
    {

        HashMap<String, Date> ma = utworzMap();
        usunUrodzonychLatem(ma);


            System.out.println(ma.toString());


    }
}
