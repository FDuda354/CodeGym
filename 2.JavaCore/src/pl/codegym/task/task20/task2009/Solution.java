package pl.codegym.task.task20.task2009;

/* 
W jaki sposób serializuje się pola statyczne?
*/

import java.io.*;

public class Solution {

    public static class User implements Serializable {

        @Serial
        private static final long serialVersionUID = 5414931988620241176L;
        public static String staticString = "To jest statyczny ciąg testowy";
       String name;
       String surname;
     transient String password;
       int age;

    }
    static void saveObject(Object ob) throws IOException {
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("Osoba.dot")))
        {
            outputStream.writeObject(ob);
            System.out.println("zapisano dane!");
        }
    }

    static Object loadObject () throws IOException, ClassNotFoundException {
        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("Osoba.dot")))
        {

            System.out.println("odczytano dane!");
            return inputStream.readObject();
        }
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        User user = new User();

        user.name = "filip";
        user.surname = "duda";
        user.password = "pasword22";
        user.age = 13;

        saveObject(user);


        User newUser = (User) loadObject();

        System.out.println(newUser.name);
        System.out.println(newUser.surname);
        System.out.println(newUser.age);
        //jeśli pole password jest null to wyswietl "brak hasła"
        System.out.println(newUser.password == null ? "brak hasla" : newUser.password);





    }


}
