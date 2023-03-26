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
            if (employee[i] == null){
                Employee newEmployee = new Employee(name, patronymic, surname, department, salary);
                employee[size++] = newEmployee;
                break;
            }
            if (size >= employee.length) {
                System.out.println("Нельзя добавить сотрудника, закончилось место");
            }
        }
    }
    public void removeEmployee(String fullName, int id) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getFullName().equals(fullName) || employee.equals(id) ) {
                System.out.println(employee[i].getFullName() + " удален");
                System.arraycopy(employee, i + 1, employee, i, size - i - 1);
                employee[size - 1] = null;
                size--;
                return;
            }
        }
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
            int j = i.getSalary();
            sumSalary += j;
        }
        return sumSalary;
    }

    public void scanMinSalary() {
        int minSalary = employee[0].getSalary();
        for (Employee i : employee) {
            int j = i.getSalary();
            if (j < minSalary) {
                minSalary = j;
            }
        }
        System.out.println("Минимальная зарплата сотрудника = " + minSalary);
    }

    public void scanMaxSalary() {
        int maxSalary = employee[0].getSalary();
        for (Employee i : employee) {
            int j = i.getSalary();
            if (j > maxSalary) {
                maxSalary = j;
            }
        }
        System.out.println("Максимальная зарплата сотрудника = " + maxSalary);
    }

    public void midSalary() {
        int midSalary = sumSalary();
        midSalary = midSalary / employee.length;
        System.out.println("Средняя зарплата = " + midSalary);
    }

    public void printEmployeeNames() {
        for (Employee i : employee) {
            String n = i.getName();
            String p = i.getPatronymic();
            String s = i.getSurname();
            System.out.println(n + " " + p + " " + s);
        }
    }

    public void indexSalary() {
        for (Employee i : employee) {
            int j = i.getSalary();
            int index = (j / 100) * 15;
            j = j + index;
            System.out.println("При повышении на 15%, зарплата соответственно " + j);
        }
    }

    public void minDeptSal(int dept) {
        int minSalary = Integer.MAX_VALUE;
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

    public void maxDeptSal(int dept) {
        int maxSalary = Integer.MIN_VALUE;
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

    public void sumDeptSal(int dept) {
        int sumDeptSalary = 0;
        for (Employee i : employee) {
            if (i.getDepartment() == dept) {
                sumDeptSalary += i.getSalary();
            }

        }
        System.out.println("Затраты на зарплату в отделе " + sumDeptSalary);
    }

    public void midDeptSal(int dept) {
        int sumDeptSalary = 0;
        int midDeptSalary = 0;
        int count = 0;
        for (Employee i : employee) {
            int j = i.getDepartment();
            if (j == dept) {
                int a = i.getSalary();
                count++;
                sumDeptSalary += a;
                midDeptSalary = sumDeptSalary / count;
            }

        }
        System.out.println("Средняя зарплата в отделе " + midDeptSalary);
    }

    public void indexDeptSal(int dept, int percent) {
        for (Employee i : employee) {
            int j = i.getDepartment();
            if (j == dept) {
                int a = i.getSalary();
                int index = (a / 100) * percent;
                a = a + index;
                System.out.println("При повышении на " + percent + "%, зарплата соответственно " + a);
            }
        }
    }

    public void printDeptEmp(int dept) {
        for (Employee i : employee) {
            int j = i.getDepartment();
            if (j == dept) {
                String n = i.getName();
                String p = i.getPatronymic();
                String s = i.getSurname();
                int a = i.getSalary();
                System.out.println(n + " " + p + " " + s + " " + a);
            }
        }
    }

    public void scanPoor(int limitSalary) {
        for (Employee i : employee) {
            int j = i.getSalary();
            String n = i.getName();
            String p = i.getPatronymic();
            String s = i.getSurname();
            int d = i.getDepartment();
            int a = i.getSalary();
            if (j < limitSalary) {
                System.out.println(i.toString());
            }
        }
    }

    public void scanRich(int limitSalary) {
        for (Employee i : employee) {
            int j = i.getSalary();
            String n = i.getName();
            String p = i.getPatronymic();
            String s = i.getSurname();
            int d = i.getDepartment();
            int a = i.getSalary();
            if (j >= limitSalary) {
                System.out.println(i.getId() + " " + n + " " + p + " " + s + " " + d + " " + a);
            }
        }
    }


}
