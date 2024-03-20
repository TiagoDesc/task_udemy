package Enumerações.GeometricFigure;

public class Rectangle extends Shape {

    private Double width;
    private double height;

    @Override
    public Double area() {
        return width * height;
    }

}
