package Employee;

public class HR extends Employee {

    private int bonus = 22;

    public HR(String name, int salary) {
        super(name, salary);
    }
    @Override
    protected int getSalary(int hours) {
        return super.getSalary(20) + (super.getSalary(20) * bonus / 100);
    }
}
