package Herança.People;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<People> list = new ArrayList<>();

        System.out.print("Enter the number of taxpayers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Taxpayer #" + i + " data:");
            System.out.print("Individual or company? (i/c)? ");
            char choise = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();
            if (choise == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                list.add(new Individual(name, anualIncome, healthExpenditures));
            } else {
                System.out.print("Number of employess: ");
                int numberEmployee = sc.nextInt();
                list.add(new Company(name, anualIncome, numberEmployee));
            }

        }

        System.out.println();
        System.out.println("TAXES PAID:");
        for (People people : list) {
            System.out.println(people.getName());
            System.out.println(String.format("$%.2f", people.tax()));

        }
        double sum = 0;
        for (People people : list) {
            sum += people.tax();
            System.out.print("TOTAL TAXES: $");
            System.out.println(sum);

        }
    }

}
