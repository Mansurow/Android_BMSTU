package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static int  countManagers = 80,
                      countOperators = 180,
                      countTopManager = 10;

    private static int countPrintTop = 15,
                       countPrintLow = 30;

    public static void main(String[] args) {

        Company Android = new Company();
        Android.setInCome( (long)(Math.random() * 10000000));

        System.out.printf("Доход Компании: %d руб.\n", Android.getInCome());
        System.out.printf("Наймем %d операторов, %d менеджеров, %d топ менеджеров.\n", countOperators,
                                                                                       countManagers,
                                                                                       countTopManager);
        for (int i = 0; i < countOperators; i++)
        {
            Android.hire("NameOperator", "Operator",
                    (int) (Math.random() * 10 + 19),
                    (int) (Math.random() * 1000 + 500) * 100);
        }

        for (int i = 0; i < countManagers; i++)
        {
            Android.hire("NameManager", "Manager",
                    (int) (Math.random() * 10 + 21),
                    (int) (Math.random() * 1000 + 1000) * 100);
        }

        for (int i = 0; i < countTopManager; i++)
        {
            Android.hire("NameTopManager", "TopManager",
                    (int) (Math.random() * 10 + 19),
                    (int) (Math.random() * 1000 + 1500) * 100);
        }
        System.out.println("Сотрудники успешно наняты\n");
        Android.employees = Android.collectiobClassProffession();

        Company SortTop = new Company();
        Company SortLow = new Company();

        SortTop.employees = Android.getTopSalaryStaff(Android.employees.size());
        System.out.println("\nСписок 10-15 самых высоких зарплат в компании:");
        SortTop.printListEployeesSalary(countPrintTop);

        SortLow.employees = Android.getLowerSalaryStaff(Android.employees.size());
        System.out.println("\nСписок 30 самых низких зарплат в компании:");
        SortLow.printListEployeesSalary(countPrintLow);

        System.out.printf("Уволим (50 процентов) %d операторов, %d менеджеров, %d топ менеджеров.\n", countOperators / 2,
                countManagers / 2,
                countTopManager / 2);
        for (int i = 0; i < countOperators / 2; i++)
            Android.fire("NameOperator", "Operator");

        for (int i = 0; i < countManagers / 2; i++)
            Android.fire("NameManager", "Manager");

        for (int i = 0; i < countTopManager / 2; i++)
            Android.fire("NameTopManager", "TopManager");

        Android.employees = Android.collectiobClassProffession();
        System.out.println("Сотрудники успешно уволены\n");
        SortTop.employees = Android.getTopSalaryStaff(Android.employees.size());
        System.out.println("\nСписок 10-15 самых высоких зарплат в компании:");
        SortTop.printListEployeesSalary(countPrintTop);

        SortLow.employees = Android.getLowerSalaryStaff(Android.employees.size());
        System.out.println("\nСписок 30 самых низких зарплат в компании:");
        SortLow.printListEployeesSalary(countPrintLow);
    }
}
