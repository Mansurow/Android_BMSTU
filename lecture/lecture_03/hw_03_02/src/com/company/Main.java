package com.company;

public class Main {
    private static final int N = 50;
    public static void main(String[] args) {
        System.out.println("""
                Создайте массив из всех нечётных чисел от 1 до 99,
                выведите в обратном порядке (99 97 95 93 … 7 5 3 1).
                """);

        int[] nums = new int[N];

        for (int i = 0, num = 1; i < N; i++, num += 2)
            nums[i] = num;

        for (int i = N - 1; i >= 0; i--)
            System.out.printf("%d ", nums[i]);
        System.out.println();

    }
}
