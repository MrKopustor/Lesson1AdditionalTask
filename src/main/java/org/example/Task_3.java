package org.example;

import java.util.Scanner;

public class Task_3 {
    public static void main (String[] args){
        int a, b, c;

        System.out.println("Введи n ");
        Scanner input_n  = new Scanner(System.in);
        int n = input_n.nextInt();

        a = n/100;
        b = (n%100)/10;
        c = n%10;

        System.out.println("n = " + (a + b + c));
    }
}
