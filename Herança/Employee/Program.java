package Herança.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<Employee>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Employee #" + i + " data:");
            System.out.print("Outsourced (y/n)?");
            char answer = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            if (answer == 'y' || answer == 'Y') {
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                // Employee emp = new OutsourcedEmployee(name, hours, valuePerHour,
                // additionalCharge);
                // <-------- Same function, just a new way to create.
                list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
            } else {
                // emp = new Employee(name, hours, valuePerHour);
                // <-------- Same function, just a new way to create.
                list.add(new Employee(name, hours, valuePerHour));
            }

        }

        System.out.println();
        System.out.println("PAYMENTS:");
        for (Employee emp : list) {
            System.out.println(emp.getName() + " -$ " + String.format("%.2f", emp.payment()));
        }
    }

}
