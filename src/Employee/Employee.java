package Employee;

public class Employee {
    protected String name;
    protected int salary;

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

    protected int getSalary(int hours) {
        return (hours * salary);
    }

}
