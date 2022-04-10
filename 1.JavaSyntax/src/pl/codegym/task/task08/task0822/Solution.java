package pl.codegym.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* 
Najmniejsza z N liczb
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> listaLiczbCalkowitych = getListaLiczbCalkowitych();
        System.out.println(getMinimum(listaLiczbCalkowitych));
}

    public static int getMinimum(List<Integer> array) {
        // Znajduje minimum

        return Collections.min(array);
    }

    public static List<Integer> getListaLiczbCalkowitych() throws IOException {
        // Tworzy i inicjalizuje listę
        ArrayList<Integer> list = new ArrayList<Integer>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());

        for(int i = 0; i<N;i++)
        {
            list.add(Integer.parseInt(reader.readLine()));
        }

        return list;
    }
}
