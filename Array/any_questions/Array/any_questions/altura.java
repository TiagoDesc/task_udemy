package Array.any_questions;

import java.util.Locale;
import java.util.Scanner;

public class altura {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of selected people to see their height and average: ");
        int n = sc.nextInt();
        double vect[] = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the height of people number: " + (i + 1));
            vect[i] = sc.nextDouble();
        }

        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += vect[i];
        }

        double average = sum / n;

        System.out.printf("The heigth average is: %.2fm.", average);

        sc.close();
    }

}
