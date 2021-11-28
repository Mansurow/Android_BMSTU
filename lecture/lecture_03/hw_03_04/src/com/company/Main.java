package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("""
                Создайте матрицу, размер которой задается пользователем,
                заполните рандомом, выведите ее на экран. Сохраните наибольшие
                элементы из каждой строки в другой массив, выведите их на экран
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

        int[] maxElementsInColumn = new int[n];

        for (int i = 0, k = 0; i < n; i++, k++)
        {
            maxElementsInColumn[k] = matrix[i][0];
            for (int j = 0; j < m; j++)
                if (maxElementsInColumn[k] < matrix[i][j])
                    maxElementsInColumn[k] = matrix[i][j];
        }

        System.out.print("Максимальные элементы в каждой строке: ");
        for (int i = 0; i < n; i++)
            if (i != n - 1)
                System.out.printf("%d ", maxElementsInColumn[i]);
            else
                System.out.println(maxElementsInColumn[i]);
    }
}
