package Array.any_questions;

import java.util.Scanner;

public class boarding_house {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many rooms will be ranted? ");
        int n = sc.nextInt();
        String name[] = new String[n];
        String email[] = new String[n];
        int room[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Rent " + (i + 1) + "#:");
            System.out.print("Name: ");
            sc.nextLine();
            name[i] = sc.nextLine();
            System.out.print("Email: ");
            email[i] = sc.nextLine();
            System.out.print("Room: ");
            room[i] = sc.nextInt();

        }

        System.out.println("Busy Room: ");
        for (int i = 0; i < n; i++) {
            System.out.println(room[i] + name[i] + email[i]);
        }

    }

}
