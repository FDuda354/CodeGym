package pl.codegym.task.task19.task1902;

/* 
Adapter
*/

import java.io.FileOutputStream;
import java.io.IOException;

public class AdapterFileOutputStream implements AmigoStringWriter{

    private FileOutputStream fileOutputStream;

    public AdapterFileOutputStream(FileOutputStream fileOutputStream) {
        this.fileOutputStream = fileOutputStream;
    }

    public static void main(String[] args) throws IOException {



        AmigoStringWriter writer = new AdapterFileOutputStream(new FileOutputStream("test999.txt"));

        writer.writeString("O to chdozi!");

    }


    @Override
    public void flush() throws IOException {

        this.fileOutputStream.flush();

    }

    @Override
    public void writeString(String s) throws IOException {

        this.fileOutputStream.write(s.getBytes());

    }

    @Override
    public void close() throws IOException {

        this.fileOutputStream.close();

    }
}

