package day0818_01_abstract;

public class Rectange extends Shape{
    private double width;
    private double height;
    public Rectange(){}
    public Rectange(double width, double height, String name) {
        super(name);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        double dArea = width * height;
        return dArea;
    }

    @Override
    public double perimeter() {
        double dPerimeter = (width+height)*2;
        return dPerimeter;
    }
}
