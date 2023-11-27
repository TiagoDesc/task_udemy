package POO.Employee;

import java.util.Scanner;

public class salary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        employee emp = new employee();

        System.out.print("Enter the name: ");
        emp.name = sc.nextLine();
        System.out.print("Enter the Gross Salary: ");
        emp.grossSalary = sc.nextDouble();
        System.out.print("Enter the tax: ");
        emp.tax = sc.nextDouble();

        System.out.println("Name: " + emp.name + ", $" + emp.liquidSalary());

        System.out.println();
        System.out.print("Which percentage to increase to salary? ");
        double percent = sc.nextDouble();
        emp.increaseSalary(percent);

        System.out.println("Update data: " + emp.name + ", $ " + emp.liquidSalary());

    }

}
