package Array.any_questions;

import java.util.Scanner;

public class people_data {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of people: ");
        int n = sc.nextInt();
        double bigger;
        double smaller;
        double f = 0;
        double m = 0;
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

        double avg = 0;
        double sum = 0;
        for (int i = 0; i < n; i++) {
            if (gender[i] == 'f') {
                sum += height[i];
                f++;
            }
        }

        for (int i = 0; i < n; i++) {
            if (gender[i] == 'm') {
                m++;
            }
        }

        avg = sum / f;

        System.out.println("The height bigger is: \n" + bigger);
        System.out.println("The height smaller is: \n" + smaller);
        System.out.println("The height average is: \n" + avg);
        System.out.println("The amouunt of mans is: " + m);

        sc.close();
    }

}
