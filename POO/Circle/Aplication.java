package POO.Circle;

import java.util.Scanner;

public class Aplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        System.out.println("Circumference: " + Circle.circunference(radius));
        System.out.println("Volume: " + Circle.volume(radius));
        System.out.println("PI Value: " + Circle.PI);
    }

}
