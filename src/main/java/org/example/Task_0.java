package org.example;
import java.util.Scanner;

public class Task_0 {
    public static void main(String[] args) {
        System.out.println("Введи user name");

        Scanner inputName = new Scanner(System.in);
        String userName= inputName.nextLine();

        System.out.println("Hello " + userName);

    }
}
