package POO.Employee;

import java.util.Scanner;

public class salary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name: ");
        employee.name = sc.nextLine();
        System.out.print("Enter the Gross Salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Enter the tax: ");
        employee.tax = sc.nextDouble();

        System.out.println("Name: " + employee.toStringStatic());

        System.out.println();
        System.out.print("Which percentage to increase to salary? ");
        double percent = sc.nextDouble();
        employee.increaseSalary(percent);

        System.out.println("Update data: " + employee.toStringStatic());

        sc.close();
    }

}
