package Array.Alturas;

import java.util.Scanner;

public class Aplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of people: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Data of " + (i + 1) + " person: ");
            System.out.print("Name: ");
            String name = sc.nextLine();
            sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Height: ");
            double height = sc.nextDouble();
        }
    }

}
