package Coursework1;

public class Employee {
    private int id;
    private String name;
    private String patronymic;
    private String surname;
    private String fullName;
    private int department;
    private int salary;

    public Employee(String name, String patronymic, String surname, int department, int salary) {
        this.id = Counter.getId();
        this.name = name;
        this.patronymic = patronymic;
        this.surname = surname;
        this.fullName = surname + " " + name + " " + patronymic;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
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

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return this.department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "id= " + id + ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                " name='" + name + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }
}
