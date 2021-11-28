package com.company;

public class Employee
{
    public String name = "";
    public String profession = "";
    int age = 0;
    int salary = 0;

    public void setName(String name) {
        this.name = name;
    }

    public void setMothSalary(int salary)
    {
        this.salary = salary;
    }

    public void setProfession(String profession){
        this.profession = profession;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmployee(String name,
                            String profession,
                            int age,
                            int salary)
    {
        this.setName(name);
        this.setProfession(profession);
        this.setAge(age);
        this.setMothSalary(salary);
    }

    public String getName() {
        return name;
    }

    public String getProfession() {
        return profession;
    }

    public int getAge() {
        return age;
    }

    public int getMothSalary() {
        return salary;
    }

    public void printEmployee()
    {
        System.out.println("ФИО: "+ this.getName());
        System.out.println("Профессия: "+ this.getProfession());
        System.out.println("Возраст: "+ this.getAge());
        System.out.println("Зарплата: "+ this.getMothSalary());
    }
}
