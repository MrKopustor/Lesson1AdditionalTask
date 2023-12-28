# 1. Введение в Java (19.12.2023)
## Домашнее задание
|#|Description|Difficulty|Tag|Solution|
|--:|---|---|---|---|
|0|[Task 0](#Task-0)|---|---|Java|
|1|[Task 1](#Task-1)|---|---|Java|
|2|[Task 2](#Task-2)|---|---|Java|
|3|[Task 3](#Task-3)|---|---|Java|
|4|[Task 4](#Task-4)|---|---|Java|
|5|[Task 5](#Task-5)|---|---|Java|
|6|[Task 6](#Task-6)|---|---|Java|

## Task 0: 
Написать программу для вывода «Hello <user>» на консоль. Пусть <user> вводиться с консоли, программа должна потребовать ввод <user>. Для чтения с консоли используйте класс Scanner.

```java
package org.example;
import java.util.Scanner;

public class Task0 {
    public static void main(String[] args) {
        System.out.println("Введи user name");

        Scanner inputName = new Scanner(System.in);
        String userName= inputName.nextLine();

        System.out.println("Hello " + userName);

    }
}
```

## Task 1:
Написать приложение, которое будет вычислять и выводить значение по формуле: a=4*(b+c-1)/2; b и c задаем в коде самостоятельно.

```java
package org.example;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введи чиcло b");

        Scanner inputB  = new Scanner(System.in);
        double b = inputB.nextDouble();


        System.out.println("Введи чиcло c");

        Scanner inputC = new Scanner(System.in);
        double c = inputC.nextDouble();

        double a = 4 * (b + c - 1)/2;

        System.out.println("Результат равен " + a);
    }
}
```

## Task 2:
В переменной n хранится двузначное число. Создайте программу, вычисляющую и выводящую на экран сумму цифр n. Например: n =26, в результате мы должны получить 8 (2+6).

```java
package org.example;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        int a, b;

        System.out.println("Введи n ");
        Scanner inputN  = new Scanner(System.in);
        int n = inputN.nextInt();

        a = n/10;
        b = n%10;

        System.out.println("n = " + (a + b));
    }
}
```

## Task 3:
В переменной n хранится трёхзначное число. Создайте программу, вычисляющую и выводящую на экран сумму цифр n. Например: n =126, в результате мы должны получить 9 (1+2+6).

```java
package org.example;

import java.util.Scanner;

public class Task3 {
    public static void main (String[] args){
        int a, b, c;

        System.out.println("Введи n ");
        Scanner inputN  = new Scanner(System.in);
        int n = inputN.nextInt();

        a = n/100;
        b = (n%100)/10;
        c = n%10;

        System.out.println("n = " + (a + b + c));
    }
}
```

## Task 4:
В переменной n хранится вещественное число с ненулевой дробной частью. Создайте программу, округляющую число n до ближайшего целого и выводящую результат на экран.

```java
package org.example;

import java.util.Scanner;

public class Task4 {
    public static void main (String[] args){
        System.out.println("Введи n ");
        Scanner inputN  = new Scanner(System.in);
        double n = inputN.nextDouble();

        long c = Math.round(n);
        System.out.println("Результат: " + c);
    }
}
```

## Task 5:
В переменных q и w хранятся два натуральных числа. Создайте программу, выводящую на экран результат деления q на w с остатком. Пример вывода программы (для случая, когда в q хранится 21, а в w хранится 8): 21 / 8 = 2 и 5 в остатке.

```java
package org.example;

public class Task5 {
    public static void main (String[] args){
        int q = 21, w = 8, e, r;

        e = q / w;
        r = q % w;

        System.out.println(q + " / " + w + " = " + e + " и " + r + " в оcтатке");
    }
}
```

## Task 6:
Написать программу которая будет менять местами значение целочисленных переменных. Пример: int a = 1; int b = 2; //код (ваше решение) sout(a); //выведет 2 sout(b); //выведет 1 Усовершенствовать программу, использовать только 2 входные переменные (a,b);

```java
package org.example;

public class Task6 {
    public static void main(String[] args) {
        int a = 1, b = 2;

        a ^= b;
        b ^= a;
        a ^= b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
```
