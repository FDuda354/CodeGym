package pl.codegym.task.task20.task2017;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* 
Deserializacja
*/

public class Solution {

    public A getOriginalObject(ObjectInputStream objectStream)  {

        try
        {
            return (A) objectStream.readObject();
        }catch (Exception e)
        {
            System.out.println(e);
            return null;
        }

    }

    public class A implements Serializable {
    }

    public class B extends A {
        public B() {
            System.out.println("wewnątrz B");
        }
    }

    public static void main(String[] args) {

    }
}
