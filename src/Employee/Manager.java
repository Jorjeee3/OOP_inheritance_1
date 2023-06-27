package Employee;

public class Manager extends Employee {
    public Manager(String name, int salary) {
        super(name, salary);
    }

    public static String calculateMixedSalary(int hours, double procent) {
        return name + " gets " + (hours * salary) + " + " + procent + "%, per " + hours + " hours";
    }
}
