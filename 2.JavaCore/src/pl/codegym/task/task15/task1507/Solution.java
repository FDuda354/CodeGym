package pl.codegym.task.task15.task1507;

/* 
OOP: przeciążanie metod
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Wypełnianie obiektami typu String");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, Integer value) {
        System.out.println("Wypełnianie obiektami typu Integer");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, Double value) {
        System.out.println("Wypełnianie obiektami typu Double");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, Float value) {
        System.out.println("Wypełnianie obiektami typu Float");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, Long value) {
        System.out.println("Wypełnianie obiektami typu Long");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, Boolean value) {
        System.out.println("Wypełnianie obiektami typu Boolean");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, Short value) {
        System.out.println("Wypełnianie obiektami typu Short");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, Character value) {
        System.out.println("Wypełnianie obiektami typu Character");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, Byte value) {
        System.out.println("Wypełnianie obiektami typu Byte");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
}
