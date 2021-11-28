package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("Пользователь вводит номер месяца,\n" +
                "а программа выводит его название. Также нужна\n" +
                "проверка входных данных (число должно быть от\n" +
                "1 до 12) (решить через switch)");

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число для определения месяца: ");
        String numStr = in.next();

        int flag = 0, sign = 0;
        for (int i = 0; i < numStr.length() && flag == 0; i++)
        {
            if (!(numStr.charAt(i) == '0') &&
                    !(numStr.charAt(i) == '1') &&
                    !(numStr.charAt(i) == '2') &&
                    !(numStr.charAt(i) == '3') &&
                    !(numStr.charAt(i) == '4') &&
                    !(numStr.charAt(i) == '5') &&
                    !(numStr.charAt(i) == '6') &&
                    !(numStr.charAt(i) == '7') &&
                    !(numStr.charAt(i) == '8') &&
                    !(numStr.charAt(i) == '9') &&
                    !(numStr.charAt(i) == '-') &&
                    !(numStr.charAt(i) == '+'))
                flag = 1;
            if (numStr.charAt(i) == '+' || numStr.charAt(i) == '-')
            {
                if (sign == 0)
                    sign = 1;
                else
                    flag = 1;
            }
        }

        if (flag == 0)
        {
            System.out.print("Месяц - ");
            int num =Integer.parseInt(numStr);
            switch (num) {
                case 1 -> System.out.println("Январь.");
                case 2 -> System.out.println("Февраль.");
                case 3 -> System.out.println("Март.");
                case 4 -> System.out.println("Апрель.");
                case 5 -> System.out.println("Май.");
                case 6 -> System.out.println("Июнь.");
                case 7 -> System.out.println("Июль.");
                case 8 -> System.out.println("Август.");
                case 9 -> System.out.println("Сентябрь.");
                case 10 -> System.out.println("Октябрь.");
                case 11 -> System.out.println("Ноябрь.");
                case 12 -> System.out.println("Декабрь.");
                default -> System.out.println("Неизвестно.");
            }
        }
        else
            System.out.println("Это не число, а строка!");
    }
}
