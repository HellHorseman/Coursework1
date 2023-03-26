package Coursework1;

public class EmployeeBook {
    private Employee[] employee;

    private int size;

    public EmployeeBook() {
        this.employee = new Employee[10];
    }

    public Employee[] getEmployee() {
        return employee;
    }

    public void setEmployee(Employee[] employee) {
        this.employee = employee;
    }

    public void addEmployee(String name, String patronymic, String surname, int department, int salary) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                Employee newEmployee = new Employee(name, patronymic, surname, department, salary);
                employee[size++] = newEmployee;
                break;
            }
            if (size >= employee.length) {
                System.out.println("Нельзя добавить сотрудника, закончилось место");
            }
        }
        System.out.println();
    }

    public void removeEmployee(String fullName, int id) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getFullName().equals(fullName) || employee.equals(id)) {
                System.out.println(employee[i].getFullName() + " удален");
                System.arraycopy(employee, i + 1, employee, i, size - i - 1);
                employee[size - 1] = null;
                size--;
                return;
            }
        }
        System.out.println();
    }

    public void changeEmployeeSalary(String fullName) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getFullName().equals(fullName)) {
                int setter = 0;
                employee[i].setSalary(setter);
                System.out.println(employee[i]);
                return;
            }
        }
        System.out.println();
    }

    public void changeEmployeeDepartment(String fullName) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getFullName().equals(fullName)) {
                int setter = 0;
                employee[i].setDepartment(setter);
                System.out.println(employee[i]);
                return;
            }
        }
        System.out.println();
    }

    public void printEmployeeToDepartment() {
        for (Employee i : employee) {
            switch (i.getDepartment()) {
                case (1):
                    System.out.println("Отдел " + i.getDepartment() + " " + i.getFullName());
                    break;
                case (2):
                    System.out.println("Отдел " + i.getDepartment() + " " + i.getFullName());
                    break;
                case (3):
                    System.out.println("Отдел " + i.getDepartment() + " " + i.getFullName());
                    break;
                case (4):
                    System.out.println("Отдел " + i.getDepartment() + " " + i.getFullName());
                    break;
                case (5):
                    System.out.println("Отдел " + i.getDepartment() + " " + i.getFullName());
                    break;
            }

        }
        System.out.println();
    }

    public void printAllEmployee() {
        for (int i = 0; i < size; i++) {
            Employee data = employee[i];
            System.out.println(data.toString());
        }
        System.out.println();
    }


    public int sumSalary() {
        int sumSalary = 0;
        for (Employee i : employee) {
            int sal = i.getSalary();
            sumSalary += sal;
        }
        return sumSalary;
    }

    public void scanMinSalary() {
        int minSalary = employee[0].getSalary();
        for (Employee i : employee) {
            if (i.getSalary() < minSalary) {
                minSalary = i.getSalary();
            }
        }
        System.out.println("Минимальная зарплата сотрудника = " + minSalary);
        System.out.println();
    }

    public void scanMaxSalary() {
        int maxSalary = employee[0].getSalary();
        for (Employee i : employee) {
            if (i.getSalary() > maxSalary) {
                maxSalary = i.getSalary();
            }
        }
        System.out.println("Максимальная зарплата сотрудника = " + maxSalary);
        System.out.println();
    }

    public void midSalary() {
        int midSalary = sumSalary();
        midSalary = midSalary / employee.length;
        System.out.println("Средняя зарплата = " + midSalary);
        System.out.println();
    }

    public void printEmployeeNames() {
        for (Employee i : employee) {
            System.out.println(i.getFullName());
        }
        System.out.println();
    }

    public void indexSalary() {
        for (Employee i : employee) {
            int index = (i.getSalary() / 100) * 15;
            int sal = i.getSalary() + index;
            System.out.println("При повышении на 15%, зарплата соответственно " + sal);
        }
        System.out.println();
    }

    public void minDeptSal(int dept) {
        int minSalary = Integer.MAX_VALUE;
        for (Employee i : employee) {
            if (i.getDepartment() == dept) {
                if (i.getSalary() < minSalary) {
                    minSalary = i.getSalary();
                }
            }
        }
        System.out.println("Минимальная зарплата в отделе " + minSalary);
        System.out.println();
    }

    public void maxDeptSal(int dept) {
        int maxSalary = Integer.MIN_VALUE;
        for (Employee i : employee) {
            if (i.getDepartment() == dept) {
                if (i.getSalary() > maxSalary) {
                    maxSalary = i.getSalary();
                }
            }
        }
        System.out.println("Максимальная зарплата в отделе " + maxSalary);
        System.out.println();
    }

    public void sumDeptSal(int dept) {
        int sumDeptSalary = 0;
        for (Employee i : employee) {
            if (i.getDepartment() == dept) {
                sumDeptSalary += i.getSalary();
            }

        }
        System.out.println("Затраты на зарплату в отделе " + sumDeptSalary);
        System.out.println();
    }

    public void midDeptSal(int dept) {
        int sumDeptSalary = 0;
        int midDeptSalary = 0;
        int count = 0;
        for (Employee i : employee) {
            if (i.getDepartment() == dept) {
                int sal = i.getSalary();
                count++;
                sumDeptSalary += sal;
                midDeptSalary = sumDeptSalary / count;
            }

        }
        System.out.println("Средняя зарплата в отделе " + midDeptSalary);
        System.out.println();
    }

    public void indexDeptSal(int dept, int percent) {
        for (Employee i : employee) {
            if (i.getDepartment() == dept) {
                int index = (i.getSalary() / 100) * percent;
                int sal = i.getSalary() + index;
                System.out.println("При повышении на " + percent + "%, зарплата соответственно " + sal);
            }
        }
        System.out.println();
    }

    public void printDeptEmp(int dept) {
        for (Employee i : employee) {
            if (i.getDepartment() == dept) {
                int a = i.getSalary();
                System.out.println(i.getFullName() + " " + i.getSalary());
            }
        }
        System.out.println();
    }

    public void scanPoor(int limitSalary) {
        for (Employee i : employee) {
            if (i.getSalary() < limitSalary) {
                System.out.println(i.toString());
            }
        }
        System.out.println();
    }

    public void scanRich(int limitSalary) {
        for (Employee i : employee) {
            if (i.getSalary() >= limitSalary) {
                System.out.println(i.toString());
            }
        }
        System.out.println();
    }


}
