package org.example;

import java.util.Scanner;

public class Task_4 {
    public static void main (String[] args){
        System.out.println("Введи n ");
        Scanner input_n  = new Scanner(System.in);
        double n = input_n.nextDouble();

        long c = Math.round(n);
        System.out.println("Результат: " + c);
    }
}
