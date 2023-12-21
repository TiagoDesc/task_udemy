package Array.any_questions;

import java.util.Locale;
import java.util.Scanner;

public class people_data {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of people: ");
        int n = sc.nextInt();
        double bigger;
        double smaller;
        int f = 0;
        int m = 0;
        double avg = 0;
        double sum = 0;
        double height[] = new double[n];
        char gender[] = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Data of %d° person: \n", i + 1);
            System.out.print("Enter the height: ");
            height[i] = sc.nextDouble();
            System.out.print("Enter the gender: ");
            gender[i] = sc.next().charAt(0);
        }

        bigger = height[0];
        for (int i = 1; i < n; i++) {
            if (height[i] > bigger) {
                bigger = height[i];
            }
        }

        smaller = height[0];
        for (int i = 1; i < n; i++) {
            if (height[i] < smaller) {
                smaller = height[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (gender[i] == 'f' || gender[i] == 'F') {
                sum += height[i];
                f++;
            }
        }

        for (int i = 0; i < n; i++) {
            if (gender[i] == 'm' || gender[i] == 'M') {
                m++;
            }
        }

        avg = sum / f;

        System.out.println();
        System.out.println("The greatest height is: " + bigger + "m");
        System.out.println("The smallest height is:: " + smaller + "m");
        System.out.printf("The average height of woman is: %.2fm \n", avg);
        System.out.printf("The number of man is: %d", m);

        sc.close();
    }

}
