package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Найти площадь и периметр параллелограмма.\n" +
                            "Известны обе стороны и высота.");
        int a, b, h;
        int P, S;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите а и в стороны параллелограмма: ");
        a = in.nextInt();
        b = in.nextInt();
        System.out.print("Введите высоту ha параллелограмма: ");
        h = in.nextInt();
        P = 2 * (a + b);
        S = a * h;
        System.out.println("P = " + P);
        System.out.println("S = " + S);
    }
}
