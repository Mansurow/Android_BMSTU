package com.company;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Создайте массив из всех чётных чисел от 2 до 20\n" +
                "и выведите элементы массива на экран сначала в строку,\n" +
                "отделяя один элемент от другого пробелом, а затем в\n" +
                "столбик (отделяя один элемент от другого началом новой строки).\n" +
                "2 4 6 … 20\n" +
                "2\n" +
                "4\n" +
                "6\n" +
                "…\n" +
                "20\n");

        int[] nums = new int[10];

        for (int i = 0, num = 2; i < 10; i++, num += 2)
            nums[i] = num;

        for (int i = 0; i < 10; i++)
            System.out.printf("%d ", nums[i]);
        System.out.println();
        for (int i = 0; i < 10; i++)
            System.out.printf("%d\n", nums[i]);
    }
}
