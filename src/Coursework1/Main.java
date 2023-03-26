package Coursework1;

public class Main {

    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.addEmployee("Имя1", "Отчество1", "Фамилия1", 1, 120_580);
        employeeBook.addEmployee("Имя2", "Отчество2", "Фамилия2", 2, 67_035);
        employeeBook.addEmployee("Имя3", "Отчество3", "Фамилия3", 2, 48_750);
        employeeBook.addEmployee("Имя4", "Отчество4", "Фамилия4", 3, 35_690);
        employeeBook.addEmployee("Имя5", "Отчество5", "Фамилия5", 3, 33_480);
        employeeBook.addEmployee("Имя6", "Отчество6", "Фамилия6", 3, 34_019);
        employeeBook.addEmployee("Имя7", "Отчество7", "Фамилия7", 4, 18_220);
        employeeBook.addEmployee("Имя8", "Отчество8", "Фамилия8", 4, 17_098);
        employeeBook.addEmployee("Имя9", "Отчество9", "Фамилия9", 5, 18_056);
        employeeBook.addEmployee("Имя10", "Отчество10", "Фамилия10", 5, 20_120);
        employeeBook.printAllEmployee();
//        employeeBook.removeEmployee("Фамилия2 Имя2 Отчество2", 2);
//        employeeBook.printAllEmployee();
//        employeeBook.addEmployee("er", "iu", "hu",4,100);
//        employeeBook.printAllEmployee();
employeeBook.changeEmployeeSalary("Фамилия3 Имя3 Отчество3");
employeeBook.changeEmployeeDepartment("Фамилия3 Имя3 Отчество3");
//      employeeBook.sumSalary();
//        System.out.println("Сумма зарплаты сотрудников " + employeeBook.sumSalary());
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
//        employeeBook.scanPoor(30000);
//        scanRich(30000);
    }




}