package ADVANCED.EX14_DEFINING_CLASSES.E02_CompanyRoster;

public class Employee {

    private String name;
    private double salary;
    private String position;
    private String department;
    private String email;
    private int age;

    private static String defaultEmail = "n/a";
    private static int defaultAge = -1;

    public Employee(String name, double salary, String position, String department, String email, int age) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = email;
        this.age = age;
    }

    public Employee(String name, double salary, String position, String department) {
        this(name, salary, position, department, defaultEmail, defaultAge);
    }

    public Employee(String name, double salary, String position, String department, String email) {
        this(name, salary, position, department, email, defaultAge);
    }

    public Employee(String name, double salary, String position, String department, int age) {
        this(name, salary, position, department, defaultEmail, age);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    public String getDepartment() {
        return department;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %s %d", this.name, this.salary, this.email, this.age);
    }
}
