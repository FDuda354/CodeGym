package pl.codegym.task.task14.task1414;

/* 
MovieFactory
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Solution {
    static String s;
    public static void main(String[] args) throws Exception {
        // Wczytuje parę kluczy (ciągów) z konsoli. Punkt 7
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> set = new HashSet<>();
        set.add("cartoon");
        set.add("thriller");
        set.add("soapOpera");

          while (set.contains(s = reader.readLine()))
          {
              Movie movie = MovieFactory.getMovie(s);
            System.out.println(movie.getClass().getSimpleName());
          }



           // 8. Tworzy zmienną movie w klasie Movie i dla każdego wprowadzonego ciągu (klucza):
           // 8.1. Pobiera obiekt za pomocą MovieFactory.getMovie i przypisuje go do zmiennej movie.


          //  8.2. Wyświetla wynik wywoływania metody movie.getClass().getSimpleName().


    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            // Tworzy obiekt SoapOpera dla klucza "soapOpera"
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            }
            //tutaj wpisz swój kod. Punkty 5 i 6
            if ("cartoon".equals(key)) {
                movie = new Cartoon();
            }
            if ("thriller".equals(key)) {
                movie = new Thriller();
            }

            return movie;
        }
    }

    static abstract class Movie
    {

    }

    static class SoapOpera extends Movie
    {

    }
    // Tutaj napisz swoje klasy Punkt 3
    static class Cartoon extends Movie
    {

    }
    static class Thriller extends Movie
    {

    }
}
