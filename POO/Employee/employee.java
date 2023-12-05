package POO.Employee;

public class employee {

    public static String name;
    public static double grossSalary;
    public static double tax;

    public static double liquidSalary() {
        return grossSalary - tax;
    }

    public static void increaseSalary(double percent) {
        grossSalary += grossSalary * percent / 100;

    }

    public static String toStringStatic() {
        return name + ", $" + liquidSalary();
    }

}
