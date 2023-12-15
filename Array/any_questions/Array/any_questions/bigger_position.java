package Array.any_questions;

import java.util.Scanner;

public class bigger_position {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, position;
        double bigger;
        System.out.println("How many numbers will you enter: ");
        n = sc.nextInt();
        double vect[] = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the number: ");
            vect[i] = sc.nextDouble();
        }

        bigger = vect[0];
        position = 0;

        for (int i = 1; i < n; i++) {
            if (vect[i] > bigger) {
                bigger = vect[i];
                position = i;
            }
        }

        System.out.printf("Value bigger = %.1f\n", bigger);
        System.out.printf("Position of the highest value = %d\n", position);

        sc.close();
    }
}
