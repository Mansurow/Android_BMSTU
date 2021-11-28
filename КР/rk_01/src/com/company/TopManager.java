package com.company;

public class TopManager extends Employee
{
    private final double bonus_percent = 15.0;
    private final long afterInComeCompany = 10000000;
    private final String position = "TopManager";

    public int getMothSalary(long inComeCompany)
    {
        if (inComeCompany > afterInComeCompany)
            this.salary += this.salary * bonus_percent;
        return this.salary;
    }

}
