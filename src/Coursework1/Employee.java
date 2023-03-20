package Coursework1;

public class Employee {

    private String name;
    private String patronymic;
    private String surname;
    private int department;
    private int salary;

    public Employee(String name, String patronymic, String surname, int department, int salary) {
        this.name = name;
        this.patronymic = patronymic;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
    }



    public String getName() {
        return this.name;
    }

    public String getPatronymic() {
        return this.patronymic;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        return "Employee{" + new Counter().getId() +
                "name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", surname='" + surname + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }
}
