package pl.codegym.task.task11.task1123;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndMaximum(data);

        System.out.println("Minimum to " + result.x);
        System.out.println("Maximum to " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndMaximum(int[] array) {
        if (array == null || array.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }
//        int max = array[0];
//        int min = array[0];
//        //tutaj wpisz swój kod
//        for (int s : array)
//        {
//            if(s>max)
//                max=s;
//            else if(s<min)
//                min=s;
//
        //}

        int[] tab = Arrays.copyOf(array,array.length-1);
        Arrays.sort(tab);

       return new Pair<Integer, Integer>(tab[0], tab[tab.length-1]);
       // return new Pair<Integer, Integer>(min, max);
    }


    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}
