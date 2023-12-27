package Array.ArrayPOO.Boarding;

import java.util.Scanner;

public class boarding_house {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rent vect[] = new Rent[10];

        System.out.print("How many rooms will be ranted? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Rent #" + i + ":");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Email: ");
            String email = sc.nextLine();
            System.out.println("Room: ");
            int roomNumber = sc.nextInt();

            // Rent rent = new Rent(name, email); "Draft".
            vect[roomNumber] = new Rent(name, email);
        }

        System.out.println();
        System.out.println("Busy rooms: ");
        for (int i = 0; i < 10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }

        sc.close();

    }

}
