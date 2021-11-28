package com.company;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Сделайте программу, которая выводит в консоль таблицу\n" +
                           "умножения от 1 до 9 (для вывода используйте System.out.printf\n" +
                           "(\"%4d\", toPrint); (toPrint - выводимая переменная), это сделает\n" +
                           "таблицу более ровной)\n");

        for (int i = 1; i <= 9; i++)
        {
            for (int j = 1; j <= 9; j++)
                System.out.printf("%2d * %2d = %4d  ", j, i, i * j);
            System.out.println();
        }
    }
}
