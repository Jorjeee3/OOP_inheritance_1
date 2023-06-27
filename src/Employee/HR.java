package Employee;

public class HR extends Employee {
    public HR(String name, int salary) {
        super(name, salary);
    }
    
    protected static String calculateHourSalary(int hours) {
        return name + " gets " + (hours * salary) + " per" + hours + " hours";
    }

    public static String calculateProcentSalary(double procent) {
        return name + " gets " + procent + "%, per month";
    }
}
