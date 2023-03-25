package Coursework1;

public class Main {

    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.addEmployee("Имя", "Отчество", "Фамилия", 1, 120_580);
        employeeBook.addEmployee("Имя", "Отчество", "Фамилия", 2, 67_035);
        employeeBook.addEmployee("Имя", "Отчество", "Фамилия", 2, 48_750);
        employeeBook.addEmployee("Имя", "Отчество", "Фамилия", 3, 35_690);
        employeeBook.addEmployee("Имя", "Отчество", "Фамилия", 3, 33_480);
        employeeBook.addEmployee("Имя", "Отчество", "Фамилия", 3, 34_019);
        employeeBook.addEmployee("Имя", "Отчество", "Фамилия", 4, 18_220);
        employeeBook.addEmployee("Имя", "Отчество", "Фамилия", 4, 17_098);
        employeeBook.addEmployee("Имя", "Отчество", "Фамилия", 5, 18_056);
        employeeBook.addEmployee("Имя", "Отчество", "Фамилия", 5, 20_120);
//        employeeBook.addEmployee("b", "d", "s", 2,15);
//        employeeBook.printAllEmployees();
        employeeBook.print();
      employeeBook.sumSalary();
        System.out.println("Сумма зарплаты сотрудников " + employeeBook.sumSalary());
//        scanMinSalary();
//        scanMaxSalary();
//        midSalary();
//        printEmployeeNames();
//        indexSalary();
//        minDeptSal(3);
//        maxDeptSal(5);
//        sumDeptSal(2);
//        midDeptSal(4);
//        indexDeptSal(1, 15);
//        printDeptEmp(5);
        employeeBook.scanPoor(30000);
//        scanRich(30000);
    }




}