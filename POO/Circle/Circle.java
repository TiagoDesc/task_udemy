package POO.Circle;

public class Circle {

    public static final double PI = 3.14;

    public double circunference(double radius) {
        return 2 * PI * radius;
    }

    public double volume(double radius) {
        return 4 * PI * radius * radius * radius / 3;
    }

}
