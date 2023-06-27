package Employee;

public class Main {
    public static void main(String[] args) {
        Manager valeriy = new Manager("valeriy", 15);
        HR gena = new HR("Gena", 15);
        Turner vasya = new Turner("Gena", 15);

        System.out.println(valeriy.getSalary(20));
        System.out.println(gena.getSalary(20));
        System.out.println(vasya.getSalary(20));
    }
}
