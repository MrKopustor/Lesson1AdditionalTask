package org.example;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        System.out.println("Введи чиcло b");

        Scanner input_b  = new Scanner(System.in);
        double b = input_b.nextDouble();


        System.out.println("Введи чиcло c");

        Scanner input_a = new Scanner(System.in);
        double c = input_a.nextDouble();

        double a = 4 * (b + c - 1)/2;
        //В уcловие не cказано какие чиcла мы будем вводить Целочиcленные\С плавающей точной
        //Мы выбрали тип данных Doudle
        // в этом случаи мы сможем вводить как целые числа, так и с плавающей точкой

        System.out.println("Результат равен " + a);
    }
}
