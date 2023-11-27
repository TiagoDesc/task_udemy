package POO.Rectangle;

public class rectangle {
    public double width;
    public double height;

    public double Area(){
        return width * height;
    }

    public double Perimeter (){
        return (width * 2) + (height * 2);
    }

    public double Diagonal (){
        return Math.sqrt(width * width + height * height);
    }
}
