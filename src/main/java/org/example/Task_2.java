package org.example;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args){
        int a, b;

        System.out.println("Введи n ");
        Scanner input_n  = new Scanner(System.in);
        int n = input_n.nextInt();

        a = n/10;
        b = n%10;

        System.out.println("n = " + (a + b));
    }
}
