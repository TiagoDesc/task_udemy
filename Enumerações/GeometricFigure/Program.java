package Enumerações.GeometricFigure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char shape = ' ';
        List<Shape> list = new ArrayList<>();
        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Shape #" + 1 + " data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            if (shape == 'r') {
                shape = sc.next().charAt(0);
                System.out.print("Color (BLACK/BLUE/RED): ");
                sc.nextLine();
                String color = sc.nextLine();
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                Shape rectangle = new Rectangle(Color.valueOf(color), width, height);
            } else {
                System.out.print("Color (BLACK/BLUE/RED): ");
                sc.nextLine();
                String color = sc.nextLine();
                double radius = sc.nextDouble();
                Shape circle = new Circle(Color.valueOf(color), radius);
            }

            for (Shape sh : list) {
                System.out.println("SHAPE AREAS:");
                System.out.println(sh.area());
            }

        }

    }
}
