package com.company;

import java.util.List;

public class Manager extends Employee {
    private final double bonus_percent = 0.05;
    private int inComeCompany;
    private final String position = "Manager";

    public void setInComeCompany(int inComeCompany) {
       this.inComeCompany = inComeCompany;
    }

    public int getMothSalary(int InComeCompany) {
        return this.salary + (int) (InComeCompany * bonus_percent);
    }

}
