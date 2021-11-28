package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    System.out.println("""
                Создайте матрицу, размер задается пользователем.
                Заполните ее случайными числами. Посчитайте сумму
                элементов ее главной диагонали, затем побочной
                """);

        int n = 0, m = 0;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                matrix[i][j] = (int) Math.round(Math.random() * 50);

        System.out.println("Матрица создана:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if (j != m - 1)
                    System.out.printf("%3d ", matrix[i][j]);
                else
                    System.out.printf("%3d\n", matrix[i][j]);

        int sumM = 0, sumD = 0;
        int l = n >= m ? n: m;

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
            {
                if (i == j)
                    sumM += matrix[i][j];
                if (i + j == l - 1)
                    sumD += matrix[i][j];
            }
        System.out.printf("Сумма элементов главной диагонали: %d\n", sumM);
        System.out.printf("Сумма элементов побочной диагонали: %d\n", sumD);
    }
}
