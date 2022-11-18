public class Rectangle extends Shape{

    private double perimeter;

    public Rectangle(double height, double width) {
        super(height, width);
        perimeter = (2*height) + (2*width);
//        setArea(height*width);
//        area = height * width;
    }


    public double getPerimeter() {
        return perimeter;
    }
}
