package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a = 3, b = 4, c = 5, h = 0;
        System.out.println("Программа нходит объем трейгольной пирамиды по заданной высоте,\n" +
                "гдe стороны оснований заданы "+ a + ", " + b + ", " + c + ".");

        double volume = 0.0, p = 0.0, s = 0.0;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите высоту треугольной пирамиды: ");
        h = in.nextInt();
        p = (double) (a + b + c) / 2;
        s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        volume = 1.0/3.0 * (h * s);
        System.out.println("Result: " + volume);
    }
}

