package org.example;

public class Task_6 {
    public static void main(String[] args) {
        int a = 1, b = 2;

        a ^= b;
        b ^= a;
        a ^= b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
