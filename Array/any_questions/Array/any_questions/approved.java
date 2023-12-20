package Array.any_questions;

import java.util.Locale;
import java.util.Scanner;

public class approved {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Enter the number of students: ");
        int n = sc.nextInt();

        double avg;
        String name[] = new String[n];
        double grade1[] = new double[n];
        double grade2[] = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter student number %d details below: \n", i + 1);
            sc.nextLine();
            name[i] = sc.nextLine();
            System.out.print("Enter your first semester grade: ");
            grade1[i] = sc.nextDouble();
            System.out.print("Enter your second semester grade: ");
            grade2[i] = sc.nextDouble();
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            avg = (grade1[i] + grade2[i]) / 2;
            if (avg >= 6) {
                System.out.println("Approved students: " + name[i]);
                System.out.println("Your average is: " + avg);
            } else {
                System.out.println("Failed students: " + name[i]);
                System.out.println("Your average is: " + avg);
            }
        }

        sc.close();
    }
}
