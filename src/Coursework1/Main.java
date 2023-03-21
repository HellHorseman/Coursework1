package Coursework1;

public class Main {
    static Employee[] employee = new Employee[10];

    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Имя", "Отчество", "Фамлия", 1, 120_580);
        employee[1] = new Employee("Имя", "Отчество", "Фамлия", 2, 67_035);
        employee[2] = new Employee("Имя", "Отчество", "Фамлия", 2, 48_750);
        employee[3] = new Employee("Имя", "Отчество", "Фамлия", 3, 35_690);
        employee[4] = new Employee("Имя", "Отчество", "Фамлия", 3, 33_480);
        employee[5] = new Employee("Имя", "Отчество", "Фамлия", 3, 34_019);
        employee[6] = new Employee("Имя", "Отчество", "Фамлия", 4, 18_220);
        employee[7] = new Employee("Имя", "Отчество", "Фамлия", 4, 17_098);
        employee[8] = new Employee("Имя", "Отчество", "Фамлия", 5, 18_056);
        employee[9] = new Employee("Имя", "Отчество", "Фамилия", 5, 20_120);

        print();
        sumSalary();

    }

    public static void print() {
        for (Employee i : employee) {
            System.out.println(i);
        }
    }

    public static void sumSalary() {
        int sumSalary = 0;
        for (Employee i : employee) {
            int j = i.getSalary();
            sumSalary += j;
        }
        System.out.println("Сумма зарплаты сотрудников " + sumSalary);
    }

}
