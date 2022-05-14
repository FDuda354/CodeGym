package pl.codegym.task.task20.task2007;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* 
Jak się serializuje CodeGym?
*/

public class Solution {
    public static class CodeGym implements Serializable {
        public List<User> users = new ArrayList<>();
    }
    public static class Cat implements Serializable
    {
     public int age = 5;

    }

    public static void main(String[] args) throws IOException {

        Cat cat = new Cat();

        //Zapisz kota do pliku
        FileOutputStream fileOutput = new FileOutputStream("Plik111.txt");
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutput);
        outputStream.writeObject(cat);
        fileOutput.close();
        outputStream.close();

    }
}
