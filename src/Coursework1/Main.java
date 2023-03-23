package Coursework1;

import java.util.Scanner;

public class Main {
    static Employee[] employee = new Employee[10];


    public static void main(String[] args) {
        employee[0] = new Employee("Имя", "Отчество", "Фамилия", 1, 120_580);
        employee[1] = new Employee("Имя", "Отчество", "Фамилия", 2, 67_035);
        employee[2] = new Employee("Имя", "Отчество", "Фамилия", 2, 48_750);
        employee[3] = new Employee("Имя", "Отчество", "Фамилия", 3, 35_690);
        employee[4] = new Employee("Имя", "Отчество", "Фамилия", 3, 33_480);
        employee[5] = new Employee("Имя", "Отчество", "Фамилия", 3, 34_019);
        employee[6] = new Employee("Имя", "Отчество", "Фамилия", 4, 18_220);
        employee[7] = new Employee("Имя", "Отчество", "Фамилия", 4, 17_098);
        employee[8] = new Employee("Имя", "Отчество", "Фамилия", 5, 18_056);
        employee[9] = new Employee("Имя", "Отчество", "Фамилия", 5, 20_120);
//        print();
//        sumSalary();
//        System.out.println("Сумма зарплаты сотрудников " + sumSalary());
//        scanMinSalary();
//        scanMaxSalary();
//        midSalary();
//        printEmployeeNames();
//        indexSalary();
//        minDeptSal(3);
//        maxDeptSal(5);
        sumDeptSal(2);
    }


    public static void print() {
        for (Employee i : employee) {
            System.out.println(i);
        }
    }

    public static int sumSalary() {
        int sumSalary = 0;
        for (Employee i : employee) {
            int j = i.getSalary();
            sumSalary += j;
        }
        return sumSalary;
    }

    public static void scanMinSalary() {
        int minSalary = employee[0].getSalary();
        for (Employee i : employee) {
            int j = i.getSalary();
            if (j < minSalary) {
                minSalary = j;
            }
        }
        System.out.println("Минимальная зарплата сотрудника = " + minSalary);
    }

    public static void scanMaxSalary() {
        int maxSalary = employee[0].getSalary();
        for (Employee i : employee) {
            int j = i.getSalary();
            if (j > maxSalary) {
                maxSalary = j;
            }
        }
        System.out.println("Максимальная зарплата сотрудника = " + maxSalary);
    }

    public static void midSalary() {
        int midSalary = sumSalary();
        midSalary = midSalary / employee.length;
        System.out.println("Средняя зарплата = " + midSalary);
    }

    public static void printEmployeeNames() {
        for (Employee i : employee) {
            String n = i.getName();
            String p = i.getPatronymic();
            String s = i.getSurname();
            System.out.println(n + " " + p + " " + s);
        }
    }

    public static void indexSalary() {
        for (Employee i : employee) {
            int j = i.getSalary();
            int index = (j / 100) * 15;
            j = j + index;
            i.setSalary(j);
            System.out.println("При повышении на 15%, зарплата соответственно " + j);
        }
    }

    public static void minDeptSal(int dept) {
        int minSalary = 2_147_483_647;
        for (Employee i : employee) {
            int j = i.getDepartment();
            if (j == dept) {
                int a = i.getSalary();
                if (a < minSalary) {
                    minSalary = a;
                }
            }

        }
        System.out.println("Минимальная зарплата в отделе " + minSalary);
    }
    public static void maxDeptSal(int dept) {
        int maxSalary = 0;
        for (Employee i : employee) {
            int j = i.getDepartment();
            if (j == dept) {
                int a = i.getSalary();
                if (a > maxSalary) {
                    maxSalary = a;
                }
            }

        }
        System.out.println("Максимальная зарплата в отделе " + maxSalary);
    }
    public static void sumDeptSal(int dept) {
        int sumDeptSalary = 0;
        for (Employee i : employee) {
            int j = i.getDepartment();
            if (j == dept) {
                int a = i.getSalary();
                    sumDeptSalary += a;
            }

        }
        System.out.println("Затраты на зарплату в отделе " + sumDeptSalary);
    }
}