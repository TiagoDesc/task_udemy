package Questions_exam;

import java.util.Scanner;

public class aposentadoria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double goal;
        double contribuition;
        double rate;

        System.out.println("Type your goal: ");
        goal = sc.nextDouble();
        System.out.println("Type your monthly contribuition: ");
        contribuition = sc.nextDouble();
        System.out.println("Type the rate in month: ");
        rate = sc.nextDouble();

        double sale = 0;
        int month = 0;

        while (sale < goal) {
            sale += contribuition;
            sale += sale * (rate / 100);
            month++;
        }

        int year = month / 12;
        int monthLeft = month % 12;

        System.out.println("You will reach the goal in " + year + " year(s) and " + monthLeft + " months.");
    }
}
