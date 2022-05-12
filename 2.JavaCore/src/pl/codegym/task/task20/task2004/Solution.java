package pl.codegym.task.task20.task2004;

import java.io.*;

/* 
Odczytywanie i zapisywanie pól statycznych do pliku
*/

public class Solution {

    public static void main(String[] args) {
        // Plik your_file_name.tmp znajdziesz w swoim folderze plików tymczasowych, ewentualnie dostosuj outputStream/inputStream do rzeczywistej lokalizacji pliku
        try {
            File yourFile = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            ClassWithStatic classWithStatic = new ClassWithStatic();
            classWithStatic.i = 3;
            classWithStatic.j = 4;
            classWithStatic.save(outputStream);
            outputStream.flush();

            ClassWithStatic loadedObject = new ClassWithStatic();
            loadedObject.staticString = "something";
            loadedObject.i = 6;
            loadedObject.j = 7;

            loadedObject.load(inputStream);
            // Tutaj sprawdź, czy obiekt classWithStatic jest równy obiektowi loadedObject
            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, coś jest nie tak z moim plikiem");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, coś jest nie tak z metodą save/load");
        }
    }

    public static class ClassWithStatic {

        public static String staticString = "To jest statyczny ciąg testowy";
        public int i;
        public int j;

        public void save(OutputStream outputStream) throws Exception {
            // Implementuj tę metodę
            PrintWriter writer = new PrintWriter(outputStream);
            writer.println(staticString);
            writer.println(this.i);
            writer.println(this.j);

            writer.close();

        }

        public void load(InputStream inputStream) throws Exception {
            // Implementuj tę metodę
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            staticString = reader.readLine();
            this.i = Integer.parseInt(reader.readLine());
            this.j = Integer.parseInt(reader.readLine());

            reader.close();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ClassWithStatic that = (ClassWithStatic) o;

            if (i != that.i) return false;
            return j == that.j;
        }

        @Override
        public int hashCode() {
            int result = i;
            result = 31 * result + j;
            return result;
        }
    }
}
