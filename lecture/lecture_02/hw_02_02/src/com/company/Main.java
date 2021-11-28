package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Выведите на экран все положительные делители\n" +
              "натурального числа, введённого пользователем\n" +
              "с клавиатуры.");

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();

        System.out.println("Все натураьные числа делители:");
        for (int i = 1; i <= num; i++)
            if (num % i == 0 && i < num)
                System.out.print(i + ", ");
            else if (num % i == 0 && i == num)
                System.out.print(i + ".");
        System.out.println();

    }
}
