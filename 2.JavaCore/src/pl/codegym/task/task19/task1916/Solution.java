package pl.codegym.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Śledzenie zmian
*/

public class Solution
{

    public static List<LineItem> lines = new ArrayList<>();

    public static void main(String[] args) throws IOException
    {

        String file1;
        String file2;
        ArrayList<String> list1;
        ArrayList<String> list2;

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)))
        {
            file1 = reader.readLine();
            file2 = reader.readLine();

            try(BufferedReader reader1 = new BufferedReader(new FileReader(file1));
                BufferedReader reader2 = new BufferedReader(new FileReader(file2)))
            {
                list1 = new ArrayList<>();
                list2 = new ArrayList<>();

                while (reader1.ready())
                    list1.add(reader1.readLine());
                while ( reader2.ready())
                    list2.add(reader2.readLine());

            }
        }

        int d = Math.max(list1.size(), list2.size());

        //  System.out.println(d);

        for (int i = 0,j = 0;  j < d;)
        {
            try
            {
                if (list1.get(i).equals(list2.get(j)))
                {
                    lines.add(new LineItem(Type.SAME, list1.get(i)));
                    i++;
                    j++;

                }
                else
                    if (list1.get(++i).equals(list2.get(j)))
                    {
                        lines.add(new LineItem(Type.REMOVED, list1.get(--i)));
                        i++;
                    } else if (list1.get(--i).equals(list2.get(++j)))
                    {
                        lines.add(new LineItem(Type.ADDED, list2.get(--j)));
                        j++;
                    }
            }
            catch (IndexOutOfBoundsException e)
            {

                if(list1.size() > list2.size())
                  while (i<list1.size())
                    lines.add(new LineItem(Type.REMOVED,list1.get(i++)));
                else
                    while (j<list2.size())
                        lines.add(new LineItem(Type.ADDED,list2.get(j++)));
                break;

            }
        }

        //for(LineItem line:lines)
           // System.out.println(line.type +" "+ line.line);
    }

    public static enum Type
    {
        ADDED,        // Dodana nowa linia
        REMOVED,      // Linia usunięta
        SAME          // Bez zmian
    }

    public static class LineItem
    {
        public Type type;
        public String line;

        public LineItem(Type type, String line)
        {
            this.type = type;
            this.line = line;
        }
    }
}
