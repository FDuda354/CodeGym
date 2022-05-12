package pl.codegym.task.task20.task2001;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Odczytywanie i zapisywanie do pliku: Human
*/

public class Solution {

    public static void main(String[] args) {
        // Zaktualizuj ciąg przekazany do metody createTempFile na podstawie ścieżki do pliku na dysku twardym
        try {
            File yourFile = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            Human smith = new Human("Smith", new Asset("dom", 999_999.99), new Asset("samochód", 2999.99));
            smith.save(outputStream);
            outputStream.flush();

            Human somePerson = new Human();
            somePerson.load(inputStream);
            inputStream.close();
            // Sprawdź czy smith jest równy somePerson

        } catch (IOException e) {
            // e.printStackTrace();
            System.out.println("Oops, coś jest nie tak z moim plikiem");
        } catch (Exception e) {
            // e.printStackTrace();
            System.out.println("Oops, coś jest nie tak z metodą save/load");
        }
    }

    public static class Human {

        public String name;
        public List<Asset> assets = new ArrayList<>();

        public Human() {
        }

        public Human(String name, Asset... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Human human = (Human) o;

            if (name != null ? !name.equals(human.name) : human.name != null) return false;
            return assets != null ? assets.equals(human.assets) : human.assets == null;
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + (assets != null ? assets.hashCode() : 0);
            return result;
        }

        public void save(OutputStream outputStream) throws Exception {
            // Implementuj tę metodę

                PrintWriter writer = new PrintWriter(outputStream);
                writer.println(this.name);
                assets.stream()
                        .forEach(asset -> writer.println(asset.getName() + "\n" + asset.getPrice()));
                writer.close();




        }

        public void load(InputStream inputStream) throws Exception {
            // Implementuj tę metodę
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

                this.name = reader.readLine();
                while (reader.ready())
                    assets.add(new Asset(reader.readLine(),Double.parseDouble(reader.readLine())));


                reader.close();


        }
    }
}
