package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Company {

    List<Employee> employees = new ArrayList<Employee>();
    private List<Manager> managers = new ArrayList<Manager>();
    private List<TopManager> topManagers = new ArrayList<TopManager>();
    private List<Operator> operators = new ArrayList<Operator>();

    long inCome = 0;

    public void setInCome(long inCome) {
        this.inCome = inCome;
    }

    public long getInCome() {
        return inCome;
    }

    public void hireAll() {
        System.out.print("Количесвто сотрудников для ввода: ");
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        for (int i = 0; i < count; i++)
            this.hire();
    }

    public void hire(String name, String prof, int age, int salary)
    {
        if (prof.equals("Manager"))
        {
            Manager manager = new Manager();
            manager.setEmployee(name, prof, age, salary);
            managers.add(manager);
        }
        else if (prof.equals("TopManager"))
        {
            TopManager topManager = new TopManager();
            topManager.setEmployee(name, prof, age, salary);

            topManagers.add(topManager);
        }
        else if (prof.equals("Operator"))
        {
            Operator operator = new Operator();
            operator.setEmployee(name, prof, age, salary);
            operators.add(operator);
        }
        else
        {
            Employee employee = new Employee();
            employee.setEmployee(name, prof, age, salary);
            employees.add(employee);
        }
    }

    public void hire() {
        Employee employee;
        System.out.print("\nДанные для найма сотрудлника:\n");
        employee = inputDataEmployee();
        employees.add(employee);
    }

    public void fire(String name, String prof)
    {
        if (prof.equals("Manager"))
        {
            for (int i = 0; i < managers.size(); i++)
                if (managers.get(i).getName().equals(name)) {
                    managers.remove(managers.get(i));
                    break;
            }
        }
        else if (prof.equals("TopManger"))
        {
            for (int i = 0; i < topManagers.size(); i++)
                if (topManagers.get(i).getName().equals(name)) {
                    topManagers.remove(topManagers.get(i));
                    break;
            }
        }
        else if (prof.equals("Operator"))
        {
            for (int i = 0; i < operators.size(); i++)
                if (operators.get(i).getName().equals(name)) {
                    operators.remove(operators.get(i));
                    break;
                }
        }
    }

    public void fire() {
        if (employees.size() == 0)
            System.out.println("Список сотрудников пуст!");
        else
        {
            String name, prof;
            Scanner in = new Scanner(System.in);
            System.out.print("\nДанные для увольнения сотрудлника:\n");
            System.out.print("   ФИО: ");
            name = in.nextLine();
            System.out.print("   Специальность: ");
            prof = in.nextLine();

            for (int i = 0; i < employees.size(); i++)
                if (employees.get(i).getName().equals(name) && employees.get(i).getProfession().equals(prof)) {
                    employees.remove(employees.get(i));
                    break;
                }
        }
    }

    public static void swapEmployee(List<Employee> employees, int i, int j) {
        Employee buff = employees.get(i);
        employees.set(i, employees.get(j));
        employees.set(j, buff);
    }

    public List<Employee> copyList(int count) {
        List<Employee> newList = new ArrayList<Employee>();

        for (int i = 0; i < count; i++)
            newList.add(employees.get(i));

        return newList;
    }

    public List<Employee> getTopSalaryStaff(int count) {
        List<Employee> sortList = this.copyList(employees.size());

        for (int i = 0; i < count; i++)
            for (int j = i + 1; j < count; j++)
                if (sortList.get(i).getMothSalary() < sortList.get(j).getMothSalary())
                    swapEmployee(sortList, i, j);

        return sortList;
    }

    public List<Employee> getLowerSalaryStaff(int count) {
        List<Employee> sortList = this.copyList(employees.size());

        for (int i = 0; i < count; i++)
            for (int j = i + 1; j < count; j++)
                if (sortList.get(i).getMothSalary() > sortList.get(j).getMothSalary())
                    swapEmployee(sortList, i, j);

        return sortList;
    }

    public List<Employee>  collectiobClassProffession(){
        List<Employee> list = new ArrayList<Employee>();
        for (int i = 0; i < managers.size(); i++)
        {
            Employee employee = new Employee();
            int inCome = (int) (Math.random() * 10000 + 115000);
            while (inCome > 140000)
                inCome = (int) (Math.random() * 100000 + 115000);
            employee.setEmployee(managers.get(i).getName(),
                                 managers.get(i).getProfession(),
                                 managers.get(i).getAge(),
                                 managers.get(i).getMothSalary(inCome));
            list.add(employee);
        }

        for (int i = 0; i < operators.size(); i++)
        {
            Employee employee = new Employee();
            employee.setEmployee(operators.get(i).getName(),
                    operators.get(i).getProfession(),
                    operators.get(i).getAge(),
                    operators.get(i).getMothSalary());
            list.add(employee);
        }

        for (int i = 0; i < topManagers.size(); i++)
        {
            Employee employee = new Employee();
            employee.setEmployee(topManagers.get(i).getName(),
                    topManagers.get(i).getProfession(),
                    topManagers.get(i).getAge(),
                    topManagers.get(i).getMothSalary(this.getInCome()));
            list.add(employee);
        }

        return list;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void printListAllClasses()
    {
        if (managers.size() == 0 &&
                topManagers.size() == 0 &&
                operators.size() == 0)
            System.out.println("Список сотрудников пуст!");
        else
        {
            for (int i = 0; i < operators.size(); i++)
                operators.get(i).printEmployee();
            for (int i = 0; i < managers.size(); i++)
                managers.get(i).printEmployee();
            for (int i = 0; i < topManagers.size(); i++)
                topManagers.get(i).printEmployee();
        }
    }

    public void printListEmployees() {
        if (employees.size() == 0)
            System.out.println("Список сотрудников пуст!");
        else
        {
            for (int i = 0; i < employees.size(); i++)
                employees.get(i).printEmployee();
        }
    }

    public void printListEployeesSalary(int count)
    {
        if (employees.size() == 0)
            System.out.println("Список сотрудников пуст!");
        else
        {
            for (int i = 0; i < count; i++)
                System.out.printf("%d руб.\n", employees.get(i).getMothSalary());
        }
    }

    private static int checkInt(String numStr)
    {
        int flag = 1, sign = 0;
        for (int i = 0; i < numStr.length() && flag == 1; i++)
        {
            if (!(numStr.charAt(i) == '0') &&
                    !(numStr.charAt(i) == '1') &&
                    !(numStr.charAt(i) == '2') &&
                    !(numStr.charAt(i) == '3') &&
                    !(numStr.charAt(i) == '4') &&
                    !(numStr.charAt(i) == '5') &&
                    !(numStr.charAt(i) == '6') &&
                    !(numStr.charAt(i) == '7') &&
                    !(numStr.charAt(i) == '8') &&
                    !(numStr.charAt(i) == '9') &&
                    !(numStr.charAt(i) == '-') &&
                    !(numStr.charAt(i) == '+'))
                flag = 0;
            if (numStr.charAt(i) == '+' || numStr.charAt(i) == '-')
            {
                if (sign == 0)
                    sign = 1;
                else
                    flag = 0;
            }
        }

        return flag;
    }

    private static Employee inputDataEmployee()
    {
        Employee employee = new Employee();
        Scanner in = new Scanner(System.in);

        System.out.print("   ФИО: ");
        employee.setName(in.nextLine());
        System.out.print("   Специальность: ");
        employee.setProfession(in.nextLine());

        System.out.print("   Возраст: ");
        employee.setAge(in.nextInt());
        System.out.print("   Зарплата: ");
        employee.setMothSalary(in.nextInt());

        return employee;
    }
}
