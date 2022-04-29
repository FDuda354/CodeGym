package pl.codegym.task.task18.task1812;

import java.io.*;

/* 
Rozszerzanie AmigoOutputStream
*/

public class QuestionFileOutputStream implements AmigoOutputStream {

    private AmigoOutputStream amigoOutputStream;
    public QuestionFileOutputStream(AmigoOutputStream amigoOutputStream) {
        this.amigoOutputStream = amigoOutputStream;
    }

    @Override
    public void flush() throws IOException {

        amigoOutputStream.flush();

    }

    @Override
    public void write(int b) throws IOException {
        amigoOutputStream.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {

        amigoOutputStream.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {

        amigoOutputStream.write(b,off,len);

    }

    @Override
    public void close() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Czy naprawdę chcesz zamknąć strumień? T/N");

        if(reader.readLine().equals("T"))
            amigoOutputStream.close();

    }
}

