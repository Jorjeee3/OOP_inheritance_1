package Employee;

public abstract class Employee {
    static String name;
    static int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    protected String getInfo() {
        return name + " gets " + salary + " per hour";
    }

    protected void setInfo(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    protected static String calculateHourSalary(int hours) {
        return name + " gets " + (hours * salary) + " per" + hours + " hours";
    }
}
