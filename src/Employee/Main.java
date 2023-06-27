package Employee;

public class Main {
    public static void main(String[] args) {
        Manager valeriy = new Manager("valeriy", 15);
        HR gena = new HR("Gena", 22);

        System.out.println(gena.getInfo());
    }
}
