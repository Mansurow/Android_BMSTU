package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Вывести последовательность 1, -2, 3, -4, 5, -6...,\n" +
                           " длина задаётся пользователем ");

        System.out.print("Введите длину последовательности: ");
        int len = in.nextInt();

        for (int i = 0; i < len; i++)
            if (i % 2 == 0)
                System.out.print(i + 1 + ", ");
            else
                System.out.print(-(i + 1) + ", ");
        System.out.println("...");
    }
}
