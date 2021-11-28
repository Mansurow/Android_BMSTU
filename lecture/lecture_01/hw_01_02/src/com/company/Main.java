package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Найти периметр 5-ти угольника.\n" +
                "Первая сторона равна 5.7, каждая следующая больше на 2");

        double a = 5.7, b = a + 2,
                        c = b + 2,
                        d = c + 2,
                        e = d + 2;
        double p = a + b + c + d + e;
        System.out.println("Pabcde = " + p);
    }
}
