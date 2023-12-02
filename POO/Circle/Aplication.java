package POO.Circle;

import java.util.Scanner;

public class Aplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle circle = new Circle();

        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        System.out.println("Circumference: " + circle.circunference(radius));
        System.out.println("Volume: " + circle.volume(radius));
        System.out.println("PI Value: " + circle.PI);
    }

}
