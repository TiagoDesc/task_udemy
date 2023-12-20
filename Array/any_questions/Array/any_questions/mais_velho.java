package Array.any_questions;

import java.util.Scanner;

public class mais_velho {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int old = 0;
        System.out.println("Enter the number of people: ");
        int n = sc.nextInt();

        String name[] = new String[n];
        int age[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Data of %d° person: \n", i + 1);
            System.out.print("Name: ");
            sc.nextLine();
            name[i] = sc.nextLine();
            System.out.print("Age: ");
            age[i] = sc.nextInt();
        }

        old = age[0];
        for (int i = 1; i < n; i++) {
            if (age[i] > old) {
                old = age[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (old == age[i]) {
                System.out.println("The more old is: " + name[i]);
            }
        }

        sc.close();

    }

}
