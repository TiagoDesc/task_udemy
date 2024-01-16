package POO.Rectangle;

import java.util.Scanner;

public class aplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        rectangle rectangle = new rectangle();
        System.out.println("Enter rectangle width and height: ");

        System.out.println("Enter the width: ");
        rectangle.width = sc.nextDouble();

        System.out.println("Enter the height: ");
        rectangle.height = sc.nextDouble();

        System.out.println("Area: " + rectangle.Area());

        System.out.println("Perimeter: " + rectangle.Perimeter());

        System.out.println("Diagonal: " + rectangle.Diagonal());

        sc.close();

    }
}
