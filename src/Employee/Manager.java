package Employee;

public class Manager extends Employee {

    private int bonus = 22;
    public Manager(String name, int salary) {
        super(name, salary);
    }

    @Override
    protected int getSalary(int hours) {
        return super.getSalary(20) + (super.getSalary(20) * bonus / 50);
    }
}
