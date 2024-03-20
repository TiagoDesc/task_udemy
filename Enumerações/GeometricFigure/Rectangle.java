package Enumerações.GeometricFigure;

public class Rectangle extends Shape {

    private Double width;
    private double height;

    public Rectangle() {
        super();
    }

    public Rectangle(Color color, Double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public Double area() {
        return width * height;
    }

}
