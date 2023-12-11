package Array.ArrayPOO.Product;

import java.util.Scanner;

import POO.Product.product;

public class Aplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of products: ");
        int n = sc.nextInt();
        System.out.println();
        ProductArray vect[] = new ProductArray[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Enter the name of product number " + (i + 1) + ":");
            String name = sc.nextLine();
            System.out.println("Enter the price of product number " + (i + 1) + ":");
            double price = sc.nextDouble();
            vect[i] = new ProductArray(name, price);
        }

        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += vect[i].getPrice();
        }

        double average = sum / n;

        System.out.printf("The average product is $%.2f.", average);

    }

}
