package Array.Alturas;

import java.util.Locale;
import java.util.Scanner;

public class Aplication {

    public static void main(String[] args) {

        // Enter the number of people.
        // Instantiate the arrays - names, ages, heights.
        // Catch people´s data - Scanner;
        // 'for' structure to check the number of people under 16
        // years...
        // and structure to catch the full heigth.
        // Make the average height.
        // Calculate the percentage of people under 16 years old.
        // Print the average height.
        // Print the percentage of people under 16 years old.
        // Print the names of people under 16 years old.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, smallNumber;
        double totalHeight, avgHeight, percentSmall;

        System.out.println("Enter the number of people: ");
        n = sc.nextInt();

        String name[] = new String[n];
        int age[] = new int[n];
        double height[] = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Data of %d° person: \n", i + 1);
            System.out.print("Name: ");
            name[i] = sc.next();
            System.out.print("Age: ");
            age[i] = sc.nextInt();
            System.out.print("Height: ");
            height[i] = sc.nextDouble();
        }

        smallNumber = 0;
        totalHeight = 0;
        for (int i = 0; i < n; i++) {
            if (age[i] < 16) {
                smallNumber++;
            }
            totalHeight += height[i];
        }

        avgHeight = totalHeight / n;
        percentSmall = ((double) smallNumber / n) * 100;

        System.out.printf("The average height is %.2fm\n", avgHeight);
        System.out.printf("The number of people under 16 years old is: %.1f%%\n", percentSmall);

        for (int i = 0; i < n; i++) {
            if (age[i] < 16) {
                System.out.println("Under 16 years old: " + name[i]);
            }
        }
        sc.close();
    }
}
